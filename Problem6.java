import java.util.Scanner;

public class Problem6 {

    public static int power(int a, int n) {
        if (n < 1) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(power(a, n));
    }
}
