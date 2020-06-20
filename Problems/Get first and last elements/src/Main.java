import java.util.*;

public class Main {

    private static int[] getFirstAndLast(int[] tab) {
        int[] res = new int[2];
        res[0] = tab[0];
        res[1] = tab[tab.length - 1];
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}