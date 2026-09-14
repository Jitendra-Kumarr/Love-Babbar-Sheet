import java.util.ArrayList;

class AlternatePositiveNegative {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0) {
                positive.add(x);
            } else {
                negative.add(x);
            }
        }

        int i = 0, p = 0, n = 0;
        while (p < positive.size() && n < negative.size()) {
            arr.set(i, positive.get(p));
            i++; p++;

            arr.set(i, negative.get(n));
            i++; n++;
        }
        while (p < positive.size()) {
            arr.set(i, positive.get(p));
            i++; p++;
        }
        while (n < negative.size()) {
            arr.set(i, negative.get(n));
            i++; n++;
        }
    }

    public static void main(String[] args) {
        AlternatePositiveNegative sol = new AlternatePositiveNegative();

        ArrayList<Integer> arr = new ArrayList<>();
        int[] input = {1, 2, 3, -4, -1, 4};
        for (int x : input) {
            arr.add(x);
        }

        System.out.println("Before: " + arr);
        sol.rearrange(arr);
        System.out.println("After:  " + arr);
    }
}