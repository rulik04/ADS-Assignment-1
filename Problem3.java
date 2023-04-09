import java.util.Scanner;

public class Problem3 {
    public static boolean primeNumber(int n, int c) {
        if (c == n || n == 1) {
            return true;
        }
        if (n % c == 0) {
            return false;
        }
        return primeNumber(n, c + 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(primeNumber(scan.nextInt(), 2));

    }
}
