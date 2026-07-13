package day3;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sk.nextInt();
        int b = sk.nextInt();
        if(a==b)
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
