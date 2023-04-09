import java.util.Scanner;

public class Problem7 {
    public static void permumation(char[] arr, int i, int n) {
        if (i == n - 1) {
            System.out.println(arr);
            return;
        }
        for (int j = i; j < n; j++) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            permumation(arr, i + 1, n);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        permumation(s.toCharArray(), 0, s.length());
    }
}
