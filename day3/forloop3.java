package day3;

import java.util.Scanner;

public class forloop3 {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sk.nextInt();
        int sum = n*(n+1)/2;
        System.out.println("Sum = " + sum);
    }
}
