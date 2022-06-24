import java.util.*;

public class SimpleSudokuSolver {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int array[][][][] = new int[3][3][3][3];
        // input in the code
        // int array[][][][] = {

        // { { { 8, 0, 6 }, { 2, 4, 9 }, { 5, 3, 1 } }, { { 0, 5, 3 }, { 0, 0, 8 }, { 7,
        // 0, 9 } },
        // { { 0, 0, 0 }, { 0, 7, 5 }, { 2, 6, 8 } } },
        // { { { 4, 6, 0 }, { 0, 8, 1 }, { 3, 0, 5 } }, { { 7, 1, 8 }, { 5, 0, 0 }, { 4,
        // 2, 6 } },
        // { { 0, 3, 5 }, { 0, 0, 0 }, { 0, 8, 7 } } },
        // { { { 0, 0, 9 }, { 0, 3, 7 }, { 6, 1, 4 } }, { { 3, 8, 0 }, { 4, 0, 6 }, { 0,
        // 5, 2 } },
        // { { 6, 4, 1 }, { 0, 5, 0 }, { 0, 7, 3 } } } };

        // input in program
        System.out.println("Enter values row wise");
        for (int m = 0; m < array.length; m++) {
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array.length; j++) {

                    for (int k = 0; k < array.length; k++) {

                        System.out.print("index: " + m + " " + i + " " + j + " " + k + " : ");

                        array[m][i][j][k] = userInput.nextInt();
                        System.out.println();

                    }
                }
            }
        }

        System.out.println("_____________________________ ");
        for (int m = 0; m < array.length; m++) {
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array.length; j++) {

                    for (int k = 0; k < array.length; k++) {

                        System.out.print(array[m][i][j][k] + " ");
                    }
                    System.out.print("|");
                }
                System.out.println();
                System.out.println("------------------------------ ");
                // System.out.println();
            }
            // System.out.println();
        }

        // Algorithms and rules of the game
        // #1 numbers must not be duplicated in a full table row
        // #2 numbers must not be duplicated in a full column
        // #3 numbers must not be duplicated in a semi table of their own

        int counter = 0;
        // check number of space(0)

        // space counter in each row

        int row1Counter = 0;
        int row2Counter = 0;
        int row3Counter = 0;
        int row4Counter = 0;
        int row5Counter = 0;
        int row6Counter = 0;
        int row7Counter = 0;
        int row8Counter = 0;
        int row9Counter = 0;

        // space counter in each col

        int col1Counter = 0;
        int col2Counter = 0;
        int col3Counter = 0;
        int col4Counter = 0;
        int col5Counter = 0;
        int col6Counter = 0;
        int col7Counter = 0;
        int col8Counter = 0;
        int col9Counter = 0;

        // space counter in each semi box

        int box1Counter = 0;
        int box2Counter = 0;
        int box3Counter = 0;
        int box4Counter = 0;
        int box5Counter = 0;
        int box6Counter = 0;
        int box7Counter = 0;
        int box8Counter = 0;
        int box9Counter = 0;

        /////

        // checking algorithm based on spaces

        while (counter < 81) { // 81 because there are 81 elements in sudoku

            // space conditions

            for (int i = 0; i < array.length; i++) {

                for (int m = 0; m < array.length; m++) {

                    for (int j = 0; j < array.length; j++) {

                        for (int k = 0; k < array.length; k++) {

                            if (i == 0 && m == 0) { // row 1
                                if (array[i][m][j][k] == 0) {
                                    row1Counter++;
                                }
                            } else if (i == 0 && m == 1) { // row 2

                                if (array[i][m][j][k] == 0) {
                                    row2Counter++;
                                }

                            } else if (i == 0 && m == 2) { // row 3

                                if (array[i][m][j][k] == 0) {
                                    row3Counter++;
                                }

                            } else if (i == 1 && m == 0) { // row 4

                                if (array[i][m][j][k] == 0) {
                                    row4Counter++;
                                }

                            } else if (i == 1 && m == 1) { // row 5

                                if (array[i][m][j][k] == 0) {
                                    row5Counter++;
                                }

                            } else if (i == 0 && m == 2) { // row 6

                                if (array[i][m][j][k] == 0) {
                                    row6Counter++;
                                }

                            } else if (i == 2 && m == 0) { // row 7

                                if (array[i][m][j][k] == 0) {
                                    row7Counter++;
                                }

                            } else if (i == 2 && m == 1) { // row 8

                                if (array[i][m][j][k] == 0) {
                                    row8Counter++;
                                }

                            } else if (i == 2 && m == 2) { // row 9

                                if (array[i][m][j][k] == 0) {
                                    row9Counter++;
                                }

                            }

                        }
                    }

                }
            }

            // col spaces

            for (int j = 0; j < array.length; j++) {

                for (int k = 0; k < array.length; k++) {

                    for (int i = 0; i < array.length; i++) {

                        for (int m = 0; m < array.length; m++) {

                            if (j == 0 && k == 0) { // row 1
                                if (array[i][m][j][k] == 0) {
                                    col1Counter++;
                                }
                            } else if (j == 0 && k == 1) { // row 2

                                if (array[i][m][j][k] == 0) {
                                    col2Counter++;
                                }

                            } else if (j == 0 && k == 2) { // row 3

                                if (array[i][m][j][k] == 0) {
                                    col3Counter++;
                                }

                            } else if (j == 1 && k == 0) { // row 4

                                if (array[i][m][j][k] == 0) {
                                    col4Counter++;
                                }

                            } else if (j == 1 && k == 1) { // row 5

                                if (array[i][m][j][k] == 0) {
                                    col5Counter++;
                                }

                            } else if (j == 0 && k == 2) { // row 6

                                if (array[i][m][j][k] == 0) {
                                    col6Counter++;
                                }

                            } else if (j == 2 && k == 0) { // row 7

                                if (array[i][m][j][k] == 0) {
                                    col7Counter++;
                                }

                            } else if (j == 2 && k == 1) { // row 8

                                if (array[i][m][j][k] == 0) {
                                    col8Counter++;
                                }

                            } else if (j == 2 && k == 2) { // row 9

                                if (array[i][m][j][k] == 0) {
                                    col9Counter++;
                                }

                            }

                        }
                    }

                }
            }

            // box spaces

            for (int m = 0; m < array.length; m++) {

                for (int j = 0; j < array.length; j++) {

                    for (int i = 0; i < array.length; i++) {

                        for (int k = 0; k < array.length; k++) {

                            if (m == 0 && j == 0) { // Box 1

                                if (array[m][i][j][k] == 0) {
                                    box1Counter++;
                                }

                            } else if (m == 0 && j == 1) { // Box 2

                                if (array[m][i][j][k] == 0) {
                                    box2Counter++;
                                }

                            } else if (m == 0 && j == 2) { // Box 3

                                if (array[m][i][j][k] == 0) {
                                    box3Counter++;
                                }

                            } else if (m == 1 && j == 0) { // Box 4

                                if (array[m][i][j][k] == 0) {
                                    box4Counter++;
                                }

                            } else if (m == 1 && j == 1) { // Box 5

                                if (array[m][i][j][k] == 0) {
                                    box5Counter++;
                                }

                            } else if (m == 1 && j == 2) { // Box 6

                                if (array[m][i][j][k] == 0) {
                                    box6Counter++;
                                }

                            } else if (m == 2 && j == 0) { // Box 7

                                if (array[m][i][j][k] == 0) {
                                    box7Counter++;
                                }

                            } else if (m == 2 && j == 1) { // Box 8

                                if (array[m][i][j][k] == 0) {
                                    box8Counter++;
                                }

                            } else if (m == 2 && j == 2) { // Box 9

                                if (array[m][i][j][k] == 0) {
                                    box9Counter++;
                                }

                            }

                        }
                    }

                }
            }

            // space case 1 and 2

            if (row1Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 1)[m][i][j][k];

                            }
                        }

                    }

                }
                row1Counter--;
            } else if (row2Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 2)[m][i][j][k];

                            }
                        }

                    }

                }
                row2Counter--;
            } else if (row3Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 3)[m][i][j][k];

                            }
                        }

                    }

                }
                row3Counter--;
            } else if (row4Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 4)[m][i][j][k];

                            }
                        }

                    }

                }
                row4Counter--;
            } else if (row5Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 5)[m][i][j][k];

                            }
                        }

                    }

                }
                row5Counter--;
            } else if (row6Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 6)[m][i][j][k];

                            }
                        }

                    }

                }
                row6Counter--;
            } else if (row7Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 7)[m][i][j][k];

                            }
                        }

                    }

                }
                row7Counter--;
            } else if (row8Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 8)[m][i][j][k];

                            }
                        }

                    }

                }
                row8Counter--;
            } else if (row9Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullrowChecker(array, 9)[m][i][j][k];

                            }
                        }

                    }

                }
                row9Counter--;
            } else if (box1Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 1)[m][i][j][k];

                            }
                        }

                    }

                }
                box1Counter--;
            } else if (box2Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 2)[m][i][j][k];

                            }
                        }

                    }

                }
                box2Counter--;
            } else if (box3Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 3)[m][i][j][k];

                            }
                        }

                    }

                }
                box3Counter--;
            } else if (box4Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 4)[m][i][j][k];

                            }
                        }

                    }

                }
                box4Counter--;
            } else if (box5Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 5)[m][i][j][k];

                            }
                        }

                    }

                }
                box5Counter--;
            } else if (box6Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 6)[m][i][j][k];

                            }
                        }

                    }

                }
                box6Counter--;
            } else if (box7Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 7)[m][i][j][k];

                            }
                        }

                    }

                }
                box7Counter--;
            } else if (box8Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 8)[m][i][j][k];

                            }
                        }

                    }

                }
                box8Counter--;
            } else if (box9Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = SemiBoxChecker(array, 9)[m][i][j][k];

                            }
                        }

                    }

                }
                box9Counter--;
            } else if (col1Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 1)[m][i][j][k];

                            }
                        }

                    }

                }
                col1Counter--;
            } else if (col2Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 2)[m][i][j][k];

                            }
                        }

                    }

                }
                col2Counter--;
            } else if (col3Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 3)[m][i][j][k];

                            }
                        }

                    }

                }
                col3Counter--;
            } else if (col4Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 4)[m][i][j][k];

                            }
                        }

                    }

                }
                col4Counter--;
            } else if (col5Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 5)[m][i][j][k];

                            }
                        }

                    }

                }
                col5Counter--;
            } else if (col6Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 6)[m][i][j][k];

                            }
                        }

                    }

                }
                col6Counter--;
            } else if (col7Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 7)[m][i][j][k];

                            }
                        }

                    }

                }
                col8Counter--;
            } else if (col8Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 8)[m][i][j][k];

                            }
                        }

                    }

                }
                col8Counter--;
            } else if (col9Counter == 1) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = FullcolumnChecker(array, 9)[m][i][j][k];

                            }
                        }

                    }

                }
                col9Counter--;
            } else if (row1Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 1)[m][i][j][k];

                            }
                        }

                    }

                }
                row1Counter--;
            } else if (row2Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 2)[m][i][j][k];

                            }
                        }

                    }

                }
                row2Counter--;
            } else if (row3Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 3)[m][i][j][k];

                            }
                        }

                    }

                }
                row3Counter--;
            } else if (row4Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 4)[m][i][j][k];

                            }
                        }

                    }

                }
                row4Counter--;
            } else if (row5Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 5)[m][i][j][k];

                            }
                        }

                    }

                }
                row5Counter--;
            } else if (row6Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 6)[m][i][j][k];

                            }
                        }

                    }

                }
                row6Counter--;
            } else if (row7Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 7)[m][i][j][k];

                            }
                        }

                    }

                }
                row7Counter--;
            } else if (row8Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 8)[m][i][j][k];

                            }
                        }

                    }

                }
                row8Counter--;
            } else if (row9Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablerowPositionChecker(array, 9)[m][i][j][k];

                            }
                        }

                    }

                }
                row9Counter--;
            } else if (col1Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 1)[m][i][j][k];

                            }
                        }

                    }

                }
                col1Counter--;

            } else if (col2Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 2)[m][i][j][k];

                            }
                        }

                    }

                }
                col2Counter--;
            } else if (col3Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 3)[m][i][j][k];

                            }
                        }

                    }

                }
                col3Counter--;
            } else if (col4Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 4)[m][i][j][k];

                            }
                        }

                    }

                }
                col4Counter--;
            } else if (col5Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 5)[m][i][j][k];

                            }
                        }

                    }

                }
                col5Counter--;
            } else if (col6Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 6)[m][i][j][k];

                            }
                        }

                    }

                }
                col6Counter--;
            } else if (col7Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 7)[m][i][j][k];

                            }
                        }

                    }

                }
                col7Counter--;
            } else if (col8Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 8)[m][i][j][k];

                            }
                        }

                    }

                }
                col8Counter--;
            } else if (col9Counter == 2) {

                for (int m = 0; m < array.length; m++) {
                    for (int i = 0; i < array.length; i++) {

                        for (int j = 0; j < array.length; j++) {

                            for (int k = 0; k < array.length; k++) {

                                array[m][i][j][k] = probablecolPositionChecker(array, 9)[m][i][j][k];

                            }
                        }

                    }

                }
                col9Counter--;
            }

            // for resetting counters

            // rows

            row1Counter = 0;
            row2Counter = 0;
            row3Counter = 0;
            row4Counter = 0;
            row5Counter = 0;
            row6Counter = 0;
            row7Counter = 0;
            row8Counter = 0;
            row9Counter = 0;

            ///////

            // cols

            col1Counter = 0;
            col2Counter = 0;
            col3Counter = 0;
            col4Counter = 0;
            col5Counter = 0;
            col6Counter = 0;
            col7Counter = 0;
            col8Counter = 0;
            col9Counter = 0;

            //////

            // for semiBoxes

            box1Counter = 0;
            box2Counter = 0;
            box3Counter = 0;
            box4Counter = 0;
            box5Counter = 0;
            box6Counter = 0;
            box7Counter = 0;
            box8Counter = 0;
            box9Counter = 0;

            counter++;
        }

        // output
        System.out.println("_____________________________ ");
        for (int m = 0; m < array.length; m++) {
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array.length; j++) {

                    for (int k = 0; k < array.length; k++) {

                        System.out.print(array[m][i][j][k] + " ");
                    }
                    System.out.print("|");
                }
                System.out.println();
                System.out.println("------------------------------ ");
                // System.out.println();
            }
            // System.out.println();
        }

    }

    static int[][][][] FullrowChecker(int[][][][] array, int rowNum) {

        int rowzeroCounter = 0;
        int sumNine = 45;
        int sum = 0;
        int missing = 0;
        List<Integer> row = new ArrayList<>();
        int[] rowSpace = new int[4];

        for (int i = 0; i < array.length; i++) {

            for (int m = 0; m < array.length; m++) {

                for (int j = 0; j < array.length; j++) {

                    for (int k = 0; k < array.length; k++) {

                        if (i == 0 && m == 0 && rowNum == 1) { // row 1
                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }

                        } else if (i == 0 && m == 1 && rowNum == 2) { // row 2

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }

                        } else if (i == 0 && m == 2 && rowNum == 3) { // row 3

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        } else if (i == 1 && m == 0 && rowNum == 4) { // row 4

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        } else if (i == 1 && m == 1 && rowNum == 5) { // row 5

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        } else if (i == 0 && m == 2 && rowNum == 6) { // row 6

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }

                        } else if (i == 2 && m == 0 && rowNum == 7) { // row 7

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        } else if (i == 2 && m == 1 && rowNum == 8) { // row 8

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        } else if (i == 2 && m == 2 && rowNum == 9) { // row 9

                            row.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                rowSpace[0] = i;
                                rowSpace[1] = m;
                                rowSpace[2] = j;
                                rowSpace[3] = k;
                                rowzeroCounter = 1;
                            }
                        }

                    }
                }

            }
        }

        if (rowzeroCounter == 1) {

            for (int z = 0; z < row.size(); z++) {

                sum = sum + row.get(z);
            }

            missing = sumNine - sum;
            sum = 0;
            array[rowSpace[0]][rowSpace[1]][rowSpace[2]][rowSpace[3]] = missing;

        }

        return array;
    }

    static int[][][][] FullcolumnChecker(int[][][][] array, int colNum) {

        int colzeroCounter = 0;
        int sumNine = 45;
        int sum = 0;
        int missing = 0;
        List<Integer> col = new ArrayList<>();
        int[] colSpace = new int[4];

        //

        for (int j = 0; j < array.length; j++) {

            for (int k = 0; k < array.length; k++) {

                for (int i = 0; i < array.length; i++) {

                    for (int m = 0; m < array.length; m++) {

                        if (j == 0 && k == 0 && colNum == 1) { // col 1

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter = 1;
                            }

                        } else if (j == 0 && k == 1 && colNum == 2) { // col 2

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter = 1;
                            }

                        } else if (j == 0 && k == 2 && colNum == 3) { // col 3

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter = 1;
                            }

                        } else if (j == 1 && k == 0 && colNum == 4) { // col 4

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter = 1;
                            }
                        } else if (j == 1 && k == 1 && colNum == 5) { // col 5

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter = 1;
                            }

                        } else if (j == 1 && k == 2 && colNum == 6) { // col 6

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter++;
                            }

                        } else if (j == 2 && k == 0 && colNum == 7) { // col 7

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter++;
                            }
                        } else if (j == 2 && k == 1 && colNum == 8) { // row 8

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter++;
                            }

                        } else if (j == 2 && k == 2 && colNum == 9) { // row 9

                            col.add(array[i][m][j][k]);

                            if (array[i][m][j][k] == 0) {

                                colSpace[0] = i;
                                colSpace[1] = m;
                                colSpace[2] = j;
                                colSpace[3] = k;
                                colzeroCounter++;
                            }
                        }

                    }
                }

            }
        }

        //
        // // for col 1
        if (colzeroCounter == 1) {

            for (int z = 0; z < col.size(); z++) {

                sum = sum + col.get(z);
            }

            missing = sumNine - sum;
            sum = 0;
            array[colSpace[0]][colSpace[1]][colSpace[2]][colSpace[3]] = missing;

        }

        return array;

    }

    static int[][][][] SemiBoxChecker(int[][][][] array, int boxNum) {

        int BoxzeroCounter = 0;
        int sumNine = 45;
        int sum = 0;
        int missing = 0;
        List<Integer> Box = new ArrayList<>();
        int[] BoxSpace = new int[4];
        //

        for (int m = 0; m < array.length; m++) {

            for (int j = 0; j < array.length; j++) {

                for (int i = 0; i < array.length; i++) {

                    for (int k = 0; k < array.length; k++) {

                        if (m == 0 && j == 0 && boxNum == 1) { // Box 1

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter = 1;

                            }

                        } else if (m == 0 && j == 1 && boxNum == 2) { // Box 2

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 0 && j == 2 && boxNum == 3) { // Box 3

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 1 && j == 0 && boxNum == 4) { // Box 4

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 1 && j == 1 && boxNum == 5) { // Box 5

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 1 && j == 2 && boxNum == 6) { // Box 6

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 2 && j == 0 && boxNum == 7) { // Box 7

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }
                        } else if (m == 2 && j == 1 && boxNum == 8) { // Box 8

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        } else if (m == 2 && j == 2 && boxNum == 9) { // Box 9

                            Box.add(array[m][i][j][k]);

                            if (array[m][i][j][k] == 0) {

                                BoxSpace[0] = m;
                                BoxSpace[1] = i;
                                BoxSpace[2] = j;
                                BoxSpace[3] = k;
                                BoxzeroCounter++;
                            }

                        }

                    }
                }

            }
        }

        //
        // // for Box 1
        if (BoxzeroCounter == 1) {

            for (int z = 0; z < Box.size(); z++) {

                sum = sum + Box.get(z);
            }

            missing = sumNine - sum;
            sum = 0;
            array[BoxSpace[0]][BoxSpace[1]][BoxSpace[2]][BoxSpace[3]] = missing;

        }

        return array;

    }

    static int[][][][] probablerowPositionChecker(int[][][][] array, int rowNum) {

        int[] hole1 = new int[4]; // hole 1 position
        int[] hole2 = new int[4]; // hole 2 position
        int[] hole3 = new int[4]; // hole 3 position
        int[] nine = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // to compare
        int nineCounter = 0;
        int[] rowHolder = new int[9]; // holds the row which has holes
        int holderCounter = 0;
        int holderCounterIndex = 0;
        int missingCounter = 0;
        int foundColumnA1 = 0;
        int foundColumnA2 = 0;
        int foundColumnA3 = 0;
        int foundColumnB1 = 0;
        int foundColumnB2 = 0;
        int foundColumnB3 = 0;
        int foundColumnC1 = 0;
        int foundColumnC2 = 0;
        int foundColumnC3 = 0;

        // int foundColumnD = 0;
        // int foundColumnE = 0;
        // int foundColumnF = 0;

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            for (int m = 0; m < array.length; m++) {

                for (int j = 0; j < array.length; j++) {

                    for (int k = 0; k < array.length; k++) {

                        if (rowNum == 1 && i == 0 && m == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            } else if (array[i][m][j][k] == 0 && counter == 2) {

                                hole3[0] = i;
                                hole3[1] = m;
                                hole3[2] = j;
                                hole3[3] = k;
                                counter++;
                            }

                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 2 && i == 0 && m == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 3 && i == 0 && m == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 4 && i == 1 && m == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 5 && i == 1 && m == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 6 && i == 1 && m == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 7 && i == 2 && m == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 8 && i == 2 && m == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (rowNum == 9 && i == 2 && m == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                rowHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        }

                    }
                }
            }
        }

        // comparision
        int[] missing = new int[missingCounter];

        for (int i = 0; i < rowHolder.length; i++) {

            for (int j = 0; j < nine.length; j++) {

                if (nine[i] == rowHolder[j]) {

                    nineCounter = 0;
                }

                else {
                    nineCounter++;
                }

            }

            if (nineCounter == 9) {

                missing[holderCounterIndex] = nine[i];
                holderCounterIndex++;

            }

            nineCounter = 0;

        }

        // column checker
        for (int i = 0; i < array.length; i++) {

            for (int m = 0; m < array.length; m++) {

                if (array[i][m][hole1[2]][hole1[3]] == missing[0]) {

                    foundColumnA1++;
                } else if (array[i][m][hole1[2]][hole1[3]] == missing[1]) {

                    foundColumnA2++;

                } else if (array[i][m][hole1[2]][hole1[3]] == missing[2]) {

                    foundColumnA3++;

                } else if ((array[i][m][hole2[2]][hole2[3]] == missing[0])) {

                    foundColumnB1++;
                } else if ((array[i][m][hole2[2]][hole2[3]] == missing[1])) {

                    foundColumnB2++;
                } else if ((array[i][m][hole2[2]][hole2[3]] == missing[2])) {

                    foundColumnB3++;
                } else if ((array[i][m][hole3[2]][hole3[3]] == missing[0])) {

                    foundColumnC1++;
                } else if ((array[i][m][hole3[2]][hole3[3]] == missing[1])) {

                    foundColumnC2++;
                } else if ((array[i][m][hole3[2]][hole3[3]] == missing[2])) {

                    foundColumnC3++;
                }

            }
        }

        if (counter > 0) {

            if (foundColumnA1 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[0];

            }

            else if (foundColumnA2 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[1];

            } else if (foundColumnA3 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[2];

            }

            else if (foundColumnB1 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[0];

            } else if (foundColumnB2 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[1];

            } else if (foundColumnB3 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[2];

            } else if (foundColumnC1 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[0];

            } else if (foundColumnC2 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[1];

            } else if (foundColumnC3 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[2];

            }

            return array;

        }

        else {

            return array;

        }

    }

    static int[][][][] probablecolPositionChecker(int[][][][] array, int colNum) {

        int[] hole1 = new int[4]; // hole 1 position
        int[] hole2 = new int[4]; // hole 2 position
        int[] hole3 = new int[4]; // hole 3 position
        int[] nine = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // to compare
        int nineCounter = 0;
        int[] columnHolder = new int[9]; // holds the col which has holes
        int holderCounter = 0;
        int holderCounterIndex = 0;
        int missingCounter = 0;
        int foundRowA1 = 0;
        int foundRowA2 = 0;
        int foundRowA3 = 0;
        int foundRowB1 = 0;
        int foundRowB2 = 0;
        int foundRowB3 = 0;
        int foundRowC1 = 0;
        int foundRowC2 = 0;
        int foundRowC3 = 0;

        int counter = 0;

        for (int j = 0; j < array.length; j++) {

            for (int k = 0; k < array.length; k++) {

                for (int i = 0; i < array.length; i++) {

                    for (int m = 0; m < array.length; m++) {

                        if (colNum == 1 && j == 0 && k == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            } else if (array[i][m][j][k] == 0 && counter == 2) {

                                hole3[0] = i;
                                hole3[1] = m;
                                hole3[2] = j;
                                hole3[3] = k;
                                counter++;
                            }

                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 2 && j == 0 && k == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 3 && j == 0 && k == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 4 && j == 1 && k == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 5 && j == 1 && k == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 6 && j == 1 && k == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 7 && j == 2 && k == 0) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 8 && j == 2 && k == 1) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        } else if (colNum == 9 && j == 2 && k == 2) {

                            if (holderCounter == 9) {

                                continue;
                            } else {

                                columnHolder[holderCounter] = array[i][m][j][k];

                            }

                            if (array[i][m][j][k] == 0 && counter == 0) { // col = i , m

                                hole1[0] = i;
                                hole1[1] = m;
                                hole1[2] = j;
                                hole1[3] = k;
                                counter++;

                            }

                            else if (array[i][m][j][k] == 0 && counter == 1) {

                                hole2[0] = i;
                                hole2[1] = m;
                                hole2[2] = j;
                                hole2[3] = k;
                                counter++;
                            }
                            missingCounter++;
                            holderCounter++;
                        }

                    }
                }
            }
        }

        // comparision
        int[] missing = new int[missingCounter];

        for (int i = 0; i < columnHolder.length; i++) {

            for (int j = 0; j < nine.length; j++) {

                if (nine[i] == columnHolder[j]) {

                    nineCounter = 0;
                }

                else {
                    nineCounter++;
                }

            }

            if (nineCounter == 9) {

                missing[holderCounterIndex] = nine[i];
                holderCounterIndex++;

            }

            nineCounter = 0;

        }

        // row checker
        for (int i = 0; i < array.length; i++) {

            for (int m = 0; m < array.length; m++) {

                if (array[hole1[0]][hole1[1]][i][m] == missing[0]) {

                    foundRowA1++;
                } else if (array[hole1[0]][hole1[1]][i][m] == missing[1]) {

                    foundRowA2++;

                } else if (array[hole1[0]][hole1[1]][i][m] == missing[2]) {

                    foundRowA3++;

                } else if ((array[hole2[0]][hole2[1]][i][m] == missing[0])) {

                    foundRowB1++;
                } else if ((array[hole2[0]][hole2[1]][i][m] == missing[1])) {

                    foundRowB2++;
                } else if ((array[hole2[0]][hole2[1]][i][m] == missing[2])) {

                    foundRowB3++;
                } else if ((array[hole3[0]][hole3[1]][i][m] == missing[0])) {

                    foundRowC1++;
                } else if ((array[hole3[0]][hole3[1]][i][m] == missing[1])) {

                    foundRowC2++;
                } else if ((array[hole3[0]][hole3[1]][i][m] == missing[2])) {

                    foundRowC3++;
                }

            }
        }

        if (counter > 0) {

            if (foundRowA1 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[0];

            }

            else if (foundRowA2 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[1];

            } else if (foundRowA3 == 0) {

                array[hole1[0]][hole1[1]][hole1[2]][hole1[3]] = missing[2];

            }

            else if (foundRowB1 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[0];

            } else if (foundRowB2 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[1];

            } else if (foundRowB3 == 0) {

                array[hole2[0]][hole2[1]][hole2[2]][hole2[3]] = missing[2];

            } else if (foundRowC1 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[0];

            } else if (foundRowC2 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[1];

            } else if (foundRowC3 == 0) {

                array[hole3[0]][hole3[1]][hole3[2]][hole3[3]] = missing[2];

            }

            return array;

        }

        else {

            return array;

        }

    }

}
