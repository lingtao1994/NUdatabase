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

        StudentsDao.showDetails(stuInfo);
        System.out.println("press 1 to modify the password\n");
        System.out.println("press 2 to modify the address\n");
        System.out.println("press 0 to go back to menu");
        do{
            Scanner input = new Scanner(System.in);
            String selection = input.next();
            int selc = Integer.parseInt(selection);

            switch (selc){
                case 0:
                    //****MenuPage
                    break;
                case 1:
                    System.out.println("modify the password");
                    Scanner input1 = new Scanner(System.in);
                    String newPW = input1.next();
                    stuInfo.setPassword(newPW);
                    boolean boolPW = new StudentsDao().changeDetail(1, stuInfo);
                    if(boolPW){
                        System.out.println("update successully\n");
                    }else{
                        System.out.println("update failed\n");
                    }
                    break;
                case 2:
                    System.out.println("modify the password");
                    Scanner input2 = new Scanner(System.in);
                    String newAdd = input2.next();
                    stuInfo.setPassword(newAdd);
                    boolean boolAdd = new StudentsDao().changeDetail(2, stuInfo);
                    if(boolAdd){
                        System.out.println("update successully\n");
                    }else{
                        System.out.println("update failed\n");
                    }
                    break;
            }

        }while(true);
    }
}
