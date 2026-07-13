package day2;

import java.util.Scanner;

public class Vetriselvan {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = sk.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + f);
    }
}
