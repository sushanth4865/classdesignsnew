package tejadoc;



/**
 * Created by kasir on 4/20/2018.
 */
public class FizzBuzz {
    //private static  Logger logger = Logger.getLogger("");
    static void fizzBuzz() {
        /*
         * Write your code here.
         */
        for(int i=1;i<=15;i++)
        {
            //printing FizzBuzz for multiples of both 3 and 5
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            //printing Fizz for multiples of 3
            else if(i%3 == 0)
            {
                System.out.println("Fizz");
            }
            //printing Buzz for multiple of 5
            else if(i%5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }

}
