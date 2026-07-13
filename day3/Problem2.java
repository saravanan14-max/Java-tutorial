package day3;

import java.util.*;
public class Problem2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        String b=(a%2==0)?"Even":"Odd";
        System.out.println(b);


    }
}