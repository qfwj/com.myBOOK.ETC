/**
* @Project: NKW
* @Title: Tree_construct_PRO_MID.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月2日 下午7:21:11
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.Arrays;

/**
* @ClassName: Tree_construct_PRO_MID
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月2日下午7:21:11
* @remark: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
* 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
* 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
* 和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/


/*写给自己
 * 
 * 第一：边界控制；一定要检测
 * 第二：递归算法如何实现分解
 * 
 * 
 * */


class TreeNode {
   int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

 class Solution11 {
   
   
   public static TreeNode reConstructBinaryTree(int [] pre,int [] in) { 
       if(pre.length == 0 || pre == null){
           return null;
       }
       
       TreeNode root = new TreeNode(pre[0]);
       int i = 0;
       int length = pre.length;
       if (length == 1)  
            return root;
       
       while(i < length){
    	   if(pre[0] == in[i]){
    		   break;
    	   }
    	   ++i;
       }
           
    	   int [] preleft = new int[i];
           int [] preright = new int[length -i-1];
           int [] InLeft = new int[i];
           int []  InRight = new int[length -i-1];
           System.arraycopy(pre, 1, preleft, 0, i);
           System.arraycopy(pre, i+1, preright, 0, length -i-1);
           
           System.arraycopy(in, 0, InLeft, 0, i);
           System.arraycopy(in, i+1, InRight, 0, length -1-i);
           root.left = reConstructBinaryTree(preleft,InLeft);
           root.right = reConstructBinaryTree(preright,InRight); 
              return root;
       }
}
public class Tree_construct_PRO_MID {

	public static void main(String[] args) {
		/*int [] pre = {1,2,4,3,5,6};
		int [] in = {4,2,1,5,3,6};*/
		int [] pre = {1,2,3};
		int [] in = {3,2,1};
		 TreeNode root = Solution11.reConstructBinaryTree( pre, in);
System.out.println(1);
	}

}




