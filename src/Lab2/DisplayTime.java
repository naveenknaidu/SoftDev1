package Lab2;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program displays seconds in minutes and seconds
 */

public class DisplayTime {
    public static void main(String [] args){
        int seconds, minutes, remainingseconds;
        seconds = 5000;
        minutes = seconds/60;
        remainingseconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and "+ remainingseconds + " seconds" );
    }//main
}//class
