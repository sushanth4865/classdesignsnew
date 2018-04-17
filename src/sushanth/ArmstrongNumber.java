package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 = 153
public class ArmstrongNumber {
    public static void main(String[] sushanth)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int sum = 0;
        int temp =number;
        while(number>0) {
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum == temp)
        {
            System.out.println("ArmstrongNumber");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
}
