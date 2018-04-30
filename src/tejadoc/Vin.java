package tejadoc;

import java.util.Scanner;

/**
 * Created by kasir on 4/20/2018.
 */
public class Vin {

    static void testForValidVin() {
        /*
         * Write your code here.
         */
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        if(i.length()==17)
        {
            //if(i.indexOf('$')<0 && i.indexOf('#')<0 && i.indexOf('%')<0 && i.indexOf('&')<0)
            if(!(i.contains("$")||i.contains("#")||i.contains("%")||i.contains("&")))
            {
                if(i.equals("0000000000000TEST")||i.equals("TRAINING123456789")||i.equalsIgnoreCase("NOTAVIN0987654321"))
                {
                    System.out.println("INVALID");
                }
                else{
                    System.out.println("VALID");
                }
            }
            else
            {
                System.out.println("INVALID");
            }

        }
        else
        {
            System.out.println("INVALID");
        }

    }

    public static void main(String[] args)
    {
        testForValidVin();
    }
}
