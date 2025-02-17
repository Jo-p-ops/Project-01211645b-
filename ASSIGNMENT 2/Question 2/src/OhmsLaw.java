import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class OhmsLaw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ohms law");
        System.out.print("Enter the unknown values: votage, current, resistance: ");
        char unknown = sc.next().charAt(0);


     switch (unknown) {
         case 'v': {
             System.out.print("Enter the Current value in Ampers, A: ");
             double current = sc.nextDouble();
             System.out.print("Enter the Resistance value in ohms, : ");
             double resistance = sc.nextDouble();
             double voltage = current * resistance;
             System.out.println("Voltage in volts is " + voltage + "V");
             break;


     }
         case  'I': {
             System.out.print("Enter Voltage in volts, V: ");
             double voltage = sc.nextDouble();
             System.out.println("Enter Resistance in ohms, R: ");
             double resistance = sc.nextDouble();
             double current = voltage / resistance;
             System.out.println("Current in Ampers is " + current + "A");
             break;
         }
         case 'R': {
             System.out.print("Enter Voltage in volts, V: ");
             double voltage = sc.nextDouble();
             System.out.println("Enter current in Ampers, A: ");
             double current = sc.nextDouble();
             double resistance = voltage / current;
             System.out.println("Resistance in Ohms, is " + resistance + "Ohms");
            break;

      }
      default:
     }

    }

}
