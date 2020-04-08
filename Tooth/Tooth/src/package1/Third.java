/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static package1.Second.db;
import static package1.ThirdForm.checkbox1;
import static package1.ThirdForm.checkbox2;
import static package1.ThirdForm.checkbox3;
import static package1.ThirdForm.jComboBox2;
import static package1.ThirdForm.jTable3;
import static package1.ThirdForm.jTable4;
import static package1.ThirdForm.model3;
import static package1.ThirdForm.model1;
import static package1.ThirdForm.model2;
import static package1.ThirdForm.model4;

/**
 *
 * @author Daniil
 */
public class Third
{
   public static void getObj() throws ClassNotFoundException, SQLException{
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select service_id,service_name,service_price from services where service_type = 1");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model2.addRow(new Object[]{rs.getString("service_id"),rs.getString("service_name"),rs.getString("service_price")});
       }
    }
   public static void getAdv() throws ClassNotFoundException, SQLException{
         db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select service_id,service_name,service_price from services where service_type = 2");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model2.addRow(new Object[]{rs.getString("service_id"),rs.getString("service_name"),rs.getString("service_price")});
       }
    }
     public static void getDiscounts() throws ClassNotFoundException, SQLException{
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select disc_id,disc_name,disc_size from discount where disc_id > 0");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model1.addRow(new Object[]{rs.getString("disc_id"),rs.getString("disc_name"),rs.getString("disc_size")});
       }
    }
     public static void getActions() throws ClassNotFoundException, SQLException{
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select act_id,act_name,act_start_date,act_finish_date,act_bonus from actions where act_id > 0");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model1.addRow(new Object[]{rs.getString("act_id"),rs.getString("act_name"),rs.getString("act_start_date"),rs.getString("act_finish_date"),rs.getString("act_bonus")});
       }
    }
    public static void FindPatients(String str) throws ClassNotFoundException, SQLException{
        db = new DB();
        model3 = new DefaultTableModel();
        model3.addColumn("ID пациента");
        model3.addColumn("Фамилия пациента");
        model3.addColumn("Имя пациента");
        model3.addColumn("Отчество пациента");
        model3.addColumn("Пол");
        model3.addColumn("Дата рождения");
        model3.addColumn("Адрес регистрации");
        jTable3.setModel(model3);
        if(checkbox1.getState()){
        PreparedStatement ps = db.getConnection().prepareStatement("select patient_id,patient_fname,patient_lname,patient_mname,birthdate,address,gender from patient where patient_fname = ?");
               ps.setString(1,str);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model3.addRow(new Object[]{rs.getString("patient_id"),rs.getString("patient_fname"),rs.getString("patient_lname"),rs.getString("patient_mname"),rs.getString("gender"),rs.getString("birthdate"),rs.getString("address")});
       }
        }
        if(checkbox2.getState()){
        PreparedStatement ps = db.getConnection().prepareStatement("select patient_id,patient_fname,patient_lname,patient_mname,birthdate,address,gender from patient where patient_lname = ?");
          ps.setString(1,str);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model3.addRow(new Object[]{rs.getString("patient_id"),rs.getString("patient_fname"),rs.getString("patient_lname"),rs.getString("patient_mname"),rs.getString("gender"),rs.getString("birthdate"),rs.getString("address")});
       }
        }
        if(checkbox3.getState()){
        PreparedStatement ps = db.getConnection().prepareStatement("select patient_id,patient_fname,patient_lname,patient_mname,birthdate,address,gender from patient where patient_mname = ?");
          ps.setString(1,str);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model3.addRow(new Object[]{rs.getString("patient_id"),rs.getString("patient_fname"),rs.getString("patient_lname"),rs.getString("patient_mname"),rs.getString("gender"),rs.getString("birthdate"),rs.getString("address")});
       }
        }
    }
    public static void FindPatients() throws ClassNotFoundException, SQLException{
        db = new DB();
        model3 = new DefaultTableModel();
        model3.addColumn("ID пациента");
        model3.addColumn("Фамилия пациента");
        model3.addColumn("Имя пациента");
        model3.addColumn("Отчество пациента");
        model3.addColumn("Пол");
        model3.addColumn("Дата рождения");
        model3.addColumn("Адрес регистрации");
        jTable3.setModel(model3);
        PreparedStatement ps = db.getConnection().prepareStatement("select patient_id,patient_fname,patient_lname,patient_mname,birthdate,address,gender from patient");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           model3.addRow(new Object[]{rs.getString("patient_id"),rs.getString("patient_fname"),rs.getString("patient_lname"),rs.getString("patient_mname"),rs.getString("gender"),rs.getString("birthdate"),rs.getString("address")});
       
        }
    }
    public static void getSchedule(List<String>sch,String fio) throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select s.sch_time from schedule_slot s join records r on s.id_schedule = r.id_schedule where r.doc_id = (select id from employee where fname = ? and lname = ? and mname = ?)  and r.paid_status = ? and s.sch_date = curdate() and r.compl_status= ? order by s.sch_time");
                    ps.setString(1, fio.split(" ")[0]);
                    ps.setString(2, fio.split(" ")[1]);
                    ps.setString(3, fio.split(" ")[2]);
                       ps.setString(4,"paid");
                       ps.setString(5,"not complete");
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("s.sch_time");
                        sch.add(ad);
                        ad = "";
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
}
    public static void getPaC(String fio,String time) throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select p.patient_fname,p.patient_lname,p.patient_mname,r.comment,s.service_name from records r join patient p on r.patient_id = p.patient_id join services s on r.service_id = s.service_id where r.id_schedule = (select  sc.id_schedule from schedule_slot sc where  sc.sch_date = curdate() and sc.sch_time = ?) and r.compl_status = ?");
                        ps.setString(1,time);
                        ps.setString(2,"not complete");
                    ResultSet rs = ps.executeQuery();
                    while (rs.next())
                    {
                        ThirdForm.str = rs.getString("p.patient_fname")+" "+rs.getString("p.patient_lname")+" "+rs.getString("p.patient_mname");
                        ThirdForm.str1 = rs.getString("r.comment");
                        ThirdForm.jComboBox2.removeAllItems();
                         ThirdForm.jComboBox2.addItem(rs.getString("s.service_name"));
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
}
    public static void add(String doc,String patient, String time,String service,String comm)throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("insert into compl(id_doc,patient_id,id_schedule,id_serv,comm) values((select doc_id from records where id_schedule = (select id_schedule from schedule_slot where sch_date=curdate() and sch_time=?)),(select patient_id from records where id_schedule = (select id_schedule from schedule_slot where sch_date=curdate() and sch_time=?)),(select id_schedule from records where id_schedule = (select id_schedule from schedule_slot where sch_date=curdate() and sch_time=?)),(select service_id from records where id_schedule = (select id_schedule from schedule_slot where sch_date=curdate() and sch_time=?)),?)");
                        ps.setString(1, time);
                        ps.setString(2, time);
                        ps.setString(3, time);
                        ps.setString(4, time);
                          ps.setString(5, comm);
                    ps.execute();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void rr(String doc,String time,String pat)throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("update records set compl_status = ? where  id_schedule = (select id_schedule from schedule_slot where sch_date = curdate() and sch_time = ? )");
                    ps.setString(1,"complete");
                    ps.setString(2, time);
                    ps.execute();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void FindCompl(String FIO) throws ClassNotFoundException, SQLException{
        db = new DB();
        model4 = new DefaultTableModel();
        model4.addColumn("ID");
        model4.addColumn("Врач");
        model4.addColumn("Пациент");
        model4.addColumn("Дата посещения");
        model4.addColumn("Время посещения");
        model4.addColumn("Услуга");
        model4.addColumn("Комментарий");
        jTable4.setModel(model4);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(300);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(300);
        PreparedStatement ps = db.getConnection().prepareStatement("select co.id_compl,e.fname,e.lname,e.mname,sc.sch_date,sc.sch_time,s.service_name,co.comm from compl co join employee e on e.id = co.id_doc join services s on s.service_id = co.id_serv join schedule_slot sc on sc.id_schedule = co.id_schedule  where co.patient_id = (select patient_id from patient where patient_fname=? and patient_lname=? and patient_mname=?)");
        ps.setString(1,FIO.split(" ")[0]);
       ps.setString(2,FIO.split(" ")[1]);
         ps.setString(3,FIO.split(" ")[2]);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           String doc = rs.getString("e.fname")+" "+ rs.getString("e.lname")+" "+rs.getString("e.mname");
          model4.addRow(new Object[]{rs.getString("co.id_compl"),doc,FIO,rs.getString("sc.sch_date"),rs.getString("sc.sch_time"),rs.getString("s.service_name"),rs.getString("co.comm")});
       
        }
    }
}
