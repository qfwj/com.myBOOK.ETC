/**
* @Project: NKW
* @Title: Tree_depthScan.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月18日 下午6:44:51
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;

/**
* @ClassName: Tree_depthScan
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月18日下午6:44:51
* @remark: 
*/

 class TreeNode12 {
    int val = 0;
    TreeNode12 left = null;
    TreeNode12 right = null;

    public TreeNode12(int val) {
        this.val = val;

    }

}
 class Solution111 {
    private ArrayList<TreeNode12> list = new ArrayList<TreeNode12>();
    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode12 root) {
        if(null == root ) return list1;
        if(null == root.left && null == root.right) {list1.add(root.val); return list1;}
        list.add(root);
       
        int i = 0;
       
        队列思维 挨个读取先进去的节点
        while(true){
        	if(i == list.size()) break;
        	if(list.get(i).left != null){list.add(list.get(i).left);}
        	if(list.get(i).right != null){list.add(list.get(i).right);}
        	++i;
        	
        	
        }
        
        
       
           算法思想是计算每层节点的数目 while(i > 0){
                int size = list.size();
                for(int j = 0 ;j < i; j++){
                   if(null != list.get(size -i + j).left) {
                    list.add(list.get(size-i + j).left);
                    ++n;
                }
                if(null != list.get(size-i + j).right){
                    list.add(list.get(size-i + j).right);
                    ++n;
                } 
               }
                    
                if(list.size() == size) i = 0;else{
                    i = n -1;
                    n  = 1; 
                }
               
            }
        
        for(int j = 0; j < list.size(); j++){
            list1.add(list.get(j).val);
        }
        return list1;
    }
}


public class Tree_depthScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{10,6,14,4,8,12,16}
		TreeNode12 tree = new TreeNode12(10);
		tree.left = new TreeNode12(6); tree.right = new TreeNode12(14); 
		tree.left.left = new TreeNode12(4); tree.left.right = new TreeNode12(8);
		tree.right.left = new TreeNode12(12); tree.right.right = new TreeNode12(16);
		
		Object[] ii = new Solution111().PrintFromTopToBottom(tree).toArray();
		ii.toString();
		
		}

	}






