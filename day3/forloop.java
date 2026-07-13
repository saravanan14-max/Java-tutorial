package day3;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int a = 0; a < 10; a++){
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            for(int i = 1; i <= number; i++){
                System.out.print(i + " ");
            }
        }
    }
}