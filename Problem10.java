import java.util.Scanner;

public class Problem10 {

    public static int GCD(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a > b) {
            return GCD(a - b, b);
        } else {
            return GCD(a, b - a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(GCD(a, b));
    }
}
