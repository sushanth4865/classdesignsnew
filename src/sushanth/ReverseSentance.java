package sushanth;

/**
 * Created by kasir on 4/2/2018.
 */
import java.util.*;

public class ReverseSentance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance");
        String inputString = sc.nextLine();

        String[] words = inputString.split(" ");
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = words.length-1 ; i >= 0; i--) {
//            stringBuilder = stringBuilder.append(words[i]).append(" ");
//        }
//        inputString = stringBuilder.toString();
        inputString = words[1]+" "+words[0];
        System.out.println(inputString);
    }
}
