import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        //int from = scanner.nextInt();
        //int to = scanner.nextInt();

        System.out.println(gcd(3, 7));
        System.out.println(gcd(1, 3));
        System.out.println(gcd(6, 2));
        System.out.println(gcd(4, 6));
        System.out.println(gcd(3, 6));
        System.out.println(gcd(1, 1));
    }
}