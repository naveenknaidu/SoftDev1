package Lab3;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 26/02/2019
 * This program prints double real numbers in the console what user has entered on the keyboard
 */

public class ReadDoubleVariables {
    public static void main(String[] args) {
        double realnumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter real number from your keyboard: ");
        realnumber = keyboard.nextDouble();
        System.out.println("The real number you have entered is: " + realnumber);

    }//main
}//class
