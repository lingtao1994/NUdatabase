package dao;

import db.DbClose;
import db.DbConn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by LT on 2018/11/16
 */
public class UosOfferingDao {

    public static void enrollList(int year, String semester){
        boolean flag;
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try{
            conn = DbConn.getconn();
            cstmt = conn.prepareCall("Call enrolls(?,?)");
            cstmt.setString(1, semester);
            cstmt.setInt(2, year);
            flag = cstmt.execute();
            while(flag){
                rs = cstmt.getResultSet();
                while(rs.next()){
                    System.out.println("UosCode;" + rs.getString("UosCode"));
                    System.out.println(rs.getString("Semester"));
                    System.out.println(rs.getInt("Year"));
                }
                flag = cstmt.getMoreResults();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DbClose.transClose(conn, cstmt, rs);
        }
        return;
    }

    public boolean enrollCheck(){

    }
}
