/**
* @Project: NKW
* @Title: Test1.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��1�� ����5:13:07
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: Test1
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��1������5:13:07
* @remark: ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
* ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
* ����������һ����ά�����һ���������ж��������Ƿ��и�������
* 
* 
* ע�����a[].length �Ǵ��
*       ����߽�����
*       ���������ж��Ƿ�Ϊ�յ����
* 
*/

public class Test1 {

	 public boolean Find(int [][] array,int target) {
	       
	        int m = array.length;
	        int n = array[0].length;
	        if(m == 0 || n ==0) {
	        	return false; 
	        } else{
	        	if( target < array[0][0] && target > array[array.length-1][array[0].length-1]){
		            return false;
		        } else{
		             for( int i = 0; i < array.length; ++i){
		             if( target >= array[i][0] && target <= array[i][array[i].length-1] ){
		                 for(int j = 0; j < array[i].length; ++j){
		                 if( array[i][j] == target)
		                     return true;
		                 }
		             
		             }
		         }
		            return false;
		            
		            
		        }
	        	
	        }
	        
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [][] aa = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};*/
		int [][] aa = {{},{},{},{}};�쪹ؼ�����
 System.out.println(new Test1().Find(aa, 7));
	}

}




