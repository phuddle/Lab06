import java.util.Scanner; //used to get input
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false; //initializes done
        do {
            System.out.print("Enter the width of your rectangle: ");
            if (in.hasNextDouble())  {
                width = in.nextDouble();
                if (width > 0) { //ensures that the value is not negative or zero
                    done = true;
                } else {
                    System.out.println("Enter a non-negative value.");
                    in.nextLine(); //clears the buffer
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the buffer
                done = false;
            }

        } while (!done);

        done = false; //resets done for next loop

        do {
            System.out.print("Enter the height of your rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) { //ensures that the value is not negative or zero
                    done = true;
                } else {
                    System.out.println("Enter a non-negative value.");
                    in.nextLine(); //clears invalid input
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the invalid input (negatives, letters, etc.)
                done = false;

            }
        } while (!done);

        double area = width * height;
        double perimeter = (height * 2) + (width * 2);
        double diagonal = Math.sqrt(((height * height) + (width * width))); //crazy formula to find a diagonal

        System.out.println("The area of your rectangle is " + area + " units," + " while the perimeter of your rectangle is " + perimeter + " units.");
        System.out.println("The length of the diagonal for your rectangle is " + diagonal + " units.");


    }
}
