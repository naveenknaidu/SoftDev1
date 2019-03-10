package Lab2;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program calculates the area, diameter and circumference of a circle
 */

public class Circle1 {
    public static void main(String [] args){
        int radius = 5;
        double area, diameter, circumference;
        diameter = 2 * radius;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println("The radius of the circle is " + radius);
        System.out.println("The diameter of the circle is " + diameter);
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The area of the circle is " + area);
    }//main
}//class
