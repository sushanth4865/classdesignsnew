package sushanth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class LetterMapNum {
    public static Integer map(char c)
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
        map.put('G',7);
        map.put('H',8);

        return map.get(c);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence");
        String sequence = scanner.next();
        char[] arr = sequence.toCharArray();
        String response = "";
        for(char c:arr)
        {
            int result = map(c);
            response = response + result;
        }
        System.out.println(response);
    }
}
