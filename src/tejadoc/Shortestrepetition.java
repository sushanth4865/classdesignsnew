package tejadoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kasir on 4/2/2018.
 */
// abcabcabcabc
    //period 3 formed by 4 repetitions
    //period 6 formed by 2 repetitions
    //period 12 formed by one repetition
public class Shortestrepetition {
    public static void main(String[] args) throws IOException
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Projects\\classdesigns\\src\\shortestrepetiotionfile")))
        {
            String s;
            while((s=bufferedReader.readLine())!=null)
            {
                for(int i = 1;i<s.length();i++)
                {
                    if(s.length()%i==0){
                        String ss= s.substring(0,i);
                        boolean isRepetition = s.matches("("+ss+")+");
                        if(isRepetition)
                        {
                            System.out.print(i);
                            break;
                        }
                    }
                    //System.out.print(s.length());
                }
                System.out.println(s.length());
            }
            //System.out.println(s.length());
        }
    }
}
