package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class Palendrom {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        String original = sc.nextLine();
        String reverse = "";
        char[] origArr = original.toCharArray();
        for(int i = origArr.length-1;i>=0;i--)
        {
            reverse = reverse + origArr[i];
        }

        if(original.equalsIgnoreCase(reverse))
        {
            System.out.println("Entered string is palendrome");
        }
        else{
            System.out.println("Not a Palendrome");
        }
    }
}
