import java.util.Scanner;

public class DCMotorSpeedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter voltage in volts: ");
        double voltage = sc.nextDouble();

        System.out.println("Enter Back EMF in volts: ");
        double backEm = sc.nextDouble();

        System.out.println("Enter Motor Constant in V/(rad/s): ");
        double motorConstant = sc.nextDouble();

        if (voltage < 0 || backEm < 0 || motorConstant <= 0) {
            System.out.println("Invalid input and Back EMF must be non-negative" +
                    "and Motor Constant must be positive");
            return;
        }
        double netvoltage = voltage - backEm;
        double speedRadpersec = netvoltage / motorConstant;

        double speedRPM = speedRadpersec * 60 / (2 * Math.PI);
        System.out.println("The speed of the DC motor is: " + speedRPM);

}

    }

