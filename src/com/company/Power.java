package com.company;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        System.out.print("Input power: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Error");
            System.exit(1);
        }

        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * number;
        }
        System.out.println(result);


	// write your code here
    }
}
