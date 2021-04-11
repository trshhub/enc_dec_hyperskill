import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String tmp = "move ";

        switch (num) {
            case 1 :
                tmp += "up";
                break;
            case 2 :
                tmp += "down";
                break;
            case 3 :
                tmp += "left";
                break;
            case 4 :
                tmp += "right";
                break;
            case 0 :
                tmp = "do not move";
                break;
            default :
                tmp = "error!";
                break;
        }
        System.out.println(tmp);
    }
}