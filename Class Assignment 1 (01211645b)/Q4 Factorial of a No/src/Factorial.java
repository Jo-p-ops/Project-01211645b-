import java.util.Scanner;

public class Factorial {
    static double factorial(int n) {
        double  f = n * (n - 1) * (n - 2) * 1;
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}
