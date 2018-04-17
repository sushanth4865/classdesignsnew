package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class ReturnSecondLastWord {
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter line");
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        System.out.println("enter position");
        int pos = scanner.nextInt();
        String result = arr[arr.length-pos];
        System.out.println(result);
    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a sentance");
//
//        String temp = sc.nextLine();
//        String[] sentanceArray = temp.split(" ");
//
//        System.out.println("Enter the word position from last to find the word");
//        int pos = sc.nextInt();
//
//        String lastWord = sentanceArray[sentanceArray.length-pos];
//
//        System.out.println(lastWord);
//
//        sc.close();
//
//    }
}
