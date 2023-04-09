import java.util.Scanner;

public class Problem8 {

    public static boolean digits(char[] arr, int c) {
        if (c == arr.length) {
            return true;
        }
        if (!Character.isDigit(arr[c])) {
            return false;
        }
        return digits(arr, c + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(digits(scan.next().toCharArray(), 0));
    }
}
