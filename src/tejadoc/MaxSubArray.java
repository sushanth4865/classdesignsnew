package tejadoc;

/**
 * Created by kasir on 4/2/2018.
 */
//The changing condition for dynamic programming is "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum."
public class MaxSubArray {
    public static void main(String[] args)
    {
       // int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        int[] input = {7,-3,-10,4,2,8,-2,4,-5,-2};
        int max = input[0];
        int[] sum = new int[input.length];
        sum[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            sum[i] = Math.max(input[i], sum[i - 1] + input[i]);
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }
}
