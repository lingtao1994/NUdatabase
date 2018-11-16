package page;

import entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by LT on 2018/11/12
 */
public class TranscriptPage {
    static PreparedStatement pstmt = null;
    static Connection conn  = null;
    static ResultSet rs    = null;

    public static void transcript (Student loginInfo) {
        String sqlGnum = "SELECT UoSCode,Grade FROM TRANSCRIPT WHERE StudId = " + loginInfo.getName() + ";";
        try {
            pstmt = conn.prepareStatement(sqlGnum);
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                if (rs.getString("Grade") != null) {
                    System.out.println("UoSCode:" + rs.getString("UoSCode") + ", Grade:" + rs.getString("Grade"));
                } else {
                    System.out.println("UoSCode:" + rs.getString("UoSCode") + ", Grade: Null");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            DbClose.queryClose(pstmt, rs, conn);
        }

        System.out.println("Please select:\n");
        System.out.println("\t 1.See Details of the Course\n");
        System.out.println("\t 2.Back to Menu\n");
        do {
            Scanner info = new Scanner(System.in);
            int num = info.nextInt();
            String range = "[1 - 2]";
            if ((String.valueOf(num)).matches(range)) {
                switch (num) {
                    case 1:
                        Scanner ucode = new Scanner(System.in);
                        System.out.println("Please enter the UoSCode of the course: " + ucode);
                        String UoSCode = String.valueOf(ucode);
                        courDetail(UoSCode, loginInfo.getName());
                    case 2:
                        MenuPage.MenuPage(loginInfo);
                }
            }
        } while (true);

    }

    private static void courDetail (String UoSCode, String studId) {
        String sqlGnum = "SELECT t.UoSCode,UoSName,t.Year,t.Semester,Enrollment,MaxEnrollment,Name,Grade,StudId FROM faculty f, transcript t, unitofstudy un,uosoffering uo where StudId = " + studId+" and t.UoSCode= '"+UoSCode+"'and t.UoSCode=un.UoSCode and t.UoSCode=uo.UoSCode and uo.InstructorId=f.Id and t.Year=uo.Year and t.Semester=uo.Semester ;";
        try {
            pstmt = conn.prepareStatement(sqlGnum);
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                if (rs.getString("Grade") != null) {
                    System.out.println("UoSCode:" + rs.getString("UoSCode"));
                    System.out.println("UoSName:" + rs.getString("UoSName"));
                    System.out.println("Year:" + rs.getString("Year"));
                    System.out.println("Semester:" + rs.getString("Semester"));
                    System.out.println("Enrollment:" + rs.getString("Enrollment"));
                    System.out.println("MaxEnrollment:" + rs.getString("MaxEnrollment"));
                    System.out.println("Lecturer::" + rs.getString("Name"));
                    System.out.println("Grade:" + rs.getString("Grade"));
                    System.out.println("Student ID:" + rs.getString("StudId"));
                } else {
                    System.out.println("UoSCode:" + rs.getString("UoSCode"));
                    System.out.println("UoSName:" + rs.getString("UoSName"));
                    System.out.println("Year:" + rs.getString("Year"));
                    System.out.println("Semester:" + rs.getString("Semester"));
                    System.out.println("Enrollment:" + rs.getString("Enrollment"));
                    System.out.println("MaxEnrollment:" + rs.getString("MaxEnrollment"));
                    System.out.println("Lecturer::" + rs.getString("Name"));
                    System.out.println("Grade:" + "Null");
                    System.out.println("Student ID:" + rs.getString("StudId"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();;
        } finally {
//            DbClose.queryClose(pstmt, rs, conn);
        }
    }

}
