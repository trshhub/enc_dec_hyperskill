import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String ticketNum = scanner.nextLine();
        int sumDigitsLeft = 0;
        int sumDigitsRight = 0;

        for (int i = 0; i < ticketNum.length() / 2; i++) {
            sumDigitsLeft += Character.getNumericValue(ticketNum.charAt(i));
        }

        for (int i = ticketNum.length() / 2; i < ticketNum.length(); i++) {
            sumDigitsRight += Character.getNumericValue(ticketNum.charAt(i));
        }

        System.out.println(sumDigitsLeft == sumDigitsRight ? "Lucky" : "Regular");
    }
}