public class CenteredElement {

    public static void main(String[] args) {

        int[] array = { 4, 4, 3, 5, 4 };

        System.out.println(f(array));

    }

    static int f(int[] given) {

        if (given.length % 2 != 0) {

            double middleElement = given.length / 2;
            int rounder = (int) Math.round(middleElement);
            int counter = 0;

            for (int i = 0; i < given.length; i++) {

                if (given[i] > given[rounder]) {

                    counter++;

                }

            }

            if (counter == (given.length - 1)) {

                return 1;

            }

            else {

                return 0;

            }

        }

        else {

            return -1;

        }
    }

}
