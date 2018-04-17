package tejadoc;

/**
 * Created by kasir on 4/2/2018.
 */
public class HiddenNumber {
    public static void main(String[] args){
        String s = "a12daknxd";
        String result = "";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='j')
            {
                result +=c-'a';
            }
            else if(c>='0'&&c<='9')
            {
                result+=c;
            }
            if(result.equalsIgnoreCase("")){
                System.out.print("NONE");
            }
            else
            {
                System.out.print(result);
            }
        }
    }
}
