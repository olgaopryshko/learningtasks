package com.company;

import java.util.Scanner;

public class L2 {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number1: ");
        int num1 = in.nextInt();

        System.out.print("Input a number2: ");
        int num2 = in.nextInt();

        int result = num1 + num2;

        System.out.printf("Summa: %d \n", result);
        in.close();
    }
}
