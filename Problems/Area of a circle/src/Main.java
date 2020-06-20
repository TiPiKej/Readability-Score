import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double res = Math.pow(radius, 2) * Math.PI;
        System.out.println(res);
    }
}