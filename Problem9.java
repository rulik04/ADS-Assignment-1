import java.util.Scanner;

public class Problem9 {
    public static long binom(int n, int k) {
        if ((n == k) || (k == 0))
            return 1;
        else
            return binom(n - 1, k) + binom(n - 1, k - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(binom(n, k));
    }
}
