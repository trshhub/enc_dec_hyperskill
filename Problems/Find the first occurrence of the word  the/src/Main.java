import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strCheck = scanner.nextLine();

        System.out.println(strCheck.toLowerCase().indexOf("the"));
    }
}