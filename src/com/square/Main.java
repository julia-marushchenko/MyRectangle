// Java program to calculate maximal area of one of rectangles represented in array

package com.square;
import java.awt.*;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array of Rectangles
        Rectangle arr [] = {new Rectangle(2, 3), new Rectangle(5, 6),
                new Rectangle(3, 7)};

        // Calling method to find maximal area and print to console
        System.out.println(calculate_max_Area(arr));
    }

    // Method to find maximal square from all rectangles in array
    static int calculate_max_Area(Rectangle arr[]) {
        int square = 0;
        int tmp = 0;
        for(int index = 0; index < arr.length; index++){
            tmp = (arr[index]).width * (arr[index]).height;
            if(tmp > square)
                square = tmp;
        }
        return square;
    }
}