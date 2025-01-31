import java.util.Scanner;

public class SquareofNo {
    static double squareofNo(double x) {
        return x * x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square of No: ");
        double x = sc.nextDouble();

        System.out.println("The Square of No is = " + squareofNo(x));

    }

}
