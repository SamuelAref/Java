public class ReversingInteger {

    public static void main(String[] args) {

        System.out.println(f(-5));

    }

    static int f(int n) {

        int holder = n;
        int positive = Math.abs(n);
        int remain = 0;
        int soln = 1;
        int num = 0;

        if (n > -10 && n < 10) {

            return n;
        }

        else {

            while (soln != 0) {

                soln = positive / 10;
                remain = positive % 10;
                num = num + remain;
                positive = soln;
                num *= 10;

            }

            if (holder < 0) {

                num = -1 * num;
            }

            return num / 10;

        }

    }

}
