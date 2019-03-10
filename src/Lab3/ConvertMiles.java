package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 27/02/2019
 * This program intakes the user input and calculates the miles to kilometers
 */

public class ConvertMiles {
    public static void main(String[] args){
        final double mileintoKilometer = 1.609;
        double kilometer, miles;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please convert miles to kilometers: ");
        miles = keyboard.nextDouble();
        kilometer = miles*mileintoKilometer;
        System.out.println("Miles you have entered is: " + df.format(miles) + "miles");
        System.out.println("Miles converted to kilometers are: " + df.format(kilometer) + "km");


    }//main
}//class
