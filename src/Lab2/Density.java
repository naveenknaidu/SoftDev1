package Lab2;

import java.text.DecimalFormat;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program calculates density of an object given its mass and volume
 */

public class Density {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        double mass, volume, density;
        mass = 500;
        volume = 24.2;
        density = mass/volume;
        System.out.println("Mass = " + mass + " kg");
        System.out.println("Volume = " + volume + " meters cubed");
        System.out.println("Density = " + df.format(density) + " kg per meter cubed");
    }//main
}//class
