package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 27/02/2019
 * This program should prompt the user to enter the length of the lawn and radius of the pond and output the area
 * of the grass
 */

public class Garden {
    public static void main(String[] args){
        double radius, length, area;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please enter the length of the lawn: ");
        length = keyboard.nextDouble();
        System.out.println("Please enter the radius of the pond: ");
        radius = keyboard.nextDouble();
        area = Math.pow(length, 2) - Math.PI*(Math.pow(radius, 2));
        System.out.println("You have entered the length of the lawn is: " + df.format(length) + "m");
        System.out.println("You have entered the radius of the pond: " + df.format(radius) + "m");
        System.out.println("The area of the lawn is: " + df.format(area) + " M\u000B2");
    }//main
}//class
