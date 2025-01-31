import java.util.Scanner;

public class Temperature {
    static double FehrenheiCelsius (double celsius) {
        return celsius * 1.8 + 32;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Degrees Celsius: ");
        double celsius = input.nextDouble();
        System.out.print("Temperature in Degrees Fahrenheit: "+FehrenheiCelsius(celsius));
    }
}
