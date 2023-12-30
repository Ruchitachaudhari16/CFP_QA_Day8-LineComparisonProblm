import java.util.Scanner;

public class LineComparison {
    /*Line Computation Problem */
    /*A Length as 2 Points (x1, y1) and (x2, y2) -
    Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)*/

    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation Problem");

        int xOne, xTwo, yOne, yTwo; //Initialise variable

        double distance;

        //User input of x1,y1,x2,y2 coordinates
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
        distance= Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));

        System.out.println("distancebetween" + "(" + xOne + "," + yOne + ")," + "(" + xTwo + "," + yTwo + ")==" + distance);
    }
}
