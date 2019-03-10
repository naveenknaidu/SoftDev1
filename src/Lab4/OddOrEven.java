package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program will read the number from user entered and prints whether the number is odd or even
 */

public class OddOrEven {
    public static void main(String[] args) {
        double mynumber;
        final String oddnumber = " Your number is odd number";
        final String evennumber = " Your number is even number";
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Please enter you number: ");
        mynumber = keyboard.nextDouble();
        if (mynumber % 2 == 0) {
            System.out.println("Youhave enetered " + df.format(mynumber) + evennumber);
        }//if
        else {
            System.out.println("You have entered " + df.format(mynumber) + oddnumber);
        }//else
    }//main
}//class
