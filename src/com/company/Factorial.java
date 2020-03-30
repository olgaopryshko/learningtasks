package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        if (number < 0){
           System.out.print("Error");
        }
        int result = 1;

        for(int i = 1; i <= number; i++){

                result = result * i;

    }
        System.out.println(result);


    }

}