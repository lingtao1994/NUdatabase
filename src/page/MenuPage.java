package page;

import entity.Student;

import java.util.Scanner;

/**
 * Created by LT on 2018/11/12
 */
public class MenuPage {

    public static void MenuPage(Student loginInfo){
        System.out.println("\t Student Menu\n");
        System.out.println("\t Enter corresponding numbers to show details\n");
        
        System.out.println("\t 1.Current Courses\n");
        System.out.println("\t 2.Transcript\n");
        System.out.println("\t 3.Enroll\n");
        System.out.println("\t 4.Withdraw\n");
        System.out.println("\t 5.Personal Details\n");
        System.out.println("\t 6.Logout\n");

        do{
            Scanner info = new Scanner(System.in);//用户选择上述提示信息
            int num = info.nextInt();
            String regex = "[1-6]";
            if ((String.valueOf(num)).matches(regex)){
                switch (num) {
                    case 1:
                        // ***********Select current from transcript********************
                    case 2:
                        TranscriptPage.transcript(loginInfo);
                        break;
                    case 3:
                        EnrollPage.enroll();
                        break;
                    case 4:
                        WithdrawPage.withdraw();
                        break;
                    case 5:
                        PersonalDetailsPage.changePersonalInfo(loginInfo);
                        break;
                    case 6:
                        LoginPage.logIn();
                        break;
                    default:
                        break;
                }
            }
            System.err.println("Please enter valid numbers");
        } while (true);
    }

}
