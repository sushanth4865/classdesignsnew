package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class ExtractingNumberFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence");
        String input = sc.nextLine();

        String result = input.replaceAll("[0-9]", "");

        System.out.println(result);
    }
}
