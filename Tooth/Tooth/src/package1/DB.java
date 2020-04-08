package package1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    final String URL = "jdbc:mysql://localhost:3306/tooth?useUnicode=true&useJDBCCompliantTimezoneShift=true"
            + "&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    final String URL = "jdbc:mysql://localhost:3306/tooth";

    final String USER = "root";
    final String PASS = "pass123";

    public Connection connection;

    public DB() throws ClassNotFoundException {
       
        try {
             Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка");
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
    }
    public Connection getConnection() {
        return connection;
    }
}
