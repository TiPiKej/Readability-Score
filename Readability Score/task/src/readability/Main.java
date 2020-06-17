package readability;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charSum = 0;
        String s = scanner.nextLine();
        for (char c : s.toCharArray()) {
            charSum++;
        }

        System.out.println(charSum > 100 ? "HARD" : "EASY");
    }
}
