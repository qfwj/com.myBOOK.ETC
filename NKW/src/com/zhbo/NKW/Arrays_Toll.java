/**
* @Project: NKW
* @Title: Arrays_Toll.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月4日 下午6:23:05
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: Arrays_Toll
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月4日下午6:23:05
* @remark: 
*/

public class Arrays_Toll {
	
	public static int minNumberInRotateArray(int [] array) {
		if(array == null || array.length == 0){
			return 0;
		}
		int left = 0;
		int right = array.length;
		int length = array.length;
		int min = array[0];
		while( length > 1)
		{
			if(array[(left+right)/2] > min){
				left = (left+right)/2;
			} else {
				min = array[(left+right)/2];
				right = (left+right)/2;
			}
			length = length<<1;
		}
		
	    return min;
	    		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] aa = {4,5,6,7,8,1,2,3};
      System.out.println(minNumberInRotateArray(aa));
	}

}




