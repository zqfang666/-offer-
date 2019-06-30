package exercise;

public class E629 {

    public static void main(String[] args){

        int [] a = new int[] {1,2,3,3,3,3,4,5,6};
        int b = 3;
        System.out.println(GetNumberOfK(a,b));

    }
    public static int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        int f = binfind(array,k,0,len-1);
        int flag,num=1;
        if(f == -1){
            return 0;
        }else{
            flag = f;
            while(flag>=1 && array[--flag] == k){
                num++;
            }
            while((++f)<len && array[f] == k){
                num++;
            }
        }
        return num;


    }
    //递归二分法
    public static int binfind(int [] array , int k,int a,int b){

        if(a>b){
            return -1;
        }
        int temp = (a+b)/2;
        if(k == array[temp]){
            return temp;
        }else if(k>array[temp]){
            return binfind(array,k,temp+1,b);
        }else{
            return binfind(array,k,a,temp-1);
        }

    }
    //循环二分法
    private static int binfind2(int [] array , double k){

        int b = array.length-1;
        int a = 0;
        int mid;
        while(a<=b){
            mid = (a+b)/2;
            if(array[mid]>k){
                b = mid-1;
            }else if(array[mid]<k){
                a = mid+1;
            }
        }
        return a;


    }

    public static int GetNumberOfK1(int [] array , int k) {
        return  binfind2(array,k+0.5) - binfind2(array,k-0.5);
    }

}
