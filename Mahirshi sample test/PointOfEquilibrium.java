public class PointOfEquilibrium {

    public static void main(String[] args) {

        int[] array = { 1, 2, 10, 3, 4 };
        System.out.println(f(array));

    }

    static int f(int[] a) {

        int sumLeft = 0;
        int sumRight = 0;
        int POE = 0;
        boolean verdict = false;

        for (int i = 2; i < a.length; i++) {

            // for left sum
            for (int j = 0; j < i; j++) {

                sumLeft = sumLeft + a[j];

            }
            // for right sum

            for (int j = i + 1; j < a.length; j++) {

                sumRight = sumRight + a[j];
            }

            if (sumLeft == sumRight) {

                POE = i;
                verdict = true;
            }
            sumLeft = 0;
            sumRight = 0;

        }

        if (verdict == true) {

            return POE;

        } else {

            return -1;
        }

    }

}
