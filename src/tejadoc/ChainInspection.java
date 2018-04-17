package tejadoc;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

///**
// * Created by kasir on 4/2/2018.
// */
//BEGIN-3;4-2;3-4;2-END # GOOD
//        77-END;BEGIN-8;8-11;11-77 # GOOD
//        In examples above we can pass trough the chains from the 'BEGIN' to the 'END' without missing any single pair. In the first case we moved from 'BEGIN' to 3, from 3 to 4, from 4 to 2, from 2 to 'END'. In the second case we moved from 'BEGIN' to 8, from 8 to 11, from 11 to 77, from 77 to 'END'.
public class ChainInspection {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Projects\\codevue\\src\\chaininspectionfile");

        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            if(!line.equalsIgnoreCase("")){
                Map chain = new TreeMap();
                boolean badChain = false;
                String elements[] = line.split(";");
                for(String pair : elements){
                    String items[] = pair.split("-");
                    if(items[0].equalsIgnoreCase(items[1])){
                        badChain = true;
                    }else{
                        if(!chain.containsKey(items[0])){
                            chain.put(items[0], items[1]);
                        }else{
                            // bad chain
                            badChain = true;
                            break;
                        }
                    }
                }

                int linksUsed = 1;
                int chainLength = chain.size();
                String value = (String) chain.get("BEGIN");
                if(chain.get("BEGIN") == null){
                    badChain = true;
                }else{
                    while(!value.equalsIgnoreCase("END") && linksUsed < chainLength){
                        value = (String) chain.get(value);
                        linksUsed++;
                    }
                }
                if(!badChain && linksUsed == chainLength && value.equals("END")){
                    System.out.println("GOOD");
                }else{
                    System.out.println("BAD");
                }
            }
        }
        fileScanner.close();
    }

}
