import Converter.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        System.out.print("Welcome to the currency converter app!\n ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("1. USD to GHS\n2. EUR to GHS\n3. YEN to GHS\n4. GHS to USD\n5. GHS to EUR\n" +
                        "GHS to YEN");
                int currency = sc.nextInt();
                System.out.print("Enter the amount to be converted: ");
                double amount = sc.nextDouble();
                switch (currency) {
                    case 1:
                        System.out.print("Result; + currencyConverter.usdToGhs(amount) + GHS");
                        case 2:
                            System.out.print("Result; - currencyConverter.eurToEur(amount) + GHS");
                            case 3:
                                System.out.print("Result; - currencyConverter.yenToGhs(amount) + GHS");
                                case 4:
                                    System.out.print("Result; - currencyConverter.ghsToUsd(amount) + GHS");
                                    case 5:
                                        System.out.print("Result; - currencyConverter.ghsToEur(amount) + GHS");
                    case 6:
                        System.out.print("Result; - currencyConverter.ghsToYen(amount) + GHS");
                        default:
                            System.out.println("Invalid currency");
                            break;
                }
                sc.close();
        }
    }
}