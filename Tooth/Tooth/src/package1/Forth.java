/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniil
 */
public class Forth
{
    public static DB db;
    public static void getServices(List<String>serv) throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select service_name from services");
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("service_name");
                        serv.add(ad);
                        ad = "";
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
   
    }
    public static void getCost(String str) throws ClassNotFoundException{
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select service_price from services where service_name=?");
                    ps.setString(1, str);
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ForthForm.cost = rs.getString("service_price");
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
   
    }
    public static void add(String FIO,String doctor,String service,String date,String time,String summ,String inp, String ost,String da,String a)throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("update checks set service_id =(select service_id from services where service_name = ?),summ = ?,inp = ?,ost = ? where (id_schedule = (select s.id_schedule from schedule_slot s where s.id_doctor = (select e.id from employee e where e.fname = ? and e.lname = ? and e.mname = ?) and sch_date=? and sch_time = ?)) ");
                    ps.setString(1, service);
                    ps.setString(2, summ);
                    ps.setString(3, inp);
                    ps.setString(4, ost);
                    ps.setString(5, doctor.split(" ")[0]);
                    ps.setString(6, doctor.split(" ")[1]);
                    ps.setString(7, doctor.split(" ")[2]);
                      ps.setString(8, date);
                      ps.setString(9, time);
                    ps.execute();
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
                    PreparedStatement ps = db.getConnection().prepareStatement("select sc.sch_time from schedule_slot sc join records r on sc.id_schedule = r.id_schedule where r.doc_id = (select id from employee where fname = ? and lname = ? and mname = ?)  and r.paid_status = ? order by sch_time");
                    ps.setString(1, fio.split(" ")[0]);
                    ps.setString(2, fio.split(" ")[1]);
                    ps.setString(3, fio.split(" ")[2]);
                       ps.setString(4, "not paid");
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("sc.sch_time");
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
    public static void rr(String doc,String date,String time,String pat,String serv)throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("update records set paid_status = ?, service_id = (select service_id from services where service_name = ?) where (id_schedule = (select s.id_schedule from schedule_slot s where s.id_doctor = (select e.id from employee e where e.fname = ? and e.lname = ? and e.mname = ?) and sch_date=? and sch_time = ?)) ");
                    ps.setString(1,"paid");
                    ps.setString(2,serv);
                    ps.setString(3, doc.split(" ")[0]);
                    ps.setString(4, doc.split(" ")[1]);
                    ps.setString(5, doc.split(" ")[2]);
                      ps.setString(6, date);
                      ps.setString(7, time);
                    ps.execute();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static void getDiscount(String disc) throws ClassNotFoundException, SQLException{
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select disc_size from discount where disc_name = ?");
         ps.setString(1,disc);
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
           ForthForm.discoun = Float.parseFloat(rs.getString("disc_size"))/100;
       }
    }
    public static void getPat(String fio,String date,String time) throws ClassNotFoundException, ParseException{
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                        Date d = sdf.parse(date);
                        sdf.applyPattern(NEW_FORMAT);
                        date  = sdf.format(d);
        try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select p.patient_fname,p.patient_lname,p.patient_mname,d.disc_name,a.act_name from records r join patient p on p.patient_id = r.patient_id join discount d on r.disc_id = d.disc_id join actions a on r.act_id=a.act_id where (r.id_schedule = (select s.id_schedule from schedule_slot s where s.id_doctor = (select e.id from employee e where e.fname = ? and e.lname = ? and e.mname = ?) and sch_date=? and sch_time = ?)) and r.paid_status = ? ");
                    ps.setString(1, fio.split(" ")[0]);
                    ps.setString(2, fio.split(" ")[1]);
                    ps.setString(3, fio.split(" ")[2]);
                      ps.setString(4, date);
                      ps.setString(5, time);
                       ps.setString(6, "not paid");
                        
                    ResultSet rs = ps.executeQuery();
                    rs.next();
                    ForthForm.jTextField1.setEditable(true);
                        ForthForm.jTextField1.setText(rs.getString("p.patient_fname")+" "+rs.getString("p.patient_lname")+" "+rs.getString("p.patient_mname"));
                        ForthForm.jTextField1.setEditable(false);
                        ForthForm.disc= rs.getString("d.disc_name");
                        ForthForm.act = rs.getString("a.act_name");
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
}
}
