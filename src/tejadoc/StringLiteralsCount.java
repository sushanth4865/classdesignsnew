package tejadoc;

import java.util.Arrays;

/**
 * Created by kasir on 4/2/2018.
 */
public class StringLiteralsCount {
    public static void main(String[] args) {
        String s = "abdbcccddd";

        String output = "";

        int count;

        char[] inputArr = s.trim().toCharArray();

        Arrays.sort(inputArr);

        for (int i = 0; i < inputArr.length; i++) {

            output = output + inputArr[i];
        }

        System.out.println(output);


        String out = "";

        for (int i = 0; i < output.length(); i++) {

            count = 0;

            for (int j = 0; j < output.length(); j++) {

                if (output.charAt(i) == output.charAt(j))

                    count++;
            }

            if (!out.contains(output.substring(i, i + 1)))

                out = out + output.charAt(i) + "" + count;
        }

        System.out.println(out);

    }
}
