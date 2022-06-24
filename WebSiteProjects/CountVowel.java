
import java.util.*;

public class CountVowel {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a character: ");
        char charInput = userInput.next().charAt(0);
        System.out.println("Is your character " + charInput + " a vowel? " + isVowel(charInput));

        System.out.println("Enter a word or a String: ");
        String stringInput = userInput.next();
        int counter = 0;

        for (int i = 0; i < stringInput.length(); i++) {

            if (stringInput.charAt(i) == 'a' || stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'i'
                    || stringInput.charAt(i) == 'o' || stringInput.charAt(i) == 'u') {

                counter++;

            } else {
                continue;
            }
        }

        System.out.println("your word '" + stringInput + "' has " + counter + " vowels");

    }

    static String isVowel(char V) {

        if (V == 'a' || V == 'e' || V == 'i' || V == 'o' || V == 'u') {

            return "True";
        }

        else {

            return "False";
        }
    }

}