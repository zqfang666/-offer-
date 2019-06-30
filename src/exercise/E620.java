package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class E620 {
    public static void main(String[] args){
        System.out.println(InversePairs(new int[]{1, 2, 3, 4, 5, 6, 7, 0}));

    }

    public static int InversePairs(int [] array) {
        int len = array.length;
        if(len<=0){
            return 0;
        }
        int [] temp = new int [len];

        return function(array,temp,0,len-1);
    }

    public static int function(int [] array,int [] temp,int low,int high){
        if(low == high){
            return 0;
        }
        int mid = (low+high)>>1;
        int leftCount = function(array,temp,low,mid)%1000000007;
        int rightCount = function(array,temp,mid+1,high)%1000000007;
        int i= mid;
        int j = high;
        int temploc = high;
        int count=0;
        while(i>=low && j>mid){
            if(array[i]>array[j]){
                count += j-mid;
                temp[temploc--] = array[i--];
                if(count>=1000000007){
                    count = count%1000000007;
                }
            }else {
                temp[temploc--] = array[j--];
            }

        }
        for(;i>=low;){
            temp[temploc--] = array[i--];
        }
        for(;j>mid;){
            temp[temploc--] = array[j--];
        }
        for(int s=low;s<=high;s++){
            array[s] = temp[s];
        }
        return (count+leftCount+rightCount)%1000000007;



    }


}
