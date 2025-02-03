import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int fahrenheit = userInput();

        while(fahrenheit > -460){
            double celsius = fahrenheitToCel(fahrenheit);
            intCelsius(celsius);
            //coverts user input to fahrenheit
            fahrenheit = userInput();
        }
        System.out.println("The temperature cant be below -460.");

    }

    //user input
    static int userInput(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit.");
        Integer userInt = myScan.nextInt();
        return userInt;
    }

    static double fahrenheitToCel(int fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    static void intCelsius(double celsius){
        System.out.println("The temperature in celsius is " + celsius);

    }




}
