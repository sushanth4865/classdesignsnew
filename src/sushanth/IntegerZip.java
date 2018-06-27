package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 6/27/2018.
 */
public class IntegerZip {

    public static int solution(int A, int B)
    {
        //returning -1 if A or B is less than 0 or greater than 100000000
        if(A<0||A>100000000||A<0||A>100000000)
        {
            return -1;
        }
        // Converting int to Wrapper class
        Integer IA = new Integer(A);
        Integer IB = new Integer(B);
        // converting to String using utility method
        String a = IA.toString();
        String b = IB.toString();
        //getting array of characters from String using toCharArray()
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        String temp = "";
        for(int i = 0; i<ca.length||i<cb.length;i++)
        {
            if(i<ca.length)
            {
                temp += ca[i];
            }
            if(i<cb.length)
            {
                temp += cb[i];
            }
        }
        int result = Integer.parseInt(temp);
        if(result>100000000)
        {
            return -1;
        }
        return result;
    }

    public static void main(String []sushanth)
    {
        //Reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int A = scanner.nextInt();
        System.out.println("Please enter second integer");
        int B = scanner.nextInt();
        int result = solution(A,B);
        System.out.println("Result is: " +result);
    }
}
