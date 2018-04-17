package tejadoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kasir on 4/2/2018.
 */
public class PossibleWaySum {
    public static int count = 0 ;
    static void sum(int[] arr, int i, int sum, int target, String s)
    {
        for(int j = i+1; j<arr.length; j++){
            if(sum+arr[j] == target){
                //if(s.replaceAll(" ", "").length()==4)
                count++;
            }else{
                sum(arr, j, sum+arr[j], target, s+" "+String.valueOf(arr[j]));
            }
        }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = in.readLine()) != null)
        {
            String[] arr = s.split(",");
            int[] numbers = new int[arr.length];

            for(int i = 0; i < arr.length; i++) {
                try{
                    numbers[i] = Integer.parseInt(arr[i]);
                }
                catch(ArrayIndexOutOfBoundsException exception) {}
            }

            for(int i =0; i<numbers.length; i++){
                sum(numbers, i, numbers[i], 0, String.valueOf(numbers[i]));
            }
            System.out.println(count);
            System.exit(0);
        }
    }
}
