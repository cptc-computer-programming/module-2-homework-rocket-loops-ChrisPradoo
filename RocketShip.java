/*
Christian Castaneda Prado
1/20/2026
Assignment #2 Rocket Ship with Loops 

This program will print out a rocket pattern,
and is able to change the size by using a constant.
*/

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
        System.out.println("A nose cone should be here.");
        int starSize = 2;

        for (int row = 0; row < ROCKET_SIZE; row++){
            // noticed it needed correct spacing
            for (int s = 0; s < ROCKET_SIZE - row - 1; s++) {
                System.out.print(" ");
            }

            // created these variables to use as an end value that basically increases every loop
            // and adds another loop to the total it has to do, 
            // in all making it print another forward slash and back slash.
            int fowardSlash = row + 1;
            int backSlash = row + 1;

            // for loop that prints 1 forward slash and should increase every loop.
            for (int j = 0; j < fowardSlash; j++) {
                System.out.print("/");
            } 

            // for loop that prints 2 stars, hard coded.
            for (int k = 0; k < starSize; k++) {
                System.out.print("*");
            }

            // for loop tha prints 1 backslash and has an extra to escape it.
            for (int l = 0; l < backSlash; l++) {
                System.out.print("\\");
            }
            System.out.println();
        }   
        
    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        System.out.println("A diamond top should be here.");
        

        for (int loop = 1; loop <= ROCKET_SIZE; loop++) {
            // the vertical line at the left side
            System.out.print("|");

            // the loop that prints for the dots on the left side of the triangle
            for (int i = 1; i <= ROCKET_SIZE - loop; i++) {
                System.out.print(".");
            }

            // prints left triangle, and increases after each loop
            for (int j = 1; j <= loop; j++) {
                System.out.print("/\\");
            }

            // prints middle dots
            for (int k = 1; k <= 2 * (ROCKET_SIZE - loop); k++) {
                System.out.print(".");
            }

            // prints the right triangle 
            for (int l = 1; l <= loop; l++) {
                System.out.print("/\\");
            }
            
            // prints the right dots
            for (int i = 1; i <= ROCKET_SIZE - loop; i++) {
                System.out.print(".");
            }

            // the vertical line at the right side 
            System.out.println("|");
        }
        }   
    
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // your code goes here.
        System.out.println("A diamond bottom should be here.");
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // your code goes here.
        System.out.println("An edge should be here.");
    }
}