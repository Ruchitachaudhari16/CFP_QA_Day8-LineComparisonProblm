import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    /*Line Computation Problem */
    /*UC2-check equality of two lines
based on the end points, when two lines are the equal.
Using Java equals method to check equality of 2 Lengths is preferable.*/

    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation Problem");

        int xOne, xTwo, yOne, yTwo ,xThree,yThree,xFour,yFour; //Initialise variable

        double distanceOfLineOne,distanceOfLineTwo;

        //User input of x1,y1,x2,y2 coordinates of Line1
        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1 Coordinate");

        xOne = sc.nextInt();

        System.out.println("enter y1 Coordinate");

        yOne = sc.nextInt();

        System.out.println("enter x2 Coordinate");

        xTwo= sc.nextInt();

        System.out.println("enter y2 Coordinate");

        yTwo = sc.nextInt();
        //Calculate distance using formula.
        distanceOfLineOne= Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));

        System.out.println("distancebetween" + "(" + xOne + "," + yOne + ")," + "(" + xTwo + "," + yTwo + ")==" + distanceOfLineOne);
        System.out.println("----------------------------------------------------------");
         //Calculate length of Line2

        System.out.println("enter x3 Coordinate");

        xThree = sc.nextInt();

        System.out.println("enter y3 Coordinate");

        yThree = sc.nextInt();

        System.out.println("enter x4 Coordinate");

        xFour= sc.nextInt();

        System.out.println("enter y4 Coordinate");

        yFour = sc.nextInt();
        //Calculate distance using formula.
        //Length of Line 2
        distanceOfLineTwo= Math.sqrt((xFour - xThree) * (xFour - xThree) + (yFour - yThree) * (yFour - yThree));
        System.out.println("distancebetween" + "(" + xThree + "," + yThree + ")," + "(" + xFour + "," + yFour + ")==" + distanceOfLineTwo);

        //Check the equality of Two lines
        if(Objects.equals(distanceOfLineOne, distanceOfLineTwo)) {
            System.out.println("Length of Line1 and Line2 is Equal");
        } else
        {
            System.out.println("Length of Line1 and Line2 is unequal");

        }
    }
}
