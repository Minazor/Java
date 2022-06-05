package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter first number:");
        num1=input.nextInt();
    
        System.out.println("Please enter second number:");
        num2=input.nextInt();

        System.out.println("Please enter third number:");
        num3=input.nextInt();

        int[] array={num1,num2,num3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
  }

