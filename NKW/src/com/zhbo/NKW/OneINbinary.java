/**
* @Project: NKW
* @Title: OneINbinary.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��9�� ����6:26:59
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: OneINbinary
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��9������6:26:59
* @remark: 
*/

public class OneINbinary {
	public static int NumberOf1(int n) {
    int count = 0;
       String binary = Integer.toBinaryString(n);
        String new_string = binary.replaceAll("0", "");
        return new_string.length();*/
        while(n>0)  ����ֻ�ܼ��������
        	  {  
        	         n= n&(n-1);
        	         count ++;  
        	     
        	   }  
        	   return count;
     
    }
	public static void main(String args[]){
		System.out.println(NumberOf1(-9));//31  int����32λ
		System.out.println((-9>>3)%2);
	}
}




