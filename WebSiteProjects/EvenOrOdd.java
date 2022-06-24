package WebSiteProjects;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(isEven(4));

    }

    static String isEven(int evenOrodd) {

        if (evenOrodd % 2 == 0) {

            return "True";
        }

        else {

            return "False";
        }
    }

}
