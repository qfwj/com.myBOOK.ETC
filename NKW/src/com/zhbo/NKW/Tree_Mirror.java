/**
* @Project: NKW
* @Title: Tree_Mirror.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月17日 下午4:56:43
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: Tree_Mirror
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月17日下午4:56:43
* @remark: 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
*/
class TreeNod {
    int val = 0;
    TreeNod left = null;
    TreeNod right = null;

    public TreeNod(int val) {
        this.val = val;

    }

}

public class Tree_Mirror {
	public void Mirror(TreeNod root) {
        if(null != root){
            TreeNod temp = root.left;
            root.left = root.right;
            root.right = temp;实现镜像
            Mirror(root.left);
            Mirror( root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




