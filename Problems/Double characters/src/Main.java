import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        for (char ch : s.toCharArray()) {
            System.out.printf("%c%c", ch, ch);
        }

        scanner.close();
    }
}