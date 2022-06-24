import java.util.*;

public class HangMan {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("   __________________________");
        System.out.println("   |                         |");
        System.out.println("   |                         |");
        System.out.println("   |                         |");
        System.out.println("  00000                      |");
        System.out.println(" ( *|* )                     |");
        System.out.println("    O                        |");
        System.out.println("  00000                      |");
        System.out.println("    |                    --------");
        System.out.println("    |                    |      |");
        System.out.println("    |                    |      |");
        System.out.println("    |                    |      |");
        System.out.println("   /|/                   --------");

        System.out.println("Guess the correct Letters before I get hanged!!!");
        System.out.println("_-__--__--_--_----____---_-----_--___-----------");

        String generatedWord = wordGenerator();

        // System.out.println(generatedWord);

        for (int i = 0; i < generatedWord.length(); i++) {

            System.out.print(hidden(generatedWord.length())[i] + " ");

        }

        int counter = 0;
        char[] neww = hidden(generatedWord.length());

        // 5 chances are given to the player
        while (counter < 5) {

            if (counter == 0) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("                         --------");
                System.out.println("                         |      |");
                System.out.println("                         |      |");
                System.out.println("                         |      |");
                System.out.println("                         --------");

            } else if (counter == 1) {

                System.out.println("   ");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                        --------");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        --------");

            } else if (counter == 2) {

                System.out.println();
                System.out.println("              ______________");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                        --------");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        --------");

            } else if (counter == 3) {

                System.out.println();
                System.out.println("   __________________________");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                        --------");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        --------");

            } else if (counter == 4) {

                System.out.println();
                System.out.println("Helppp Last chance!!!");
                System.out.println("   __________________________");
                System.out.println("   |                         |");
                System.out.println("   |                         |");
                System.out.println("   |                         |");
                System.out.println("                             |");
                System.out.println("                             |");
                System.out.println("                             |");
                System.out.println("                             |");
                System.out.println("                        --------");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        |      |");
                System.out.println("                        --------");

            }

            System.out.println("Guess a Letter");
            char guessedLetter = userInput.next().charAt(0);

            for (int i = 0; i < generatedWord.length(); i++) {

                System.out.print(hidden2(generatedWord.length(), generatedWord, guessedLetter, neww)[i] + " ");

            }
            if (checker(neww, guessedLetter) && correct(neww)) {
                counter = 6;
                break;

            } else if (checker(neww, guessedLetter) && !correct(neww)) {

            } else {
                counter++;
            }
            neww = hidden2(generatedWord.length(), generatedWord, guessedLetter, neww);

        }

        // win
        if (counter == 6) {

            System.out.println();
            System.out.println("Thank you!! Im safe");
            System.out.println("  00000                      ");
            System.out.println(" ( *|* )                     ");
            System.out.println("    O                        ");
            System.out.println("  00000                      ");
            System.out.println("    |                    ");
            System.out.println("    |                    ");
            System.out.println("    |                    ");
            System.out.println("    |                    ");
            System.out.println("   /|/                   ");

        }
        // lose
        else {

            System.out.println("you lose!!, The word was : " + generatedWord);
            System.out.println("   __________________________");
            System.out.println("   |                         |");
            System.out.println("   |                         |");
            System.out.println("   |                         |");
            System.out.println("  00000                      |");
            System.out.println(" ( *|* )                     |");
            System.out.println("    O                        |");
            System.out.println("  00000                      |");
            System.out.println("    |                    --------");
            System.out.println("    |                    |      |");
            System.out.println("    |                    |      |");
            System.out.println("    |                    |      |");
            System.out.println("   /|/                   --------");

        }

    }

    // generates a random word from array
    static String wordGenerator() {

        String[] words = { "happy", "sad", "angry", "chrome" };

        Random rand = new Random();
        int value = (int) rand.nextInt(4);

        return words[value];

    }

    // generates a hidden bar from the generated random word
    static char[] hidden(int length) {

        char[] hiddenWord = new char[length];

        for (int i = 0; i < length; i++) {

            hiddenWord[i] = '_';
        }
        return hiddenWord;
    }

    // checks if the entered letter is a match with any letter from the word
    static char[] hidden2(int length, String word, char guessedLetter, char[] hiddenWord) {

        for (int i = 0; i < length; i++) {

            if (word.charAt(i) == guessedLetter) {

                hiddenWord[i] = guessedLetter;
            }

            else {

                continue;
            }

        }
        return hiddenWord;
    }

    // checks to give the player a chance if they are correct
    static boolean checker(char[] go, char guessedLetter) {

        int counter = 0;
        for (int i = 0; i < go.length; i++) {

            if (go[i] == guessedLetter) {

                counter++;

            } else {
                continue;
            }

        }
        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }

    // checks if all the letters are correct
    static boolean correct(char[] go) {

        int counter = 0;

        for (int i = 0; i < go.length; i++) {

            if (go[i] != '_') {

                counter++;
            } else {
                continue;
            }
        }

        if (counter == go.length) {
            return true;
        } else {
            return false;
        }
    }

}
