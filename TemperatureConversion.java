import java.util.Scanner;

public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion Program");

        while (true) {
        	 
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Kelvin to Fahrenheit");
           
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Kelvin to Celsius");
            
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Celsius to Kelvin");
            
            System.out.println("\n7. Quit");

            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("End of the program.");
                break;
            }

            System.out.print("Enter temperature value: ");
            double temperature = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println(temperature + " degree Celsius is equal to " + celsiusToFahrenheit(temperature) + " degree Fahrenheit.");
                    break;
                case 2:
                    System.out.println(temperature + " degree Kelvin is equal to " + kelvinToFahrenheit(temperature) + " degree Fahrenheit.");
                    break;
                case 3:
                    System.out.println(temperature + " degree Fahrenheit is equal to " + fahrenheitToCelsius(temperature) + " degree Celsius.");
                    break;
                case 4:
                    System.out.println(temperature + " degree Kelvin is equal to " + kelvinToCelsius(temperature) + " degree Celsius.");
                    break;
                case 5:
                    System.out.println(temperature + " degree Fahrenheit is equal to " + fahrenheitToKelvin(temperature) + " degree Kelvin.");
                    break;
                case 6:
                    System.out.println(temperature + " degree Celsius is equal to " + celsiusToKelvin(temperature) + " degree Kelvin.");
                    break;
               
              
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
        scanner.close();
    }
}
