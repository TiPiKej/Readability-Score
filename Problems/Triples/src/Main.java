import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }

        scanner.close();

        int howManyTriples = 0;

        for (int i = 0; i < n - 2; i++) {
            if (tab[i+1] - tab[i] != 1) continue;
            if (tab[i+2] - tab[i+1] != 1) continue;

            howManyTriples++;
        }

        System.out.println(howManyTriples);
    }
}