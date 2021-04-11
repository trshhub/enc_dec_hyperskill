import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp;

        switch (scanner.next()) {
            case "gryffindor" :
                tmp = "bravery";
                break;
            case "hufflepuff" :
                tmp = "loyalty";
                break;
            case "slytherin" :
                tmp = "cunning";
                break;
            case "ravenclaw" :
                tmp = "intellect";
                break;
            default:
                tmp = "not a valid house";
                break;
        }
        System.out.println(tmp);
    }
}