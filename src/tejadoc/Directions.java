package tejadoc;

/**
 * Created by kasir on 4/2/2018.
 */
//x(0,1)
    //y(-2,5)
public class Directions {
    public static void main(String[] args){
        String input = "0,1,-2,5";
        int O = Integer.parseInt(input.split(",")[0]);
        int P = Integer.parseInt(input.split(",")[1]);
        int Q = Integer.parseInt(input.split(",")[2]);
        int R = Integer.parseInt(input.split(",")[3]);
        if(O==Q && P<R)
        {
            System.out.print("North");
        }
        if(O==Q && P>R)
        {
            System.out.print("South");
        }
        if(O>Q && P==R)
        {
            System.out.print("west");
        }
        if(O<Q && P==R)
        {
            System.out.print("east");
        }
        if(O>Q && P<R)
        {
            System.out.print("North-West");
        }
        if(O<Q && P>R)
        {
            System.out.print("South-East");
        }
        if(O>Q && P>R)
        {
            System.out.print("South-West");
        }
        if(O<Q && P<R)
        {
            System.out.print("North-East");
        }
    }
}
