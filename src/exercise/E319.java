package exercise;

import java.util.ArrayList;

public class E319 {

    public static void main(String[] args){

        System.out.println(GetUglyNumber_Solution1(8));

    }


    //求丑数
    public static int GetUglyNumber_Solution(int index) {
        if(index<7){
            return index;
        }
        int i2=0,i3=0,i5=0;
        int m2,m3,m5,min;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        for(int i=1;i<=index;i++){
            m2 = list.get(i2)*2;
            m3 = list.get(i3)*3;
            m5 = list.get(i5)*5;
            min = Math.min(m2,Math.min(m3,m5));
            if(min == m2) i2++;
            if(min == m3) i3++;
            if(min == m5) i5++;
            list.add(min);
        }

       return list.get(index-1);


    }
    //求丑数 高时间复杂度
    public static int GetUglyNumber_Solution1(int index) {
        if(index == 1){
            return 1;
        }
        int time = 1,i=2,res=1;
        while(time<index){
            res++;
            i = res;
            while(i%2==0)
                i=i/2;
            while(i%3==0)
                i=i/3;
            while(i%5==0)
                i=i/5;
            if(i==1)
                time++;
        }

        return res;
    }
}
