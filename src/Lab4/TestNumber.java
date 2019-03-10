package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program compares the value with 20 and dispays the whether it greater than or less than
 */

public class TestNumber {
    public static void main(String[] args){
        final double number = 20;
        double mynumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        mynumber = keyboard.nextDouble();
        if (mynumber>number){
            System.out.println("The number " + mynumber + " is greater than " + number);
        }//if
        else
            System.out.println("The number " + mynumber + " is not greater than " + number);
    }//main
}//class

