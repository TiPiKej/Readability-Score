/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int res = Integer.parseInt(args[1]);

        for (int i = 2; i < args.length; i++) {
            if ("MAX".equals(operator)) {
                res = res < Integer.parseInt(args[i]) ? Integer.parseInt(args[i]) : res;
            } else if ("MIN".equals(operator)) {
                res = res > Integer.parseInt(args[i]) ? Integer.parseInt(args[i]) : res;
            } else if ("SUM".equals(operator)) {
                res += Integer.parseInt(args[i]);
            }
        }

        System.out.println(res);
    }
}