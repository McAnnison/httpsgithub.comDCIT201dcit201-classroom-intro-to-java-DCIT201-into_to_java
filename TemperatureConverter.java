import java.util.Scanner;

public class TemperatureConverter {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Free Temperature Converter!");
            System.out.println("Choose your choice:");
            System.out.println("1. Convert from Celsius to Fahrenheit.");
            System.out.println("2. Convert from Fahrenheit to Celsius.");
            System.out.println("Enter your choice (1 or 2):  ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the temperature in Celcius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", celsius, fahrenheit);
                }
                    
                case 2 -> {
                    System.out.println("Enter the temperature in Fahrenheit: ");
                    double fahrenheitInput = scanner.nextDouble();
                    double celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", fahrenheitInput, celsiusOutput);
                }
                    
                default -> System.out.println("Invalid choice. Please select 1 or 2.");
            }
        }
    }
}