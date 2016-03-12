/**
* @Project: NKW
* @Title: DoubleEX.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月9日 下午7:24:23
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: DoubleEX
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月9日下午7:24:23
* @remark: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
* 
* 
* 
* 
*/
注意问题 的全面性考虑  指数运算 先考虑特殊情况
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
   float f = 2.2;加f的表示方式
   boolean b = d==0;
   System.out.println(Power(2,3));
	}

}




