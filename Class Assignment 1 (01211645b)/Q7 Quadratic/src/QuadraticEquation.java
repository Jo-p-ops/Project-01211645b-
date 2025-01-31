import java.util.Scanner;

public class QuadraticEquation {
    static void quadraticEquation(double x, double y, double z) {
         double disciminant = y * y -4* x * z;
         if (disciminant > 0) {
             double root1 = (-x + disciminant)/(2*x);
             double root2 = (-y - root1)/(2*x);

             System.out.println("Root1 = " + root1);
             System.out.println("Root2 = " + root2);

         }else if(disciminant == 0){
             double root = -y/(2*x);
             System.out.println("Root = " + root);
         }else {
             double realpart = -y/(2*x);
             double imaginarypart = Math.sqrt(-disciminant)/(2*x);
             System.out.println("Root 1: " + realpart +" + " + imaginarypart +"i");
             System.out.println("Root 2: " + realpart + " - " + imaginarypart);

         }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = input.nextDouble();
        System.out.print("Enter Y: ");
        double y = input.nextDouble();
        System.out.print("Enter Z: ");
        double z = input.nextDouble();
        quadraticEquation(x, y, z);
    }

}
