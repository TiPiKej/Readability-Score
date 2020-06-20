import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String[] sentences = scanner.nextLine().split("[!\\.\\?]");
        for (String s : sentences) {
            count += s.split(" ").length;
        }

//        System.out.printf("%d...%d\n", count, sentences.length);

        System.out.println((count / sentences.length) > 10 ? "HARD" : "EASY");
    }
}

