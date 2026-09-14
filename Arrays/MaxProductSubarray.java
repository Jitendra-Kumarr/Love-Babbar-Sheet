public class MaxProductSubarray {

    static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = arr[0];
        int prefix = 1, suffix = 1;

        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0) ? 1 : prefix;
            suffix = (suffix == 0) ? 1 : suffix;

            prefix *= arr[i];
            suffix *= arr[n - 1 - i];

            maxProd = Math.max(maxProd, Math.max(prefix, suffix));
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 4},
            {2, 3, -2, 4},
            {-2, 0, -1},
            {-2, 3, -4}
        };

        for (int[] arr : testCases) {
            System.out.print("Array: ");
            printArray(arr);
            System.out.println("Max Product Subarray: " + maxProduct(arr));
            System.out.println();
        }
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}