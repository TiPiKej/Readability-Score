class Problem {

    public static void main(String[] args) {
        char ch = args[0].charAt(0);

        if (ch == '+') {
            System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
        } else if (ch == '-') {
            System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
        } else if (ch == '*') {
            System.out.println(Integer.parseInt(args[1]) * Integer.parseInt(args[2]));
        } else {
            System.out.println("Unknown operator");
        }
    }
}