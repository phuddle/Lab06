import java.util.Scanner; //used to get input
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles, feet, inches;
        boolean done = false;

        do {
            System.out.println("Enter a measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                if (meters >= 0) {
                    done = true;
                } else {
                    System.out.println("Enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the invalid input (negatives, letters, etc.)
            }
        } while (!done);

        miles = meters * .000621;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("The measurement converted from " + meters + " meters to miles is approximately " + miles + " miles.");
        System.out.println("The measurement converted from " + meters + " meters to feet is approximately " + feet + " feet.");
        System.out.println("The measurement converted from " + meters + " meters to inches is approximately " + inches + " inches.");
    }
}
