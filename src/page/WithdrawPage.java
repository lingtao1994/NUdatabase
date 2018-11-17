package page;

import dao.TranscriptDao;
import entity.Student;
import entity.UosOffering;

import java.util.Scanner;

/**
 * Created by LT on 2018/11/12
 */
public class WithdrawPage {

    public static void withdrawCourse(Student stuInfo){

        System.out.println("press 0 to go back to the menu\n");
        System.out.println("press 1 to withdraw a course\n");

        do{
            Scanner input = new Scanner(System.in);
            String selection = input.next();
            int selc = Integer.parseInt(selection);

            switch (selc) {
                case 0:
                    //****MenuPage
                    break;
                case 1:
                    TranscriptDao.showWithdraw(stuInfo);
                    System.out.println("enter the UosCode");
                    Scanner input1 = new Scanner(System.in);
                    String uosCode = input1.next();
                    UosOffering courseInfo = new UosOffering(uosCode);
                    boolean bool = new TranscriptDao().dropCourse(courseInfo, stuInfo);
                    if (bool) {
                        System.out.println("course has been withdrawed!");
                    } else {
                        System.out.println("withdraw failed");
                    }
                    break;
            }
        }while(true);
    }
}
