package Java;

import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args) {
        String userName="",passInput,password="123456",ans;
    
        Scanner input=new Scanner(System.in);
        
        System.out.println("Username: ");
        userName=input.nextLine();
    
        System.out.println("Password: ");
        passInput=input.nextLine();
        
        if(userName.equals("Minazor") && password.equals(passInput)){
            System.out.println("Giriş yapıldı.");
        }else{
            System.out.println("Do you want to reset your password? Y/N");
            ans=input.nextLine();
            switch(ans){
                case "Y":
                    System.out.println("Please enter your new password:");
                    String tempPas=password;
                    password=input.nextLine();
                    while(tempPas.equals(password)){
                        System.out.println("Your new password can not same with the old one.");
                        System.out.println("Please enter your new password:");
                        password=input.nextLine();
                    }
                        System.out.println("Your password changed.");
                    break;
                case "N":
                 System.out.println("Okay.");
                default:
                    System.out.println("Wrong choice.");
            }
        }
     
    }
}
