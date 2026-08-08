public class Task8 {
    // ✅ Method uses varargs: int... numbers
    public static int sumOfSums(int... numbers) {
        int cumulativeSum = 0;

        // Process each parameter
        for (int n : numbers) {
            // ✅ Calculate triangular sum: n*(n+1)/2
            int triangularSum = n * (n + 1) / 2;

            // ✅ Add to cumulative total
            cumulativeSum += triangularSum;

            // ✅ Print in exact required format
            System.out.printf("Parameter %d: sum = %d, cumulative sum = %d%n",
                n, triangularSum, cumulativeSum);
        }

        // ✅ Return final grand total
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Call method with sample input (4, 5, 10)
        int total = sumOfSums(4, 5, 10);

        // ✅ Print final total
        System.out.println("Total sum: " + total);
    }
}
