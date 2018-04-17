package tejadoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasir on 4/2/2018.
 */
//1432 for n values absolute value must take all values between 1 and n-1
public class JollyJumper {
    public static void main(String[] args)throws IOException{


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Projects\\codevue\\src\\jollyjuperfile"))){
            String s;


            while((s=bufferedReader.readLine())!=null)
            {
                String[] strarr = s.split(" ");
                int[] result = new int[strarr.length];
                for(int i=0;i<strarr.length;i++)
                {
                    result[i]=Integer.parseInt(strarr[i]);
                }
               String response =  isJollyJumper(result);
                System.out.print(response);
            }

        }
    }

    public static String isJollyJumper(int[] input)
    {
        List<Integer> tempArr = new ArrayList<>();
        for(int i=0;i<input.length-1;i++){
            int diff = Math.abs(input[i]-input[i+1]);
            if(diff==0 || diff>input.length-1){
                return "Not Jolly";
            }
            if (tempArr.contains(diff)) {

                return "Not Jolly";
            }
            tempArr.add(diff);
        }
        return "Jolly";
    }
}
