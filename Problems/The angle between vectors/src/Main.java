import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] u = {scanner.nextInt(), scanner.nextInt()};
        int[] v = {scanner.nextInt(), scanner.nextInt()};

        double uLength = Math.sqrt(Math.pow(u[0], 2) + Math.pow(u[1], 2));
        double vLength = Math.sqrt(Math.pow(v[0], 2) + Math.pow(v[1], 2));
        double scalar = u[0] * v[0] + u[1] * v[1];

        scanner.close();

        double cos = scalar / (uLength * vLength);
        double out = Math.toDegrees(Math.acos(cos));
        System.out.println((int)out);
    }
}