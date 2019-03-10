package Lab3;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 26/02/2019
 * This program prints integers on console what user enters from key board
 */

public class ReadIntVariables {
    public static void main(String[] args) {
        int length, breadth;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your length from your keyboard: ");
        length = keyboard.nextInt();
        System.out.println("Please enter your breadth from your keyboard: ");
        breadth = keyboard.nextInt();
        System.out.println("Length you have entered from the keyboard is: " + length);
        System.out.println("Breadth you have entered from the keyboard is: " + breadth);
    }//main
}//class
