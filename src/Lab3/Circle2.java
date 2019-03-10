package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 26/02/2019
 * This programs reads user input of radius from keyboard and outputs the diameter, circumferrence and area
 */

public class Circle2 {
    public static void main(String[] args){
        double radius;
        double  diameter, circumference, area;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please enter the radius: ");
        radius = keyboard.nextInt();
        diameter = 2*radius;
        circumference = 2*(Math.PI*radius);
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println("The radius is " + df.format(radius));
        System.out.println("The diameter is " + df.format(diameter));
        System.out.println("The circumference is " + df.format(circumference));
        System.out.println("The area is " + df.format(area));
    }//main
}//class
