import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;


class Utils {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFile = "./File_examples/dataset_91007.txt";
        int greatestNum;

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        Scanner scanner = new Scanner(new File(pathToFile));
        String[] splittedString = scanner.nextLine().split(" ");



        System.out.println(splittedString.length);

        greatestNum = Integer.parseInt(splittedString[0]);

        for (int i = 0; i < splittedString.length; i++) {
            if (Integer.parseInt(splittedString[i]) > greatestNum) {
                greatestNum = Integer.parseInt(splittedString[i]);
            }
        }

        System.out.println(greatestNum);
    }
}

