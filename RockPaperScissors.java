import java.util.*;

public class RockPaperScissors {

    // rock paper scissor

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter rock(r), paper(p), or scissors(s): ");

        char userResponse = userInput.next().charAt(0);

        RockPaperScissor(userResponse, random());

        // RockPaperScissor(userResponse, random());

    }

    static void RockPaperScissor(char user, int randomNum) {

        char[] computer = { 'r', 'p', 's' };

        System.out.println(randomNum);

        switch (user) {

        case 'r':

            System.out.println(computer[randomNum] + " vs " + user);

            if (computer[randomNum] == 'r') {

                System.out.println("Tie");

            }

            else if (computer[randomNum] == 's') {

                System.out.println("you win");

            } else {

                System.out.println("you lose");
            }
            break;

        case 'p':

            System.out.println(computer[randomNum] + " vs " + user);

            if (computer[randomNum] == 'p') {

                System.out.println("Tie");
            }

            else if (computer[randomNum] == 'r') {

                System.out.println("you win");
            }

            else {

                System.out.println("you lose");
            }
            break;

        case 's':

            System.out.println(computer[randomNum] + " vs " + user);

            if (computer[randomNum] == 's') {

                System.out.println("Tie");
            }

            else if (computer[randomNum] == 'p') {

                System.out.println("you win");
            }

            else {

                System.out.println("you lose");
            }
            break;

        }
    }

    static int random() {

        Random rand = new Random();
        return rand.nextInt(3);
    }

}
