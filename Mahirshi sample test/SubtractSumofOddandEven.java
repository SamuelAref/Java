public class SubtractSumofOddandEven {

    public static void main(String[] args) {

        int[] oddandeven = { 1, 2, 3, 4 };

        System.out.println(sum(oddandeven));

    }

    static int sum(int[] OddandEven) {

        int X = 0;
        int Y = 0;

        for (int i = 0; i < OddandEven.length; i++) {

            if (OddandEven[i] % 2 == 0) {

                Y = Y + OddandEven[i];

            } else {

                X = X + OddandEven[i];

            }
        }

        return X - Y;
    }

}
