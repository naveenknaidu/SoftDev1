package Lab2;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program calculates the volume and perimeter of the a rectangle in JOptionPane
 */

public class Rectangle1JOptionPane {
    public static void main(String [] args){
        DecimalFormat df = new DecimalFormat("00.00");
        double length, breadth, area, perimeter;
        length = 24.7;
        breadth = 25.9;
        area = length * breadth;
        perimeter = 2*(length+breadth);
        JOptionPane.showMessageDialog(null,"Rectangle length = " + df.format(length) + "\n" +"rectangle breadth = " +
                 df.format(breadth) + "\n" + "Rectangle area = " + df.format(area) + "\n" + "Rectangle perimeter = " + df.format(perimeter));
    }//main
}//class
