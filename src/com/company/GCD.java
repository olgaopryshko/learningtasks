package com.company;

import java.util.Scanner;


public class GCD {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number1: ");
        int num1 = in.nextInt();

        System.out.print("Input number2: ");
        int num2 = in.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.print("Error");
        }

        int g = gcd(num1, num2);
        if (g == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не взаимно простые");
        }

        System.out.print("Input number3");
        int num3 = in.nextInt();

        if (num3 <= 0){
            System.out.print("Error");
        }

        int g1 = gcd3(num1, num2, num3);
        if (g1 == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не взаимно простые");
        }
    }

    public static int gcd(int a, int b) {
        int r;
        do {
            r = a % b;
            a = b;
            b = r;

        } while (r > 0);

        return a;
    }

    public static int gcd3(int x, int y, int z) {
        int g = gcd(x, y);
        int result = gcd(z, g);

        return result;
    }


}
