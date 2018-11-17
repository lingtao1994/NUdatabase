package dao;

import db.DbClose;
import db.DbConn;
import entity.Student;
import entity.UosOffering;

import java.sql.*;

/**
 * Created by LT on 2018/11/15
 */
public class TranscriptDao {

    public static void showWithdraw(Student stuInfo){
        boolean flag;
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try{
            conn = DbConn.getconn();
            cstmt = conn.prepareCall("Call courseList(?)");
            cstmt.setInt(1, stuInfo.getId());
            flag = cstmt.execute();
            while(flag){
                rs = cstmt.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getString("UosCode"));
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

    public boolean dropCourse(UosOffering courseInfo, Student stuInfo){
        boolean bool = false;
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        // *************触发器还没有实现*************//
        try{
            conn = DbConn.getconn();
            cstmt = conn.prepareCall("Call drops(?, ?, ?)");
            cstmt.setString(1, courseInfo.getUosCode());
            cstmt.setInt(2, stuInfo.getId());
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute();
            if(cstmt.getInt(3) == 0){
                bool = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bool;
    }
}
