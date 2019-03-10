package Lab2;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program converts the centigrade temperature to fahrenheit
 */

public class ConvertTemperature {
    public static void main(String [] args){
        double centigrade, fahrenheit;
        centigrade = 36.8;
        fahrenheit = 9/5 * centigrade + 32;
        System.out.println("36.8 degrees centigrade = " + fahrenheit + " degrees fahrenheit");
    }//main
}//class
