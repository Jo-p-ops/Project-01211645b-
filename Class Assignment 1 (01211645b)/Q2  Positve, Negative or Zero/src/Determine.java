import java.util.Scanner;

public class Determine {
    static String checkPositive(int number) {
        if (number < 0) {
            return "Negative number";
        }
        if (number == 0) {
            return "Zero";
        }
        if (number > 0) {
            return "Positive number";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(checkPositive(number));
    }
}
