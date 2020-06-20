import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int centerOfWordIndex = word.length() / 2;
        boolean isPalindrom = true;

        for (int i = 0; i <= centerOfWordIndex && isPalindrom; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) isPalindrom = false;
        }

        System.out.println(isPalindrom ? "yes" : "no");

        scanner.close();
    }
}