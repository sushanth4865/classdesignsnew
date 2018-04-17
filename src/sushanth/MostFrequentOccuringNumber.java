package sushanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kasir on 4/2/2018.
 */
public class MostFrequentOccuringNumber {

    public static void findMax(List<Integer> list) {
        int max = Collections.max(list);
        System.out.println(max);
    }

    public static void findMode(List<Integer> list) {
        int mode ,maxCount=1 ,tempCount=0, maxCountNum=0;
        for (int i = 0; i < list.size(); i++) {
            tempCount=0;
            for (int j = 0; j < list.size(); j++) {
                int t1 = list.get(i);
                int t2 = list.get(j);
                if (t1 == t2) {
                    tempCount++;
                    if (tempCount > maxCount) {
                        maxCountNum = list.get(i);
                        maxCount = tempCount;
                    }
                }
            }
        }
        System.out.println(maxCount);
        System.out.println(maxCountNum);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(333);
        list.add(9);
        list.add(1);
        list.add(12);
        list.add(1);
        list.add(8);
        list.add(1);
        list.add(47);
        list.add(59);
        list.add(91);
        list.add(32);
        list.add(1);
        list.add(1);
        list.add(1);

        findMax(list);
        findMode(list);
    }
}
