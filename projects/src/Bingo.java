import java.util.*;

public class Bingo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // the bingo board of 5 by 5
        int[][] tenByten = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        System.out.println(" ---------------------");
        for (int i = 0; i < tenByten.length; i++) {

            System.out.print("| ");
            for (int j = 0; j < tenByten.length; j++) {

                if (tenByten[i][j] < 10) {
                    System.out.print(tenByten[i][j] + "   ");

                } else {
                    System.out.print(tenByten[i][j] + "  ");
                }

            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println(" ---------------------");
        // end of board

        // option to call random number
        System.out.println(" 1. call Number");
        int userCall = userInput.nextInt();

        // loop until bingo
        while (userCall == 1) {

            if (checker(caller(userCall, tenByten))) {

                userCall = 2;
            }

            else {

                System.out.println(" 1. call Number");
                userCall = userInput.nextInt();
            }

        }

        System.out.println("Bingooooo!!!! You win");

    }

    static int[][] caller(int go, int[][] array) { // outputs the resulting board after call

        Random rand = new Random();
        int value = (int) rand.nextInt(25) + 1;

        if (go == 1) {

            System.out.println("Called Number = " + value + "!!!");

            System.out.println(" ---------------------");

            for (int i = 0; i < array.length; i++) {

                System.out.print("| ");
                for (int j = 0; j < array.length; j++) {

                    if (array[i][j] < 10) {

                        if (array[i][j] == value) {
                            array[i][j] = 0;

                        }
                        System.out.print(array[i][j] + "   ");

                    }

                    else {
                        if (array[i][j] == value) {
                            array[i][j] = 0;
                        }
                        System.out.print(array[i][j] + "  ");
                    }

                }
                System.out.print("|");
                System.out.println();
            }

            System.out.println(" ---------------------");
        }

        else {

        }
        return array;

    }

    static boolean checker(int[][] array) { // checks if Bingo by row, column and diagonal

        // rows
        if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == array[0][3]
                && array[0][3] == array[0][4]) {

            return true;

        } else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][2] == array[1][3]
                && array[1][3] == array[1][4]) {
            return true;

        } else if (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][2] == array[2][3]
                && array[2][3] == array[2][4]) {
            return true;

        } else if (array[3][0] == array[3][1] && array[3][1] == array[3][2] && array[3][2] == array[3][3]
                && array[3][3] == array[3][4]) {
            return true;

        } else if (array[4][0] == array[4][1] && array[4][1] == array[4][2] && array[4][2] == array[4][3]
                && array[4][3] == array[4][4]) {
            return true;

        }

        // columns

        else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] == array[3][0]
                && array[3][0] == array[4][0]) {
            return true;

        } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == array[3][1]
                && array[3][1] == array[4][1]) {
            return true;

        } else if (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] == array[3][2]
                && array[3][2] == array[4][2]) {
            return true;

        } else if (array[0][3] == array[1][3] && array[1][3] == array[2][3] && array[2][3] == array[3][3]
                && array[3][3] == array[4][3]) {
            return true;

        } else if (array[0][4] == array[1][4] && array[1][4] == array[2][4] && array[2][4] == array[3][4]
                && array[3][4] == array[4][4]) {
            return true;

        }

        // Diagonals

        else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == array[3][3]
                && array[3][3] == array[4][4]) {
            return true;

        } else if (array[0][4] == array[1][3] && array[1][3] == array[2][2] && array[2][2] == array[3][1]
                && array[3][1] == array[4][0]) {
            return true;

        }
        // neither
        else {
            return false;
        }

    }

}
