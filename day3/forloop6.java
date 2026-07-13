package day3;

import java.util.Scanner;

public class forloop6 {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        while (num>0){
            System.out.println(num);
            num--;
        }
    }
}
