public class DesiredStartElementArray {

    public static void main(String[] args) {

        char[] alpha = { 'a', 'b', 'c' };

        System.out.println(f(alpha, 1, 0));

    }

    static char[] f(char[] a, int start, int len) {

        char[] ff = new char[len];
        int counter = 0;

        if (a.length < (start + len)) {

            return ff;
        } else {

            for (int i = start; i < (start + len); i++) {

                ff[counter] = a[i];
                counter++;

            }
            return ff;
        }

    }

}
