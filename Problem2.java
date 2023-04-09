import java.util.Scanner;

public class Problem2 {
    public static double AverageOfNumbers(int arr[], int a, double sum) {
        if (arr.length == a) {
            return sum / a;
        }
        sum += arr[a];
        return AverageOfNumbers(arr, a + 1, sum);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(AverageOfNumbers(arr, 0, 0));
    }
}
