package Lab2;

/**
 * Created by: Naveen krishna
 * Created on: 23/02/2019
 * This program calculates the volume and perimeter of the a Box
 */

public class Box {
    public static void main(String [] args){
        int height = 2;
        int width = 3;
        int depth = 4;
        int volume = height*width*depth;
        int perimeter = (4*height)+(4*width)+(4*depth);
        int height1 = 3;
        int width1 = 4;
        int depth1 = 5;
        int volume1 = height1*width1*depth1;
        int perimeter1 = (4*height1)+(4*width1)+(4*depth1);

        //Program prints volume and perimeter using 2,3,4 values
        System.out.println("The box is " + height + " cm high," + width + "cm width, and " + depth + "cm deep");
        System.out.println("The volume of the box is " + volume + "cms");
        System.out.println("The perimeter of the box is " + perimeter + "cms");

        //program prints volume and perimeter of the box using 3,4,5 values
        System.out.println("The box is " + height1 + " cm high," + width1 + "cm width, and " + depth1 + "cm deep");
        System.out.println("The volume of the box is " + volume1 + "cms");
        System.out.println("The perimeter of the box is " + perimeter1 + "cms");

    }//main
}//class
