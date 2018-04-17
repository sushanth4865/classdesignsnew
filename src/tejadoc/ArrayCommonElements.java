package tejadoc;

import java.util.ArrayList;

/**
 * Created by kasir on 4/2/2018.
 */
public class ArrayCommonElements {
    //public static void main(String[] args) {
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList1.add(2);
//        arrayList1.add(3);
//        arrayList1.add(4);
//        arrayList2.add(1);
//        arrayList2.add(2);
//        arrayList2.add(3);
//        ArrayList<Integer> temp = new ArrayList<>(arrayList1);
//        arrayList1.removeAll(arrayList2);
//        arrayList2.removeAll(temp);
//        System.out.println(arrayList1 + "" + arrayList2);

  //  }
//}

//public class Test {
    public int findCommonElement(int[] a, int[] b){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    list.add(a[i]);
                }

            }
        }
        for(int result : list){
            System.out.println(result);
        }
//        int counter=0;
//        int temp= 0;
//        int tempCounter = 0;
//        for(int i=0; i<a.length; i++){
//            temp=a[i];
//            tempCounter=0;
//            for(int j=0; j<b.length; j++){
//                if (temp==b[j]){
//                    tempCounter++;
//                }
//
//            }
//
//            if (tempCounter == 1) {
//                temp = a[i];
//
//                counter++;
//
//                System.out.println(temp);
//
//            }
//
//        }
//
        return 0;
    }

    public static void main(String []args){
        int myArray[] = {2,2,7,7,2,1,5,4,5,1,1};
        int myArray2[] = {2,3,4,7,10};


        ArrayCommonElements hello = new ArrayCommonElements ();
        System.out.println(hello.findCommonElement(myArray, myArray2));

    }
}
