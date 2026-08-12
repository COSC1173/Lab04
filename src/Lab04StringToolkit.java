/*
 * COSC 1173 Programming Lab - Lab 04: String Toolkit
 * Textbook reference: Liang, Chapter 4 (Mathematical Functions, Characters, Strings)
 *
 * Student name: [TYPE YOUR NAME HERE]
 * Date:         [TYPE TODAY'S DATE HERE]
 *
 * REQUIREMENT: every executable statement below must carry a line comment.
 */
import java.util.Scanner;

public class Lab04StringToolkit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creates the keyboard reader

        // PART A - distance between two points
        System.out.print("Enter x1 y1 x2 y2: ");
        double x1 = input.nextDouble(); // reads the x coordinate of the first point
        double y1 = input.nextDouble(); // reads the y coordinate of the first point
        double x2 = input.nextDouble(); // reads the x coordinate of the second point
        double y2 = input.nextDouble(); // reads the y coordinate of the second point

        // STEP 1 - TODO: compute the straight-line distance using Math.pow and Math.sqrt.
        //          distance = square root of ((x2-x1)^2 + (y2-y1)^2)
        double distance = 0.0;

        // STEP 2 - TODO: print   Distance: 5.00   using printf with %.2f
        // STEP 3 - TODO: print   Rounded distance: 5   using Math.round(distance)

        // PART B - character and string analysis
        System.out.print("Enter one word with no spaces: ");
        String word = input.next(); // next() reads a single token; nextLine() would read the leftover newline

        // STEP 4 - TODO: print   Length: 9            using the length() method
        // STEP 5 - TODO: print   First character: L   using charAt(0)
        // STEP 6 - TODO: print   Last character: 6    using charAt with length() - 1
        // STEP 7 - TODO: print   Last is a digit: true   using Character.isDigit(...)
        // STEP 8 - TODO: print   Uppercase: LAMAR2026    using toUpperCase()
        // STEP 9 - TODO: print   First five: Lamar       using substring(0, 5)
        // STEP 10 - TODO: print  Index of a: 1           using indexOf("a")
    }
}
