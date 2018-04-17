package tejadoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kasir on 4/2/2018.
 */
public class MixedContent {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Projects\\classdesigns\\src\\mixedcontentfile"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                StringBuilder integers = new StringBuilder();
                StringBuilder strings = new StringBuilder();
                String[] arr = s.split(" ");
                for(int i=0;i<arr.length;i++) {
                    if (arr[i].matches("[0-9]")) {
                        integers.append(arr[i]).append(",");
                    } else {
                        strings.append(arr[i]).append(",");
                    }
                }
                    if(strings.length()>0){
                        strings.deleteCharAt(strings.length()-1);
                    }
                    if(integers.length()>0){
                        integers.deleteCharAt(integers.length()-1);
                    }


                System.out.println(strings.append(integers));
            }
        }
    }
}
