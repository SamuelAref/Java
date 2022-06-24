import java.util.*;

public class DigitalNumbers {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String a = "---"; // -----
        String b = "|"; // | |
        String c = "|"; // -----
        String d = "---";// | |
        String e = "|"; // -----
        String f = "|";
        String g = "-";

        System.out.println("Enter Number: ");
        int value = userInput.nextInt();

        System.out.println(a);
        System.out.println(f + " " + b);
        System.out.println(" " + g + " ");
        System.out.println(e + " " + c);
        System.out.println(d);

        if (value == 1) {

            a = " ";
            d = " ";
            e = " ";
            f = " ";
            g = " ";

        } else if (value == 2) {

            c = " ";
            f = " ";
        }

        else if (value == 3) {
            e = " ";
            f = " ";

        } else if (value == 4) {

            a = " ";
            d = " ";
            e = " ";
        }

        else if (value == 5) {
            b = " ";
            e = " ";
        }

        else if (value == 6) {

            b = " ";
        } else if (value == 7) {

            d = " ";
            e = " ";
            f = " ";
            g = " ";
        } else if (value == 8) {

        } else if (value == 9) {

            e = " ";
        }

        else {
            System.out.println("valid");
        }

        System.out.println(a);
        System.out.println(f + " " + b);
        System.out.println(" " + g + " ");
        System.out.println(e + " " + c);
        System.out.println(d);

    }
}
