/**
* @Project: NKW
* @Title: DoubleEX.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��9�� ����7:24:23
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: DoubleEX
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��9������7:24:23
* @remark: ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
* 
* 
* 
* 
*/
ע������ ��ȫ���Կ���  ָ������ �ȿ����������
public class DoubleEX {
	
	 public static double Power(double base, int exp) {
		  double sum =  1;
	        if(exp == 0) return 1;
	        else if(base == 0 || exp == 1) return base; 
	      
	        if(exp > 1){
	            for(int i = 0; i < exp; ++i)
	                sum *=base;
	            return sum;
	        }else if(exp == -1){
	            return 1/base;
	        }else {
	            base = 1/base;
	            for(int i = exp; i < 0;i++)
	                sum *= base;
	            return sum;
	        }   
	 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double d = 2.2;
   float f = 2.2;��f�ı�ʾ��ʽ
   boolean b = d==0;
   System.out.println(Power(2,3));
	}

}




