/**
* @Project: NKW
* @Title: Tree_PathFind.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月22日 下午3:43:41
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;

/**
* @ClassName: Tree_PathFind
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月22日下午3:43:41
* @remark: 
*/

public class Tree_PathFind {
	

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
      
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
          if(null == root ) return list;
        if(root.val < target){ 
        ArrayList<ArrayList<Integer>> listleft = new  ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> listright = new  ArrayList<ArrayList<Integer>>();
             if(null != root.left){
                 listleft = FindPath(root.left,target - root.val);
             }
             if(null != root.right){
                 listright = FindPath(root.right, target - root.val);
             }
             if(listleft.size() > 0 || listright.size() > 0) {
                 if(listleft.size() > 0){
                 for(int i = 0; i < listleft.size(); ++i){
                     ArrayList<Integer> intleft = new  ArrayList<Integer>();
                     intleft.add(root.val);
                     for(int j = 0; j < listleft.get(i).size(); ++j){
                         intleft.add(listleft.get(i).get(j));
                     }
                     list.add(intleft);
                 }
             }
             if(listright.size() > 0){
                
                 for(int i = 0; i < listright.size(); ++i){
                     ArrayList<Integer> intright = new  ArrayList<Integer>();
                     intright.add(root.val);
                     for(int j = 0; j < listright.get(i).size(); ++j){
                         intright.add(listright.get(i).get(j));
                     }
                     list.add(intright);
                 }
             }
            }
             
             
         } 
        if(root.val == target && null == root.left && null == root.right){
           ArrayList<Integer>  temp =  new ArrayList<Integer>();
            temp.add(root.val);
         list.add(temp);
        }
        return list; 
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




