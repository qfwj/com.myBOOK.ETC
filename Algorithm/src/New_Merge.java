/**
* @Project: Algorithm
* @Title: New_Merge.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月3日 下午3:28:22
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: New_Merge
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月3日下午3:28:22
* @remark: 
*/

public class New_Merge {
 public int[] merger(int []root){
	 if( root == null || root.length ==0){
		 return null;
	 }
	 if(root.length == 1){
		 return root;
	 }
	 if(root.length == 2)
	 {
		 if (root[0] > root[1]){
			 int temp = root[1];
			 root[1]= root[0];
			 root[0] = temp;
			 return root;
		 };
		 return root;
	 }
	 int length = root.length;
	 int [] left = new int[length/2];
	 int [] right = new int[length - length/2];
	 
	 System.arraycopy(root, 0, left, 0, length/2);
	 System.arraycopy(root, length/2, right, 0, length -length/2);
	 left =  merger(left);
	 right = merger(right);
	 System.arraycopy(left, 0, root, 0, length/2);
	 System.arraycopy(right,0 , root, length/2, length -length/2);
	 return root;
	
	 
 }
 public static void main(String []args){
	 
	 int []root = {2,1,4,6,8,9,1};
	 root = new New_Merge().merger(root);
	 System.out.println(1);
 }
}




