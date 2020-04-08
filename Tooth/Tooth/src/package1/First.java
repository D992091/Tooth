
package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static package1.FirstForm.jLabel4;


public class First
        
{
    public static DB db;
    public static void getItem(List<String> item,String i) throws ClassNotFoundException{
         try
                {
                    db=new DB();
                    PreparedStatement ps = db.getConnection().prepareStatement("select fname,mname,lname from employee where role_code = ? order by fname");
                    ps.setString(1, i);
                    ResultSet rs = ps.executeQuery();
                    String ad = "";
                    while (rs.next())
                    {
                        ad += rs.getString("fname");
                        ad += " ";
                        ad += rs.getString("lname");
                        ad += " ";
                        ad += rs.getString("mname");
                        item.add(ad);
                        ad = "";
                    }
                    rs.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public static boolean check(String[] login,String password) throws ClassNotFoundException, SQLException{
        
        boolean r = false;
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select role_code,password_hash from employee where (fname = ? and lname=? and mname=?)");
       ps.setString(1,login[0]);
       ps.setString(2,login[1]);
       ps.setString(3,login[2]);
         ResultSet rs = ps.executeQuery();
       while (rs.next())
                    {
                        if(password.equals(rs.getString("password_hash"))){
                            new FirstForm().dispose();
                            r =  true;
                            FirstForm.status = rs.getString("role_code");
                        }
                        else{
                            FirstForm.jPasswordField1.removeAll();
                            jLabel4.setVisible(true);
                        }
                    }
                    rs.close();
                    return r;
    }
    public static boolean check(String password) throws ClassNotFoundException, SQLException{
        
        boolean r = false;
        db = new DB();
        PreparedStatement ps = db.getConnection().prepareStatement("select password_hash from employee where role_code = ?");
       ps.setString(1,"-2");
         ResultSet rs = ps.executeQuery();
       while (rs.next())
                    {
                        if(password.equals(rs.getString("password_hash"))){
                            new FirstForm().dispose();
                            r =  true;
                        }
                        else{
                            FirstForm.jPasswordField1.removeAll();
                            jLabel4.setVisible(true);
                        }
                    }
                    rs.close();
                    return r;
    }
    
}
