import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Select the conversion you want to perform:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter the option (1-6): ");

        int option = scanner.nextInt();
        double temperature;

        switch (option) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 6.");
                break;
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
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
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
