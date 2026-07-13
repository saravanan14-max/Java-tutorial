package day2;

import java.util.Scanner;

public class Sivavetri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Credit Score: ");
        int credit = sc.nextInt();
        String result = (salary >= 30000 && credit >= 350) ? "Loan Approved" : "Loan Rejected";
        System.out.println(result);

    }
}
