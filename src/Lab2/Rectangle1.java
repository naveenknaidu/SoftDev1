package Lab2;

import java.text.DecimalFormat;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program calculates the volume and perimeter of the a rectangle
 */

public class Rectangle1 {
    public static void main(String [] args){
        double length, breadth, area, perimeter;
        DecimalFormat df = new DecimalFormat("00.00");
        length = 5.2;
        breadth = 4.3;
        area = length * breadth;
        perimeter = 2*(length+breadth);
        System.out.println("Rectangle length = " + df.format(length));
        System.out.println("Rectangle Breadth = " + df.format(breadth));
        System.out.println("Rectangle area = " + df.format(area));
        System.out.println("Rectangle perimeter = " + df.format(perimeter));
    }//main
}//class
