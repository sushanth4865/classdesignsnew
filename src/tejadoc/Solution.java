package tejadoc;

import java.util.*;

/**
 * Created by kasir on 4/20/2018.
 */
public class Solution {

    static void doThingsWithWords(String line) {
        /*
         * Write your code here.
         */
        //String STDIN = "Ford,Audi,Tesla,Tesla,Honda,GM,GM,Lincoln,Mazda";
        String[] strArr = line.split(",");
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);

        }
        System.out.println("\n");
        Arrays.sort(strArr);
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);

        }
        System.out.println("\n");


        Set<String> result = new LinkedHashSet<String>(Arrays.asList(strArr));
        Iterator iterator = result.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("\n");
        for(String res :result)
        {
            System.out.println(res.length());
            System.out.println("\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line");
        String line = scanner.next();

        doThingsWithWords(line);
    }
}
