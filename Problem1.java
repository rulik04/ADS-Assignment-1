import java.util.Scanner;

public class Problem1 {
    public static int minimumNumber(int arr[], int a, int min) {
        if (arr.length == a) {
            return min;
        }
        if (min > arr[a]) {
            min = arr[a];
        }
        return minimumNumber(arr, a + 1, min);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int res = minimumNumber(arr, 0, arr[0]);
        System.out.println(res);

    }
}
