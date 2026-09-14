import java.util.Arrays;

public class MedianOfTwoArrays {

    static double medianOf2(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int arr[] = new int[m + n];

        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            arr[n + i] = b[i];
        }

        Arrays.sort(arr);

        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3};
        int[] b1 = {2};
        System.out.println("Median: " + medianOf2(a1, b1)); // expect 2.0

        int[] a2 = {1, 2};
        int[] b2 = {3, 4};
        System.out.println("Median: " + medianOf2(a2, b2)); // expect 2.5

        int[] a3 = {0, 0};
        int[] b3 = {0, 0};
        System.out.println("Median: " + medianOf2(a3, b3)); // expect 0.0
    }
}