public class TwoArrayCommon {

    public static void main(String[] args) {

        int[] arrayone = { 1, 2, 3, 4, 6 };
        int[] arraytwo = {3,4,5};

        for (int i = 0; i < arrayone.length; i++) {

            System.out.print(f(arrayone, arraytwo)[i]);
        }

    }

    static int[] f(int[] first, int[] second) {

        int[] newarray = new int[first.length];
        int counter = -1;
        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j]) {
                    counter++;
                    newarray[counter] = second[j];

                }
            }
        }

        return newarray;
    }

}