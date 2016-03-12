/**
* @Project: NKW
* @Title: Has_Tree.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月17日 下午4:19:56
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: Has_Tree
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月17日下午4:19:56
* @remark: 输入两颗二叉树A，B，判断B是不是A的子结构。  注意优化
*/



 class TreeN {
    int val = 0;
    TreeN left = null;
    TreeN right = null;

    public TreeN(int val) {
        this.val = val;

    }

}

 class Sss {
    
    public boolean equalTree(TreeN r1,TreeN r2){
        if(null == r2) return true;
        if(null == r1 && null != r2) return false;
        boolean left = false;
        boolean right = false;
        if(r1.val == r2.val){
            left =  equalTree(r1.left,r2.left); if(!left) return false;优化一 避免后续查询
            right = equalTree(r1.right,r2.right); 
            if(left && right) return true;
            return false;
        }
        return false;
    }
    public boolean HasSubtree(TreeN r1,TreeN r2) {
        if(null == r2) return false;
        if(null == r1 && null != r2) return false;
        
        boolean left = false;
        boolean right = false;
      
        if(r1.val == r2.val){
            left = equalTree(r1.left,r2.left); if(!left)不能直接return false
           /* {
                left = HasSubtree(r1.left,r2);if(left) return true;//优化三
                right = HasSubtree(r1.right,r2);
                if(left || right) return true;
                return false;
            } ;*/
            /*if(!left)
            {
                left = HasSubtree(r1.left,r2);if(left) return true;//优化三
                right = HasSubtree(r1.right,r2);
                if(left || right) return true;
                return false;
            } ;*///优化二需要注意
            
            right = equalTree(r1.right,r2.right);
            if(left && right) {return true;}
            else {
                left = HasSubtree(r1.left,r2);if(left) return true;优化三 避免后续
                right = HasSubtree(r1.right,r2);
                if(left || right) return true;
                return false;
            }
        }else{
            left = HasSubtree(r1.left,r2);
            right = HasSubtree(r1.right,r2);
            if(left || right) return true;
            return false;
        }
     
        
        
        
    }
}



public class Has_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{8,8,7,9,2,#,#,#,#,4,7},{8,9,2}
		TreeN a1 = new TreeN(8);
		a1.left = new TreeN(8);a1.right = new TreeN(7);
	    a1.left.left = new TreeN(9); a1.left.right = new TreeN(2);
	    a1.right.left = null; a1.right.right = null;
	    a1.left.right.left = new TreeN(4); a1.left.right.right = new TreeN(7);
	    TreeN a2 = new TreeN(8);
	    a2.left = new TreeN(9);
	    a2.right  = new TreeN(2);
	    System.out.println(new Sss().HasSubtree(a1, a2));
	    
	    int i =0;

	}

}




