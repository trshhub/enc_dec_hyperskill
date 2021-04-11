import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();
        double area = 0;

        switch (shape) {
            case "triangle" :
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                area =  Math.sqrt((( a + b + c) / 2) * ((a + b + c) / 2 - a ) * ((a + b + c) / 2 - b ) * ((a + b + c) / 2 - c) );
                break;
            case "rectangle" :
                area = scanner.nextInt() * scanner.nextInt();
                break;
            case "circle" :
                area = 3.14 * Math.pow(scanner.nextInt(), 2);
                break;
            default :
                break;
        }
        System.out.println(area);
    }
}