import java.util.Scanner;

public class Problem4 {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
}
