import java.util.Scanner;

public class Employee {
    String empName;
    String empID;
    String address;
    String mailld;
    long mobileNo;
    void getEmployeeDetails() {
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Address: " + address);
        System.out.println("mobileNo: " + mobileNo);
        System.out.println("mobileNo: " + mobileNo);
        System.out.println("Mobile: " + mobileNo);

    }
    void displayEmployeeDetails() {
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empID);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobileNo);


    }
}
class programmer extends Employee {
    double basicPay;

     void calculatePay() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter basic pay for programmer; ");
         basicPay = sc.nextDouble();

         double da = 0.97 * basicPay;
         double hra = 0.10 * basicPay;
         double pf = 0.12 * basicPay;
         double stafClud = 0.001 * basicPay;
         double grossSalary = basicPay + da + hra;
         double netSalary = grossSalary - pf - stafClud;

         displayEmployeeDetails();
         System.out.println("Gross Salary: :");
         System.out.println("Net Salary: " + netSalary);

     }
}
class Assistantprofessor extends Employee {
    double basicPay;

    void calculatePay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay for Assistant professor; ");
        basicPay = sc.nextDouble();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double stafClud = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - stafClud;
        displayEmployeeDetails();
        System.out.println("Gross Salary:"+ grossSalary);
        System.out.println("Net Salary:"+ netSalary);
    }
}
class AssociateProfessor extends Employee {
    double basicPay;
    void calculatePay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay for Associate professor; ");
        basicPay = sc.nextDouble();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double stafClud = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - stafClud;

        displayEmployeeDetails();
        System.out.println("Gross Salary:"+ grossSalary);
        System.out.println("Net Salary:"+ netSalary);

    }
}
class Prossor extends Employee {
    double basicPay;

    void calculatePay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay for Prossor; ");
        basicPay = sc.nextDouble();
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double stafClud = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - stafClud;

        displayEmployeeDetails();
        System.out.println("Gross Salary:"+ grossSalary);
        System.out.println("Net Salary:"+ netSalary);
    }
}
 class EmployeeManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Employee Type: ");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. AssociateProfessor");
        System.out.println("4. prossor");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                programmer pro = new programmer();
                pro.getEmployeeDetails();
                pro.calculatePay();
                break;
                case 2:
                    Assistantprofessor prof = new Assistantprofessor();
                    prof.getEmployeeDetails();
                    prof.calculatePay();
                    break;
                    case 3:
                        AssociateProfessor p = new AssociateProfessor();
                        p.getEmployeeDetails();
                        p.calculatePay();
                        break;
                        default:
                            System.out.println("Invalid choice");


        }
    }

}

