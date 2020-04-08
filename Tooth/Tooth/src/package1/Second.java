package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static package1.SecondForm.checkbox1;
import static package1.SecondForm.checkbox2;
import static package1.SecondForm.checkbox3;
import static package1.SecondForm.jComboBox2;
import static package1.SecondForm.jComboBox3;
import static package1.SecondForm.jComboBox4;
import static package1.SecondForm.jComboBox5;
import static package1.SecondForm.jComboBox6;
import static package1.SecondForm.jInternalFrame3;
import static package1.SecondForm.jLabel7;
import static package1.SecondForm.jTable1;
import static package1.SecondForm.jTable3;
import static package1.SecondForm.jTextField8;
import static package1.SecondForm.model1;
import static package1.SecondForm.model2;
import static package1.SecondForm.model3;
import static package1.SecondForm.textArea1;

/**
 *
 * @author Daniil
 */
public class Second
{
    public static DB db;
    public static void add(String fname,String lname,String mname,String address,String birth, String gender)throws ClassNotFoundException{
         try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("insert into patient(patient_fname,patient_lname,patient_mname,address,gender,birthdate) values(?,?,?,?,?,?)");
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, mname);
                    ps.setString(4, address);
                    ps.setString(5, gender);
                    ps.setString(6, birth);
                    ps.execute();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                     jLabel7.setText("Ошибка добавления пациента!");
            jInternalFrame3.setVisible(true);
            SecondForm.patient = "0";
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
    public static void getItem(List<String>lst) throws ClassNotFoundException{
         try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select fname,mname,lname from employee where role_code = 1 order by fname");
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("fname");
                        ad += " ";
                        ad += rs.getString("lname");
                        ad += " ";
                        ad += rs.getString("mname");
                        lst.add(ad);
                        ad = "";
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void getSchedule(List<String>sch,String fio) throws ClassNotFoundException, ParseException{
        final String NEW_FORMAT = "dd-MM-yyyy";
        final String OLD_FORMAT = "yyyy-MM-dd"; 
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select sch_date from schedule_slot where id_doctor = (select id from employee where fname = ? and lname = ? and mname = ?) and sch_date - curdate() >= 0 order by sch_date");
                    ps.setString(1, fio.split(" ")[0]);
                    ps.setString(2, fio.split(" ")[1]);
                    ps.setString(3, fio.split(" ")[2]);
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("sch_date");
                        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(ad);
                        sdf.applyPattern(NEW_FORMAT);
                        ad  = sdf.format(d);
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
    public static void getSchedule(List<String>sch,String fio,String date) throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select sch_time from schedule_slot where id_doctor = (select id from employee where fname = ? and lname = ? and mname = ?) and sch_date = ? and status = ? order by sch_time");
                    ps.setString(1, fio.split(" ")[0]);
                    ps.setString(2, fio.split(" ")[1]);
                    ps.setString(3, fio.split(" ")[2]);
                      ps.setString(4, date);
                      ps.setString(5, "free");
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("sch_time");
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
    public static void getDiscounts(List<String>disc,String cat) throws ClassNotFoundException, SQLException{
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select disc_name from discount where category = ? and disc_id > 0");
        ps.setString(1, cat);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           disc.add(rs.getString("disc_name"));
       }
    }
    public static void getActions(List<String>act,String dat) throws ClassNotFoundException, SQLException, ParseException{
        db = new DB();
                        System.out.println(dat);
        Calendar c = Calendar.getInstance();
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(dat);
        c.setTime(date1);
        System.out.println(date1);
        int day = c.get(Calendar.DAY_OF_WEEK)-2;
        if(day < 0){
            day = 6;
        }
        System.out.println(day);
        PreparedStatement ps = db.getConnection().prepareStatement("select act_name from actions where act_day = ?");
        ps.setString(1, Integer.toString(day));
        ResultSet rs = ps.executeQuery();
        
       while (rs.next()){
           act.add(rs.getString("act_name"));
       }
    }
    public static void wr(String doc,String date,String time,String FIO,String disc,String act,String comm)throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("insert into records(id_schedule,disc_id,act_id,doc_id,patient_id,comment,paid_status,compl_status) values((select id_schedule from schedule_slot where sch_date= ? and sch_time = ? ),(select disc_id from discount where disc_name= ?),(select act_id from actions where act_name = ?),(select id from employee where fname = ? and lname = ? and mname = ?),(select patient_id from patient where patient_fname = ? and patient_lname = ? and patient_mname = ?),?,?,?)");
                      ps.setString(1, date);
                    ps.setString(2, time);
                    ps.setString(3, disc);
                    ps.setString(4, act);
                    ps.setString(5, doc.split(" ")[0]);
                     ps.setString(6, doc.split(" ")[1]);
                      ps.setString(7, doc.split(" ")[2]);
                    ps.setString(8, FIO.split(" ")[0]);      
                    ps.setString(9, FIO.split(" ")[1]); 
                    ps.setString(10, FIO.split(" ")[2]); 
                    ps.setString(11, comm);
                    ps.setString(12, "not paid");
                    ps.setString(13, "not complete");
                    ps.execute();
                    ps = db.getConnection().prepareStatement("insert into checks(id_schedule,disc_id,act_id,doc_id,patient_id) values((select id_schedule from schedule_slot where sch_date= ? and sch_time = ? ),(select disc_id from discount where disc_name= ?),(select act_id from actions where act_name = ?),(select id from employee where fname = ? and lname = ? and mname = ?),(select patient_id from patient where patient_fname = ? and patient_lname = ? and patient_mname = ?))");
                      ps.setString(1, date);
                    ps.setString(2, time);
                    ps.setString(3, disc);
                    ps.setString(4, act);
                    ps.setString(5, doc.split(" ")[0]);
                     ps.setString(6, doc.split(" ")[1]);
                      ps.setString(7, doc.split(" ")[2]);
                    ps.setString(8, FIO.split(" ")[0]);      
                    ps.setString(9, FIO.split(" ")[1]); 
                    ps.setString(10, FIO.split(" ")[2]); 
                    ps.execute();
                }
                catch (Exception ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void rr(String doc,String date,String time)throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("update schedule_slot set status = ? where id_doctor = (select id from employee where fname = ? and lname = ? and mname = ?) and sch_date = ? and sch_time = ?");
                    ps.setString(1,"not free");
                    ps.setString(2, doc.split(" ")[0]);
                    ps.setString(3, doc.split(" ")[1]);
                    ps.setString(4, doc.split(" ")[2]);
                    ps.setString(5, date);
                    ps.setString(6, time);
                    ps.execute();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void clean(){
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jTextField8.setText("");
        textArea1.setText("");
    }
}
