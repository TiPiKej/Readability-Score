import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int temp;

        while ((temp = scanner.nextInt()) != 0) {
            sum += temp;
        }

        scanner.close();
        System.out.println(sum);
    }
}