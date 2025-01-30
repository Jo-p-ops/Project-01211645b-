import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter the name of your employee");
        String name = sc.nextLine();
        System.out.println("Enter the ID of your employee");
        int id = sc.nextInt();
        System.out.println("Enter the Address of your employee");
        String address = sc.nextLine();
        System.out.println("Enter Mail ID of your employee");
        int mailId = sc.nextInt();
        System.out.println("Enter Mobile Number of your employee");
        int mobile = sc.nextInt();
    }


}