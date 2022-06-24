public class BinarySearch {

    public static void main(String[] args) {

        // Binary search -> divide and conquer
        // | | \ \ \ \ \ \ \ |
        // let array= {1,2,3,| 4,5,6,7} we divide the array and check if the desired
        // number is equal, below or above the midpoint, we repeat this process until we
        // find the number
        // | | \ \ \ \ \ \ \ |

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };

        final long startTime2 = System.nanoTime();

        System.out.println(naiveSearch(array, 39));

        final long endTime2 = System.nanoTime();

        System.out.println("total: " + (endTime2 - startTime2));

        final long startTime1 = System.nanoTime();

        System.out.println(binary(array, 39));

        final long endTime1 = System.nanoTime();

        System.out.println("total: " + (endTime1 - startTime1));

    }

    static boolean naiveSearch(int[] array, int num) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == num) {
                counter++;

            }
        }

        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }

    static int binary(int[] array, int num) {

        int high = array.length - 1;
        int low = 0;
        int mid = 0;

        int counter = 0;

        // int check = 0;

        // // first we have to sort it in ascending order;

        // for (int i = 0; i < array.length; i++) {

        // for (int j = 0; j < array.length; j++) {

        // if (array[i] < array[j]) {

        // check = array[i];
        // array[i] = array[j];
        // array[j] = check;

        // }
        // }
        // }

        // then we can make binary search

        while (counter < array.length) {

            mid = (high + low) / 2;

            if (num == array[mid]) {

                counter = array.length;

            } else if (num < array[mid]) {
                high = mid - 1;
            } else if (num > array[mid]) {
                low = mid + 1;
            }
        }

        if (counter == array.length) {
            return mid;
        } else {
            return -1;
        }

    }
}
