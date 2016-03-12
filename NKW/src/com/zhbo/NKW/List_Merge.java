/**
* @Project: NKW
* @Title: List_Merge.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月14日 下午7:28:03
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: List_Merge
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月14日下午7:28:03
* @remark: 
*/


 class ListNode2 {
    int val;
    ListNode2 next = null;

    ListNode2(int val) {
        this.val = val;
    }
}
class MergeList {
    public static ListNode2 Merge(ListNode2 list1,ListNode2 list2) {
        if(list1 == null ){return list1;}
        if(list2 == null)return list2;
        ListNode2 head;
        ListNode2 temp;
        if(list1.val > list2.val) head = list2;
        head = list1;
        while(list1.next != null || list2.next!= null){
            if(list1.next != null && list2.next == null){
                temp = list1;
                break;
            }else if(list2.next != null && list1.next == null){
                temp = list2;
                break;
            }else {
                if(list1.val > list2.val){
                    temp = list2;
                    temp = temp.next;
                    list2 = list2.next;
                    
                }else {
                    temp = list1;temp= 1.1
                    temp = temp.next;错误的源头等于没变temp= 1.2
                   再令temp = 1.2  其实1.1 的next 没变 ;时刻记住是传引用
                   
                    list1 = list1.next;
                   pc.next = (pa==null)?pa:pb;别人的代码
                }
            }
        }
        return head;
        
        
        
        
/*
        if(list1 == null ){return list2;}
        if(list2 == null)return list1;
        ListNode head;
        ListNode temp;
        if(list1.val > list2.val) {head = temp = list2; list2 = list2.next;}
        else{head = temp = list1;list1= list1.next;}
        while(list1 != null || list2 != null){
            if(list1!= null && list2 == null){
                temp.next = list1;
         
                break;
            }else if(list2 != null && list1 == null){
                temp.next = list2;
                break;
            }else {
                if(list1.val > list2.val){
                    temp.next = list2;
                    temp = list2;
                    list2 = list2.next;
                    
                }else {
                    temp.next = list1;
                    temp = list1;
                    list1 = list1.next;
                    
                }
            }
        }
        return head;*/
        
        
        
        
    }
}



public class List_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode2 a1 = new ListNode2(1);
		ListNode2 a2 = new ListNode2(2);
		/*ListNode2 a3 = new ListNode2(3);
		ListNode2 a4 = new ListNode2(4);
		ListNode2 a5 = new ListNode2(5);
		ListNode2 a6 = new ListNode2(6);*/
		a1.next = a2;a2.next = null;/* a2.next = a3; a3.next = a4; a4.next = a5; a5.next = a6; a6.next = null;*/
		ListNode2 b1 = new ListNode2(1);
		ListNode2 b2 = new ListNode2(3);
		/*ListNode2 b3 = new ListNode2(3);
		ListNode2 b4 = new ListNode2(4);
		ListNode2 b5 = new ListNode2(5);
		ListNode2 b6 = new ListNode2(6);*/
		b1.next = b2; b2.next = null;/* b2.next = b3; b3.next = b4; b4.next = b5; b5.next = b6; b6.next = null;*/
		a1 = MergeList.Merge(a1, b1);
		int i = 0;
		String str = null;
		
		
	}

}




