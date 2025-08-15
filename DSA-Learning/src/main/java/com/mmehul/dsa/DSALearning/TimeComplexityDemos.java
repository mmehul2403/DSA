public class TimeComplexityDemos {


    //Fastest O(1)  → O(log n)  → O(n)  → O(n log n)  → O(n²) Slowest

    // O(1): constant
    static long constant(int n) {
        long steps = 0;
        steps++; // do one thing regardless of n
        return steps;
    }

    // O(log n): halve each time (like binary search loop)
    static long logarithmic(int n) {
        long steps = 0;
        int x = Math.max(n, 1);
        while (x > 1) {
            x = x / 2;   // cut the problem in half
            steps++;
        }
        return steps;
    }

    // O(n): look at every item once
    static long linear(int n) {
        long steps = 0;
        for (int i = 0; i < n; i++) {
            steps++;
        }
        return steps;
    }

    // O(n log n): do a log-n loop for each of n items
    static long nLogN(int n) {
        long steps = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.max(n, 1);
            while (x > 1) {  // inner log n work
                x = x / 2;
                steps++;
            }
        }
        return steps;
    }

    // O(n^2): nested loops compare every pair
    static long quadratic(int n) {
        long steps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int n = 1024; // try 32, 100, 1000, 10000…

        System.out.println("n = " + n);
        System.out.println("O(1)        steps = " + constant(n));
        System.out.println("O(log n)    steps = " + logarithmic(n));
        System.out.println("O(n)        steps = " + linear(n));
        System.out.println("O(n log n)  steps = " + nLogN(n));
        System.out.println("O(n^2)      steps = " + quadratic(n));
    }
}
