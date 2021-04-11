import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAlphabet = true;
        String str = scanner.nextLine();
        char[] strToCharArr = str.toLowerCase().toCharArray();

        for (int i = 1; i < strToCharArr.length; i++) {
            if (strToCharArr[i] - strToCharArr[i - 1] != 1) {
                isAlphabet = false;
                break;
            }

        }

        System.out.println(isAlphabet);
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
    }
}