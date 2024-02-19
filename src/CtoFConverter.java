import java.util.Scanner; //used to get input
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempCelsius = 0;
        String trash = ""; //bad inputs to be read as a String
        boolean done = false; //prevents the loop from being ending until done
        do {
            System.out.print("Enter the temperature in Celsius: "); //asks user for input
            if (in.hasNextDouble()) {
                tempCelsius = in.nextDouble();
                in.nextLine(); //clears the buffer
                double tempFahren = tempCelsius * 1.8 + 32; //converts Celsius into Fahrenheit
                System.out.print("Your temperature converted to Fahrenheit is " + tempFahren);
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid temperature, not: " + trash);
            }
        }
     while(!done);
    }
}