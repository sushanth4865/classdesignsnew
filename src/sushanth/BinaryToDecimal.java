package sushanth;

/**
 * Created by kasir on 4/2/2018.
 */
public class BinaryToDecimal {
    public static void main(String... args)
    {
        String binary = "101010";
        String decimalNum = "50";
        int decimal = 50;
        int binaryInt = 101010;
        int decimalNumber = Integer.parseInt(binary,2);
        String binary3 = Integer.toBinaryString(decimal);
        String hex = Integer.toHexString(decimal);
        System.out.println(decimalNumber);
        System.out.println(binary3);
        System.out.println(hex);
    }
}
