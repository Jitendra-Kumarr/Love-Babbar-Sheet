public class ThreeWayPartition {
    static void threeWayPartition(int arr[], int a, int b) {

        int temp[] = new int[arr.length];

        int i = 0;

        for (int x : arr) {
            if (x < a) {
                temp[i] = x;
                i++;
            }
        }

        for (int x : arr) {
            if (x >= a && x <= b) {
                temp[i] = x;
                i++;
            }
        }

        for (int x : arr) {
            if (x > b) {
                temp[i] = x;
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int a = 14, b = 20;

        System.out.print("Before: ");
        printArray(arr);

        threeWayPartition(arr, a, b);

        System.out.print("After:  ");
        printArray(arr);
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