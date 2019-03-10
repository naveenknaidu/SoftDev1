package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program prints the squre root of the number entered by the user, if the number is greater than zero
 */

public class SquareRoot {
    public static void main(String[] args) {
        int yournumber;
        double squarerootnumber;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Please enter your number: ");
        yournumber = keyboard.nextInt();

        if (yournumber >= 0){
            squarerootnumber = Math.sqrt(yournumber);
            System.out.println("The square root of your number is: " + df.format(squarerootnumber));
        }//if
        else{
            System.out.println("We cannot calculate the square root of your number");
        }//else

    } //main
}//class
