import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfPole = scanner.nextInt();
        int dayForward = scanner.nextInt();
        int nightBack = scanner.nextInt();
        int res = 1;

        for (int whereIsSnail = 0; whereIsSnail < heightOfPole; res++) {
            whereIsSnail += dayForward;
            if (whereIsSnail >= heightOfPole) break;
            whereIsSnail -= nightBack;
        }

        System.out.println(res);
    }
}