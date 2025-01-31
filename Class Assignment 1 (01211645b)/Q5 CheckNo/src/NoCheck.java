import java.util.Scanner;

public class NoCheck {
    static String CheckNo(double x) {
        if (x % 2==0) {
            return "Even";
        } else {
            return "Prime";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Number Check is: " + CheckNo(x));

    }
}
