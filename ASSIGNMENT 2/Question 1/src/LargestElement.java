public class LargestElement {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 7, 8, 9};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is " + max);
    }
}
