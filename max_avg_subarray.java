public class max_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {

        double result[] = new double[nums.length - k + 1];
        int windowstart = 0;
        double sum = 0;
        double max = 0;
        for (int windowend = 0; windowend < nums.length; windowend++) {
            sum += nums[windowend];
            if (windowend >= k - 1) {
                result[windowstart] = sum / k;
                sum -= nums[windowstart];
                windowstart++;
            }
        }
        if (result.length == 1)
            return result[0];
        max = result[0];
        for (int i = 0; i < result.length; i++) {

            if (max < result[i])
                max = result[i];
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
