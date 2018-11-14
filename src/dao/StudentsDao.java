package dao;

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
        Connection conn = DbConn.getconn();
        String sql =  "select password from project3-nudb_Student where id=?";

        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, logInInfo.getId());
            ResultSet passward = pstmt.executeQuery();
            if(!passward.next()){
                bool  = false;
            }else{
                if(passward.getString("password").equals(logInInfo.getPassword())){
                    bool = true;
                }else{
                    bool = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bool;
    }

    public ResultSet showDetails(Student logInInfo){
        Connection conn = DbConn.getconn();
        String sql = "select * from project3-nudb_Student where id=?";
        ResultSet rs = null;
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, logInInfo.getId());
            rs = pstmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean changeDetail(Student newInfo){

        boolean bool = false;
        Connection conn = DbConn.getconn();

    }
}
