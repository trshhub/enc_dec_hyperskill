import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while (!scanner.nextLine().equals("0")) {
            cnt++;
        }

        System.out.println(cnt);
    }
}