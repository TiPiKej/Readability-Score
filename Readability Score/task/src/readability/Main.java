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
            int syllables = 0;
            int polySyllables = 0;
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
                        int tempSyllables = 0;

                        for (int i = 0; i < word.length(); i++) {
                            // syllables
                            // 1
                            String curChar = Character.toString(word.charAt(i)).toLowerCase();
                            if (curChar.matches("[aeiouy]")){
                                tempSyllables++;

                                // 3
                                if (i == word.length() - 1 && curChar.equals("e")) {
                                    tempSyllables--;
                                    continue;
                                }

                                // 2
                                if (i != word.length() - 1 && Character.toString(word.charAt(i + 1)).toLowerCase().matches("[aeiouy]")) {
                                    tempSyllables--;
                                }
                            }
                        }
                        // 4
                        if (tempSyllables == 0)
                            tempSyllables = 1;

                        if (tempSyllables > 2) {
                            polySyllables++;
                        }

                        syllables += tempSyllables;
                    }
                }
            }

            charCount += sentenceCount;

            System.out.printf("Words: %s\n", wordCount);
            System.out.printf("Sentences: %s\n", sentenceCount);
            System.out.printf("Characters: %s\n", charCount);
            System.out.printf("Syllables: %s\n", syllables);
            System.out.printf("Polysyllables: %s\n", polySyllables);

            System.out.printf("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
            Scanner sin = new Scanner(System.in);
            String mode = sin.next().trim();
            System.out.println();

            int age = 0;
            int ageCount = 0;

            switch (mode) {
                case "ARI":
                    age += ari(charCount, wordCount, sentenceCount);
                    ageCount++;
                    break;
                case "FK":
                    age += fk(wordCount, sentenceCount, syllables);
                    ageCount++;
                    break;
                case "SMOG":
                    age += smog(polySyllables, sentenceCount);
                    ageCount++;
                    break;
                case "CL":
                    age += cl(wordCount, charCount, sentenceCount);
                    ageCount++;
                    break;
                case "all":
                    age += ari(charCount, wordCount, sentenceCount);
                    age += fk(wordCount, sentenceCount, syllables);
                    age += smog(polySyllables, sentenceCount);
                    age += cl(wordCount, charCount, sentenceCount);
                    ageCount += 4;
                    break;
                default:
                    System.out.println("You type incorrect word.");
                    break;
            }

            System.out.printf("\nThis text should be understood in average by %.2f year olds.", (double)age / (double)ageCount);
        } catch (final FileNotFoundException e) {
            System.out.printf("No file: %s", args[0]);
        }
    }

    private static int ari(int charCount, int wordCount, int sentenceCount) {
        double score = 4.71 * ((double)charCount / (double)wordCount) + 0.5 * ((double)wordCount / (double)sentenceCount) - 21.43;

        // formatting score
        score = Math.floor(score * 100) / 100;
        int age = Integer.parseInt(ariAge(score));

        System.out.printf("Automated Readability Index: %.2f (about %d year olds).\n", score, age);

        return age;
    }

    private static int fk(int wordCount, int sentenceCount, int syllables) {
        // TO DO
        return 0;
    }

    private static int smog(int polySyllables, int sentenceCount) {
        // TO DO
        return 0;
    }

    private static int cl(int wordCount, int charCount, int sentenceCount) {
        // TO DO
        return 0;
    }

    private static String ariAge(Double score) {
        if (score > 13) return "24";
        if (score > 12) return "18";
        if (score > 11) return "17";
        if (score > 10) return "16";
        if (score > 9) return "15";
        if (score > 8) return "14";
        if (score > 7) return "13";
        if (score > 6) return "12";
        if (score > 5) return "11";
        if (score > 4) return "10";
        if (score > 3) return "9";
        if (score > 2) return "7";
        if (score > 1) return "6";
        return "5";
    }
}

