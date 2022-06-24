public class HelloWorld {

    public static void main(String[] args) {

        int[] a = { -2, 2, 2, 2 };
        System.out.println(isBalanced(a));

    }

    static int isBalanced(int[] a) {

        Boolean zeroChecker = false;
        int indexSum = 0;
        int balancedSum = 0;

        for (int i = 0; i < a.length; i++) {
            indexSum = indexSum + i;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -1 * a[j]) {
                    if (i == 0) {
                        zeroChecker = true;
                    } else {
                        balancedSum = balancedSum + i;
                    }
                }
            }
        }

        if (balancedSum == indexSum && zeroChecker == true) {
            return 1;
        } else {
            return 0;
        }
    }
}
