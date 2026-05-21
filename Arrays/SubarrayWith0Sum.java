import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWith0Sum {
    static boolean findsum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findsum(arr));

        sc.close();
    }
}
