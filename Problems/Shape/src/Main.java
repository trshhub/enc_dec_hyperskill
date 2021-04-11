import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = null;

        switch (scanner.nextInt()) {
            case 1 :
                System.out.println("You have chosen a square");
                str += "is test";
                break;
            case 2 :
                System.out.println("You have chosen a circle");
                break;
            case 3 :
                System.out.println("You have chosen a triangle");
                break;
            case 4 :
                System.out.println("You have chosen a rhombus");
                break;
            default :
                System.out.println("There is no such shape!");
                break;
        }
        System.out.println(str);
    }
}