import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Consumer Number");
        int consumer = sc.nextInt();
        System.out.println("Enter Consumer Name");
        String consumerName = sc.next();
        System.out.println("Enter previousReading");
        int previousReading = sc.nextInt();
        System.out.println("Enter current Reading");
        int currentReading = sc.nextInt();
        System.out.println("Enter Connection Type domestic/commercial): ");
        String connectionType = sc.next();
        if (currentReading < previousReading) {

        }
    }

    public static class Bill {

        int ConsumerNO;
        String ConsumerName;
        int PreviousReading;
        int CurrentReading;
        String ConnectionType;

        Bill(int ConsumerNo, String ConnectionType, int PreviousReading,int currentReading, String ConnectionName) {
          this.ConsumerNO = ConsumerNo;
          this.ConsumerName = ConnectionName;
          this.PreviousReading = PreviousReading;
          this.CurrentReading = currentReading;
          this.ConnectionType = ConnectionType;


        }
        public double calculateUnitsConsumed() {
            int unitsConsumed = CurrentReading - PreviousReading;
            double billAmount = 0.0;
            if (ConnectionType.equals("domemestic")) {
                if (unitsConsumed <= 100) {
                    billAmount = unitsConsumed * 1.0;
                }else if (unitsConsumed <= 200) {
                    billAmount = (100*1.0) +((unitsConsumed - 100) * 2.5);
                }else if (unitsConsumed <= 500) {
                    billAmount = (100*1.0) +(100 * 2.5) +((unitsConsumed - 200) * 4.0);
                } else {
                    billAmount = (100 * 1.0) + (100 * 2.5) + (300 * 4.0) + ((unitsConsumed - 500) * 6.0);
                }

            }else if (ConnectionType.equals("commercial")) {
                if (unitsConsumed <= 100) {
                    billAmount = unitsConsumed * 2.0;

                } else if (unitsConsumed <= 200) {
                    billAmount = (100*2.0) +((unitsConsumed - 100) * 4.5);
                } else if (unitsConsumed <= 500) {
                    billAmount = (100*2.0) +(100*4.5) + ((unitsConsumed - 200) * 6.0);
                } else {
                    billAmount = (100*2.0) + (100*4.5) + (300 * 6.0)+ ((unitsConsumed - 500)* 7.0);
                }
            }
            return billAmount;

        }
        public void displayBill() {
            System.out.println("Consumer NO: " + ConsumerNO);
            System.out.println("Consumer Name: " + ConsumerName);
            System.out.println("Unit consumed: " + (CurrentReading - PreviousReading));
            System.out.println("Connection Type: " + (ConnectionType.equals("domemestic") ? "domestic" : "commercial"));
            System.out.printf("Main.Bill Amount: Gh.%.2f%n ", calculateUnitsConsumed());


        }
    }
}