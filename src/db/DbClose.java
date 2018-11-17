package db;

import java.sql.*;

/**
 * Created by LT on 2018/11/12
 */
public class DbClose {

    public static void queryClose(Connection conn, PreparedStatement pstmt, ResultSet rs){
        try{
            if(conn != null){
                conn.close();;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            if(pstmt != null){
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateClose(Connection conn, PreparedStatement pstmt){
        try{
            if(conn != null){
                conn.close();;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            if(pstmt != null){
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void transClose(Connection conn, CallableStatement cstmt, ResultSet rs){
        try{
            if(conn != null){
                conn.close();;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            if(cstmt != null){
                cstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
