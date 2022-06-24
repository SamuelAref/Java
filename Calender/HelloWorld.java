package Calender;

import java.util.*;

public class HelloWorld {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the list of entry of month: ");
        int response = userInput.nextInt();
        System.out.println("Enter desired year: ");
        int response2 = userInput.nextInt();

        Months first = new Months(response, response2);
        first.output();

    }

}
