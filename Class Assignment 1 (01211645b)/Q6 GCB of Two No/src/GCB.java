import java.util.Scanner;

public class GCB {
    static double GCBof ( double x, double y) {
        if (y == 0){
            return x;
        }
        return GCBof( x, y-1 );
        }


    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter x and y coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("GBC of x and y is "+ GCBof( x, y ) );
    }

}
