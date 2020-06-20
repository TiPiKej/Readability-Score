import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int miles = scanner.nextInt();

        double res = (double)distance / (double)miles;

        System.out.println(res);
    }
}