import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int n = scanner.nextInt();
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (i < n) temp += s.charAt(i);
            else System.out.print(s.charAt(i));
        }
        System.out.print(temp);

        scanner.close();
    }
}