package day3;

import java.util.*;
public class Problem1{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=input.nextInt();
        if( a%2==0) {
            if (a % 4 == 0) {
                System.out.println("the given number is divided by 2 and 4");
            }
        }
        else if(a%5==0){
            System.out.println("the given number is divided by 5");

        }
        else{
            System.out.println("invalid input");
        }



    }

}