package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program reads the start number, end number and divisor if number divisor by 3 prints FIZZ
 * if number divisor by 7 prints BUZZ
 */

public class FizzBuzz {
    public static void main(String[] args) {
        int startnumber, finishnumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter start number: ");
        startnumber = keyboard.nextInt();
        System.out.println("Please enter finish number: ");
        finishnumber = keyboard.nextInt();
        for (int count = startnumber; count <= finishnumber; count++) {
            if (count % 3 == 0 || count % 7 == 0) {
                if (count % 3 == 0) {
                    System.out.println("FIZZ");
                }//if
                if (count % 7 == 0) {
                    System.out.println("BUZZ");
                }//if
                System.out.println("\t\t\t");

                System.out.println(count + "\t\t\t");
            }//if
        }//for
    }//main

}//class
