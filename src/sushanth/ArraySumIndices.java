package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 6/27/2018.
 */
public class ArraySumIndices {

   public static int[] solution(int[] A, int X)
    {
        int[] result = new int[2];
        for(int i=0; i<A.length; i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[i]+A[j] == X && i!=j)
                {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
                else
                {
                    result[0]=-1;
                    result[1]=-1;
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter int array");
        String SA = scanner.nextLine();
        String[] s = SA.split("");
        int[] A = new int[s.length];

        for (int i = 0; i < s.length; i++) {
                A[i] = Integer.parseInt(s[i]);

        }
        System.out.println("Please enter X value");
        int X = scanner.nextInt();
        int[] result = solution(A,X);
        for(int i =0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
