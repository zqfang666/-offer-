package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class E317 {
    public static void main(String[] args){
//        int [] num = {3,321,312};
//        System.out.println(PrintMinNumber(num));
        String a = "da";
        String b = "be";
        System.out.println(a.compareTo(b));
    }

    //数组排成最小的数
    public static String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString()+o2.toString();
                String s2 = o2.toString()+o1.toString();
                return s1.compareTo(s2);
            }
        });
        String s="";
        for(int j:list)
            s+=j;
        return s;

    }
}
