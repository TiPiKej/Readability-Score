import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toLowerCase();
        int i = 0;
        int j = s.length();

        for (char ch : s.toCharArray()) {
            if (ch == 'c' || ch == 'g') {
                i++;
            }
        }

        double result = (double) i / j * 100;

        System.out.println(result);

        scanner.close();
    }
}