package Java;

import java.util.Scanner;

public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.println("Please write the degree of weather: ");
        heat=input.nextInt();

       if(heat<5){
           System.out.println("You can do snowboard.");
       }else if(5<=heat && heat<15){
           System.out.println("You can go to the cinema.");
       }else if(15<=heat && heat<25){
            System.out.println("You can go to the picnic.");
       }else{
            System.out.println("You can go to the pool.");
       } 
    }
}
