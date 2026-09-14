import java.util.Arrays;

public class TripletSum {

    static boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int needed = target - arr[i];

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == needed) {
                    return true;
                } else if (sum > needed) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] testArrays = {
            {1, 4, 45, 6, 10, 8},
            {1, 2, 4, 3, 6, 7},
            {1, 2, 3, 4, 5},
            {-1, 0, 1, 2, -1, -4}
        };
        int[] targets = {22, 10, 100, 0};

        for (int i = 0; i < testArrays.length; i++) {
            int[] arr = testArrays[i].clone(); // clone so original order is visible before sort
            int target = targets[i];

            System.out.print("Array: ");
            printArray(testArrays[i]);
            System.out.println("Target: " + target);
            System.out.println("Has triplet with given sum? " + hasTripletSum(arr, target));
            System.out.println();
        }
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]);
            if (j != arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}