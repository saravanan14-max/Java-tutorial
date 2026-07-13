package day3;

import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sk.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum = " + sum);
    }
}
