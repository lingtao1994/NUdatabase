package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by LT on 2018/11/12
 */
public class DbConn {

    public static Connection getconn(){
        Connection conn = null;

        String user = "root";
        String password = "Sam88200886";
        String url = "jdbc:mysql://localhost:3306/project3-nudb";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
