public class Sum2DArray {
    public static int sum2DArray(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                sum += row * col;
            }
        }
        return sum;

    }
    public static  void  main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = sum2DArray(arr);
        System.out.println("The sum of the 2D arrays is: " + sum);

    }
}
