import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = null;
        while (!(temp = scanner.nextLine()).equals("0")) {
            try {
                System.out.println(Integer.parseInt(temp) * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s\n", temp);
            }
        }

        scanner.close();
    }
}