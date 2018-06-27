package tejadoc;

import java.util.*;

/**
 * Created by kasir on 4/20/2018.
 */
public class Solution {

    static void doThingsWithWords() {
        /*
         * Write your code here.
         */
        //String STDIN = "Ford,Audi,Tesla,Tesla,Honda,GM,GM,Lincoln,MazdaFord,Audi,Tesla,Tesla,Honda,GM,GM,Lincoln,Mazda";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line");
        String line = scanner.next();
        String[] strArr = line.split(",");
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);

        }
        System.out.println(" ");
        Arrays.sort(strArr);
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);

        }
        System.out.println(" ");


        Set<String> result = new LinkedHashSet<String>(Arrays.asList(strArr));
        Iterator iterator = result.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(" ");
        for(String res :result)
        {
            System.out.println(res.length());
            //System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {


        doThingsWithWords();
    }
}
