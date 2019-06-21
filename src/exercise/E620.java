package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class E620 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.next().split(",");
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            list.add(Integer.parseInt(nums[i]));
        }
        int sum=0;
        int len = list.size();

        for(int i=0;i<len-1;i++){
            for(int j=i;j<len-1;j++){
                if(list.get(j) > list.get(j+1)){
                    sum++;
                }
            }
        }

        System.out.println(sum);

    }


}
