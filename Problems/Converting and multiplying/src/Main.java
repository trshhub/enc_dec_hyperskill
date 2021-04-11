import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String s = null;
            char ch = s.charAt(10);
            System.out.println(ch);
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getName());
            System.out.println("A runtime exception occurred");
        } catch (Exception e) {
            System.out.println("An exception occurred");
        } finally {
            System.out.println("Finally!");
        }
    }
}