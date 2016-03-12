/**
* @Project: NKW
* @Title: InvertList.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月12日 下午3:17:20
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: InvertList
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月12日下午3:17:20
* @remark: 
*/




import java.util.ArrayList;
import java.util.List;
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
class reserved {
    public static  ListNode1 ReverseList(ListNode1 head) {
      /* if(head == null|| head.next == null) return head;
       ListNode1 pre = head;
       ListNode1 mid = head.next;
       ListNode1 tmp;
       while(null != mid.next){
    	   tmp = mid.next;
    	   mid.next = pre;
    	   pre = mid;
    	   mid = tmp;
       }
       mid.next = pre;
       head.next = null;
       return mid;*/
      List<ListNode1> list = new ArrayList<ListNode1>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        int len = list.size(); 
        ListNode1 tmp = list.get(len-1);
        head = list.get(len-1);
        tmp.next = list.get(len-2);
        tmp = tmp.next;
        
        for(int i = 3; i <= len; ++i){
            tmp = list.get(len-i);
            tmp = tmp.next;null会导致类型丢失 错误的范例
        }
      
        tmp =null;
        return head;
        
        /*for(int i = 1; i < len; ++i){
            tmp.next = list.get(len-1-i);
            tmp = tmp.next;
        }
      
        tmp.next =null;
        return head;*/
    }
}

public class InvertList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode1 a1 = new ListNode1(1);
		ListNode1 a2 = new ListNode1(2);
		ListNode1 a3 = new ListNode1(3);
		ListNode1 a4 = new ListNode1(4);
		ListNode1 a5 = new ListNode1(5);
		ListNode1 a6 = new ListNode1(6);
		a1.next = a2; a2.next = a3; a3.next = a4; a4.next = a5; a5.next = a6; a6.next = null;
		a1 = reserved.ReverseList(a1);
		
		int i = 0;
		
	}

}




