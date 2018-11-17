package page;

import dao.StudentsDao;
import entity.Student;

import java.util.Scanner;

/**
 * Created by LT on 2018/11/12
 */
public class LoginPage {

    public static void main(String[] atgs){
        logIn();
    }

    public static void logIn(){

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter username\n");
            String UserName = input.next();
            int inUserName = Integer.parseInt(UserName);
            System.out.println("Please enter password\n");
            String inPassWord = input.next();

            Student loginInfo = new Student(inUserName, inPassWord);
            //bool = true means that it enter the right id and password;
            boolean bool = new StudentsDao().logIn(loginInfo);
            if(bool){
                //*********jump to the menuPage**********
                //MenuPage.MenuPage(loginInfo);

            }else{
                System.err.println("wrong id or password");
                System.out.println("Please reenter");
            }

        }while(true);
    }

}
