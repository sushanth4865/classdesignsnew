package tejadoc;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by kasir on 4/2/2018.
 */
public class MinimumCoins {
    public static void main(String[] args){
        double total = 1.99;
        int rem = (int)(total*100);
        int quarters = rem/25;
        rem -= quarters*25;
        int dimes = rem/10;
        rem -= dimes*10;
        int nickles = rem/5;
        rem -= nickles*5;
        int penis = rem;
        System.out.print(quarters+""+dimes+""+nickles+""+penis);
    }
}
