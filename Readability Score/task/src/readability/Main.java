package readability;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try (Scanner scanner = new Scanner(file)) {
            // skip first line
//            scanner.nextLine();
            int sentenceCount = 0;
            int wordCount = 0;
            int charCount = 0;
            String[] sentences = new String[100];
            String[] words = new String[100];
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!Character.toString(line.charAt(line.length() - 1)).matches("[!\\.\\?]")) {
                    // if in the end of line isnt any end sentence like !.? i decrement it cuz then i added count of all sentences
                    charCount--;
                }

                sentences = line.split("[!\\.\\?]");
                sentenceCount += sentences.length;

                for (String sentence : sentences) {
                    words = sentence.trim().split(" ");
                    wordCount += words.length;

                    for (String word : words) {
                        charCount += word.trim().length();
                    }
                }
            }

            charCount += sentenceCount;

            System.out.printf("Words: %s\n", wordCount);
            System.out.printf("Sentences: %s\n", sentenceCount);
            System.out.printf("Characters: %s\n", charCount);

            double score = 4.71 * ((double)charCount / (double)wordCount) + 0.5 * ((double)wordCount / (double)sentenceCount) - 21.43;

            // formatting score
            score = Math.floor(score * 100) / 100;

            System.out.printf("The score is: %.2f\n", score);
            System.out.printf("This text should be understood by %s year olds.", age(score));
        } catch (final FileNotFoundException e) {
            System.out.printf("No file: %s", args[0]);
        }
    }

    private static String age(Double score) {
        if (score > 13) return "24+";
        if (score > 12) return "18-24";
        if (score > 11) return "17-18";
        if (score > 10) return "16-17";
        if (score > 9) return "15-16";
        if (score > 8) return "14-15";
        if (score > 7) return "13-14";
        if (score > 6) return "12-13";
        if (score > 5) return "11-12";
        if (score > 4) return "10-11";
        if (score > 3) return "9-10";
        if (score > 2) return "7-9";
        if (score > 1) return "6-7";
        return "5-6";
    }
}

