import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];

        // insert values into array
        for (int i = 0; scanner.hasNextInt(); i++) {
            a[i] = scanner.nextInt();
        }

        // shift to right elements
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;

        scanner.close();

        for (int aTemp : a) {
            System.out.printf("%d ", aTemp);
        }
    }
}