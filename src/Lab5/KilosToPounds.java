package Lab5;

import java.text.DecimalFormat;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program prints the kilos to pounds
 */


public class KilosToPounds {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("00.0");
      final double kilostopunds = 2.2;
      for (int count = 5; count <=100; count+=5){
          System.out.println(count + "\t\t\t" + df.format(count*kilostopunds));
      }//for
    }//main

}//class
