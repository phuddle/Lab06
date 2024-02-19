import java.util.Scanner; //used to get input
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsGas = 0; //number of gallons of gas in the tank
        double milesPerGallon = 0; //fuel efficiency
        double pricePerGallon = 0; //price of gas per gallon
        boolean done = false; //prevents the loop from being ending until done

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsGas = in.nextDouble(); //ensures gallonsGas is a double
                if (gallonsGas > 0) { //ensures that the value is not negative or zero
                    done = true;
                } else {
                    System.out.println("This is an invalid input. Gallons of gas must be positive.");
                    in.nextLine(); //clears invalid input
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the invalid input (negatives, letters, etc.)

            }
        }while (!done);

        done = false; //resets done for next loop

        do {
            System.out.print("Enter the vehicle's fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble(); //ensures milesPerGallon is a double
                if (milesPerGallon > 0) { //ensures that the value is not negative or zero
                    done = true;
                } else {
                    System.out.println("This is an invalid input. Fuel Efficiency must be positive.");
                    in.nextLine(); //clears invalid input
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the invalid input (negatives, letters, etc.)

        }
        }while (!done);

        done = false; //resets done for next loop

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble(); //ensures pricePerGallon is a double
                if (pricePerGallon > 0) { //ensures that the value is not negative or zero
                    done = true;
                } else {
                    System.out.println("This is an invalid input. Price per gallon must be positive and numerical.");
                    in.nextLine(); //clears invalid input
                }
            } else {
                System.out.println("Invalid input. Enter a positive, numerical value.");
                in.nextLine(); //clears the invalid input (negatives, letters, etc.)

            }
        }while (!done);

        double costPerHunMiles = (100 / milesPerGallon) * pricePerGallon; //used to calculate the cost per 100 miles
        double distance = gallonsGas * milesPerGallon; //to calculate the distance given the current amount of gas in the tank

        System.out.println("The cost per 100 miles is: $" + costPerHunMiles);
        System.out.println("The distance the car can go with its current levels of gas in the tank is: " + distance + " miles");
    }
}



