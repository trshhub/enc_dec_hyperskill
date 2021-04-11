import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int cntD = 0;

        int tmpFor = scanner.nextInt();

        for (int i = 0; i < tmpFor; i++) {
            int tmp = scanner.nextInt();
            if (tmp == 5) {
                cntA++;
            }
            if (tmp == 4) {
                cntB++;
            }
            if (tmp == 3) {
                cntC++;
            }
            if (tmp == 2) {
                cntD++;
            }
        }

        System.out.println(cntD + " " + cntC + " " + cntB + " " + cntA);
    }
}