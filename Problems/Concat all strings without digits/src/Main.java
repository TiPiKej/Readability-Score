import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder outStr = new StringBuilder();
        for (String string : strings) {
            for (char c : string.toCharArray()) {
                if (Character.toString(c).matches("[^0-9]") && c != ' ') {
                    outStr.append(c);
                }
            }
        }
        return outStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}