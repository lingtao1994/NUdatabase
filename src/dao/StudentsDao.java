package dao;

import db.DbClose;
import db.DbConn;
import entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by LT on 2018/11/13
 */
public class StudentsDao {

    public boolean logIn(Student logInInfo){

        boolean bool = false;
        Connection conn = null;
        String sql =  "select password from project3-nudb_Student where id=?";
        PreparedStatement pstmt = null;
        ResultSet password = null;

        try{
            conn = DbConn.getconn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, logInInfo.getId());
            password = pstmt.executeQuery();
            if(!password.next()){
                bool  = false;
            }else{
                if(password.getString("password").equals(logInInfo.getPassword())){
                    bool = true;
                }else{
                    bool = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DbClose.queryClose(conn, pstmt, password);
        }

        return bool;
    }

    public static void showDetails(Student logInInfo){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from project3-nudb_Student where id=?";


        try{
            conn = DbConn.getconn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, logInInfo.getId());
            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("password"));
                System.out.println(rs.getString("address"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DbClose.queryClose(conn, pstmt, rs);
        }
        return;
    }

    public boolean changeDetail(int key, Student newInfo){

        boolean bool = false;
        Connection conn = null;
        PreparedStatement pstmt = null;

        switch(key){
                case 1: //change the password;
                    String sqlPW = "update project3-nudb_Student set passard = ? where id = ?";
                    try{
                        conn = DbConn.getconn();
                        pstmt = conn.prepareStatement(sqlPW);
                        pstmt.setString(1, newInfo.getPassword());
                        pstmt.setString(2, newInfo.getId());

                        int rs = pstmt.executeUpdate();
                        if(rs > 0){
                            bool = true;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }finally {
                        DbClose.updateClose(conn, pstmt);
                    }
                    break;
                case 2: // change the address
                    String sqlAdd = "update project3-nudb_Student set address = ? where id = ?";
                    try{
                        conn = DbConn.getconn();
                        pstmt = conn.prepareStatement(sqlAdd);
                        pstmt.setString(1, newInfo.getAddress());
                        pstmt.setString(2, newInfo.getId());
                        int rs2 = pstmt.executeUpdate();
                        if(rs2 > 0){
                            bool = true;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }finally {
                        DbClose.updateClose(conn, pstmt);
                    }
                    break;
                default:
                    break;
            }
         return bool;

    }
}
