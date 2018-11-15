package page;

/**
 * Created by LT on 2018/11/12
 */
public class MenuPage {

    public static void MenuPage(){
        System.out.println("\t Student Menu\n");
        System.out.println("\tEnter corresponding numbers to show details\n");
        System.out.println("\tEnroll\n");
        System.out.println("\tWithdraw\n");
        System.out.println("\t1.Transcript\n");
        System.out.println("\t2.Personal Details\n");
        System.out.println("\t3.Logout\n");

        do{
            String info = ScannerInfoString();//用户选择上述提示信息
            String regex = "[0-3]";
            if (info.matches(regex)){
                int choice = Integer.parseInt(info);
                switch (choice) {
                    case 1:
                        TranscriptPage.transcript();
                    case 2:
                        Student stuInfo = new Student(inUserName, inPassWord);
                        PersonalDetailsPage.changePersonalInfo(stuInfo);
                    case 3:
                        LoginPage.logIn();
                }
            }
        } while (true);
    }

    public static void main(String atgs){
        MenuPage();
    }
}
