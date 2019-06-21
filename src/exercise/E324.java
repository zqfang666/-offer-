package exercise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class E324 {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        String [] b =(String[]) a.toArray(new String[a.size()]);
        System.out.println(b[0]);




    }

    public static int FirstNotRepeatingChar(String str) {
        if (str == null) return -1;
        int len = str.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < len; i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

//    public static int FirstNotRepeatingChar1(String str) {
//        if(str==null) return -1;
//        int len = str.length();
//        LinkedHashMap<Character,Integer> map =new LinkedHashMap<Character,Integer>();
//        for(int i=0;i<len;i++){
//            if(!map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i),1);
//            }else{
//                map.put(str.charAt(i),map.get(str.charAt(i))+1);
//            }
//        }
//        Iterator it = map.entrySet().iterator();
//        int i=0;
//        while(it.hasNext()){
//            Map.Entry a = (Map.Entry) it.next();
//            if((int)a.getValue()==1){
//                return i;
//            }
//            i++;
//        }
//        return -1;
//    }

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int res = 0;
        for (int j = 0; j < array.length - 1; j++) {

            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    res++;
                }
            }
        }
        return res;
    }


}