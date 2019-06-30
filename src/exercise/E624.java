package exercise;

import java.util.ArrayList;

public class E624 {
    //两个链表的第一个公共节点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int p1=0,p2=0;
        ListNode m = pHead1;
        ListNode n = pHead2;
        while(m != null){
            p1++;
            m = m.next;
        }
        while(n != null){
            p2++;
            n = n.next;
        }
        int num;
        if(p1>p2){
           num = p1-p2;
           for(int i=0;i<num;i++){
               pHead1 = pHead1.next;
           }
        }else if(p1<p2){
            num = p2-p1;
            for(int i=0;i<num;i++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1!=null){
            if(pHead1!=pHead2){
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }else{
                return pHead1;
            }
        }

        return pHead1;
    }



}
