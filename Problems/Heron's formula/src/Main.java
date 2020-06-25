import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double p = (double)(a + b + c) / 2;
        double S = Math.sqrt(p * (p - (double)a) * (p - (double)b) * (p - (double)c));

        System.out.println(S);

        scanner.close();
    }
}