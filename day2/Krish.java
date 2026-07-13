package day2;

import java.util.Scanner;

public class Krish {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double basic = sk.nextDouble();
        double total = basic * 12;
        System.out.println("Annual salary = " + total);

    }
}
