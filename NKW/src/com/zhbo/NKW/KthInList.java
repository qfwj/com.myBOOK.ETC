/**
* @Project: NKW
* @Title: KthInList.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��11�� ����5:27:49
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: KthInList
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��11������5:27:49
* @remark: ����һ����������������е�����k����㡣
*/




class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
 class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0) return null;
       �������� List<ListNode> list = new ArrayList<ListNode>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        if(k > list.size()) return null;
        else return list.get(list.size()-k);
        
    }
}

public class KthInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




