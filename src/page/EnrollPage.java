package page;

import dao.UosOfferingDao;

import java.util.Calendar;
import java.util.Scanner;



/**
 * Created by LT on 2018/11/12
 */
public class EnrollPage {

    public static void showEnrollList(){
        System.out.println("press 0 to go back to the menu\n");
        System.out.println("press 1 to enroll a course\n");

        do{
            Scanner input = new Scanner(System.in);
            String selection = input.next();
            int selc = Integer.parseInt(selection);
            switch (selc){
                case 0:
                    //********back to mainpage
                    break;
                case 1:
                    String semester;
                    Calendar current = Calendar.getInstance();
                    int year = current.get(Calendar.YEAR);
                    int month = current.get(Calendar.MONTH);
                    //transfer month to semester//
                    if(month >=9 && month <= 12){
                        semester = "Q1";
                    }else if(month >= 1 && month <=3) {
                        semester = "Q2";
                    }else if(month >= 4 && month <= 6){
                        semester = "Q3";
                    }else {
                        semester = "Q4";
                    }
                    UosOfferingDao.enrollList(year, semester);
                    System.out.println("enter the UosCode");
                    Scanner input1 = new Scanner(System.in);
                    String uosCode = input.next();



            }
        }while(true);
    }
}
