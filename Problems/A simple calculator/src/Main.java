import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long tmp = 0;

        long firstNum = scanner.nextLong();
        String oper = scanner.next();
        long secondNum = scanner.nextLong();

        switch (oper) {
            case "+" :
                tmp = firstNum + secondNum;
                System.out.println(tmp);
                break;
            case "-" :
                tmp = firstNum - secondNum;
                System.out.println(tmp);
                break;
            case "/" :
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                tmp = firstNum / secondNum;
                System.out.println(tmp);
                break;
            case "*" :
                tmp = firstNum * secondNum;
                System.out.println(tmp);
                break;
            default :
                System.out.println("Unknown operator");
        }
    }
}