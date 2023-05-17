import java.util.*;
import java.io.*;
public class onlineexam{
    public void question(){
        String username = "Shubham22";
        String password = "7067@Sme";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter valid user name");
        String username1 = sc.nextLine();
        System.out.println("please enter valid password");
        String password1 = sc.nextLine();
        if(username1.equals(username) && password1.equals(password)){
            for(int i =1;i<=5;i++){
                System.out.println("Question "+i);
                System.out.println("please select your answer");
                System.out.println("a answer1");
                System.out.println("b answer2");
                System.out.println("c answer3");
                System.out.println("d answer4");
                Scanner a = new Scanner(System.in);
                String question1 = a.nextLine();
                switch(question1){
                case ("a"):
                System.out.println("your answer is a");
                break;
                case ("b"):
                System.out.println("your answer is b");
                break;
                case ("c"):
                System.out.println("your answer is c");
                break;
                case ("d"):
                System.out.println("your answer is d");
                break;
            }
            }
            System.out.println("saving answers ------");
            System.out.println("you complete exam successfully");

    }}
    public void updateprofile(){
        System.out.println("enter new user name");
        Scanner s = new Scanner(System.in);
        String user = s.nextLine();
        System.out.println("enter new password");
        String pass = s.nextLine();
        System.out.println("updated successfully");

    }
public static void main(String[] args) {
    onlineexam oe = new onlineexam();
    System.out.println("1. login and start exam");
    System.out.println("2. update username and password");
    Scanner n = new Scanner(System.in);
    int num = n.nextInt();
    switch(num){
        case 1:
        oe.question();
        break;
        case 2:
        oe.updateprofile();
        break;
    }
    
}    
    }
