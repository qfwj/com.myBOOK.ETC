/**
* @Project: NKW
* @Title: Tree_searchTree.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月22日 上午9:41:06
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Tree_searchTree
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月22日上午9:41:06
* @remark: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
* 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
*/

/*算法思想:  后序遍历 小 大 中 的数据分布方式  找第一个比最后一位小的值 分成两个数组 前面的是左子树  后面是右子树 左子树中的值必须小于数组最后一位
	    8             5 7 6 9 11 10 8
	   /  \
	  6   10
	 / \  / \
	5  7 9   11
	*/
public class Tree_searchTree {
	public boolean VerifySquenceOfBST(int [] s) {
        if( s.length == 0) return false;//[]判断应该为不是二叉搜索树
       if(null == s || s.length == 1 || s.length == 0) return true;
         int left = s.length;
         boolean bleft = true;//[]
        boolean right = true;正是因为[] 为false 因而需要设置 标志位
       for(int i = 1; i < s.length; ++i)
        {
           if(s[ s.length-1] > s[ s.length -1-i]){
              left = i;
               break;
           }
       }
        int [] left1 = new int[s.length - left];
        
        int [] right1 = new int[left-1];
        if(left1.length != 0) {
             System.arraycopy(s,0,left1,0,s.length - left);
        for(int j = 0; j < s.length - left; ++j){
            if(left1[j] > s[s.length-1]) return false;关键
        }
            bleft = VerifySquenceOfBST(left1);
           
        }
         if(right1.length != 0){
            System.arraycopy(s,s.length - left,right1,0,left - 1); 
             right = VerifySquenceOfBST(right1);
         }
        
        ArrayList<ArrayList<Integer>> hh = new ArrayList<ArrayList<Integer>>();
        hh.add(new ArrayList<Integer>().add(0) );
        
        if(bleft && right) return true;
        else
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




