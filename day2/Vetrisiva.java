package day2;

import java.util.Scanner;

public class Vetrisiva {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = sk.nextInt();
        int seconds = hours * 60 * 60;
        System.out.println("Seconds = " + seconds);

    }
}
