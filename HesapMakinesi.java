package Java;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, op;

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        n1=input.nextInt();
        System.out.print("Please enter the second number: ");
        n2=input.nextInt();
        System.out.print("Please enter the operation that you want (1 for: +, 2 for: -, 3 for: *, 4 for: /): ");
        op=input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Result: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Result: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Result: "+ (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Result: "+ (n1/n2));
                    break;
                }else{
                    System.out.println("Dividing 0????");
                    
                }        
                break;
            default : System.out.println("Somethings went wrong"); 
        }
}
}
