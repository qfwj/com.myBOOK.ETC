/**
* @Project: NKW
* @Title: OneINbinary.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月9日 下午6:26:59
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: OneINbinary
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月9日下午6:26:59
* @remark: 
*/

public class OneINbinary {
	public static int NumberOf1(int n) {
    int count = 0;
       String binary = Integer.toBinaryString(n);
        String new_string = binary.replaceAll("0", "");
        return new_string.length();*/
        while(n>0)  、、只能计算出正数
        	  {  
        	         n= n&(n-1);
        	         count ++;  
        	     
        	   }  
        	   return count;
     
    }
	public static void main(String args[]){
		System.out.println(NumberOf1(-9));//31  int型是32位
		System.out.println((-9>>3)%2);
	}
}




