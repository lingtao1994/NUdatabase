package page;

import dao.StudentsDao;
import entity.Student;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Created by LT on 2018/11/12
 */
public class PersonalDetailsPage {

    public static void changePersonalInfo(Student stuInfo){

        ResultSet rs = new StudentsDao().showDetails(stuInfo);
        System.out.println(rs.getString());
        do{

            Scanner input = new Scanner(System.in);
        }
    }
}
