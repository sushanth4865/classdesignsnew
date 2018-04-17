package tejadoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kasir on 4/2/2018.
 */
// 776 ab+c
    //similar for subtraction , multiplication and division
public class ExpressionEvaluation {
    public static void main(String[] args) throws IOException
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Projects\\classdesigns\\src\\expressionevaluationfile")))
        {
            String s;
            while((s=bufferedReader.readLine())!=null)
            {
                String numbers = s.split(" ")[0];
                String expression = s.split(" ")[1];
                int operatorInde=0;
                Long output = 0L;
                if(expression.contains("+"))
                {
                    operatorInde = expression.indexOf("+");
                    output = Long.parseLong(numbers.substring(0,operatorInde))+Long.parseLong(numbers.substring(operatorInde,numbers.length()));
                    System.out.print(output);
                }
            }
        }
    }
}
