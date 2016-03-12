/**
* @Project: NKW
* @Title: test_ArrayList.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月1日 下午6:35:52
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.Collections;

/**
* @ClassName: test_ArrayList
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月1日下午6:35:52
* @remark: 
*/

 class ListNode {
       int val;
    ListNode next = null;

      ListNode(int val) {
            this.val = val;
       }
  }



 class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    
        ArrayList<Integer> aa = new ArrayList<Integer>();
        Integer []a;
    重点以：if(listNode == null){
    		return aa;
    	}
       do{
           aa.add(listNode.val);
           listNode = listNode.next;
       }while(listNode !=null);
          重点 方法一： a = (Integer[])aa.toArray(new Integer[aa.size()]);
         aa.clear();
    		   for(int i  = a.length-1; i >= 0;  --i ){
    			   aa.add((Integer)a[i]);
    		   }
    		   list转为数组： Arrays.asList();
                      方法二：工具类*
                      Collections.reverse(aa);
    		   return aa;
        
        
    }
}
public class test_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n1 = new ListNode(47);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(24);
		ListNode n4 = new ListNode(58);
		ListNode n5 = new ListNode(33);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		new Solution().printListFromTailToHead(n1);
		
		
		/*List ll;
		Map ma;
		ma.put(key, value)
		ll.add(e)
		*/

	}

}




