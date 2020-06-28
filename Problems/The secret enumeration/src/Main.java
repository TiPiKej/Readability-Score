public class Main {

    public static void main(String[] args) {
        int howMany = 0;

        String temp;
        for (Secret secret : Secret.values()) {
            if (secret.name().matches("^STAR.*")) howMany++;
        }

        System.out.println(howMany);
    }
}

// At least two constants start with STAR
/*enum Secret {
    STAR, CRASH, START
}*/