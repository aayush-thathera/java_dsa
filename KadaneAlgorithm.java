class KadaneAlgorithm {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];     // Stores the overall max sum
        int currentMax = arr[0];   // Stores the max sum ending at current index

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
