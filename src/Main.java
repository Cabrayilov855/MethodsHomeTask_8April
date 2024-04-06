// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Task 1 binary search
        int[] array = {1,2,3,5,7,9,14,17,21};
        int searchedNumber = 9;
        int index = binarySearch(array, searchedNumber);
        if (index != -1) {
            System.out.println("Searched number " + searchedNumber+ " found." + searchedNumber +
                    "\nSearched number index : " + index);
        } else {
            System.out.println("Searched number not found.");
        }

        //Task 2 rekucive function fibonacci
        int n = 10;
        System.out.println("Fibonacci : " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

}