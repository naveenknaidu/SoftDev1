package Lab2;

import javax.swing.*;

/**
 * Created by: Naveen krishna
 * Created on: 24/02/2019
 * This program displays seconds in minutes and seconds in JOptionpane
 */

public class DisplayTimeinJOptionPane {
    public static void main(String[] args) {
        int seconds, minutes, remainingseconds;
        seconds = 500;
        minutes = seconds / 60;
        remainingseconds = seconds % 60;
        JOptionPane.showMessageDialog(null, seconds + " seconds is " + minutes +
                 " minutes and " + remainingseconds + " seconds");
    }//main
}//class
