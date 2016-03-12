/**
* @Project: NKW
* @Title: Fibonacci_NoRecursion.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月3日 下午6:55:42
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: Fibonacci_NoRecursion
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月3日下午6:55:42
* @remark: 
*/

public class Fibonacci_NoRecursion {
public static void main(String []args){
	StringBuffer  fibonacci = new StringBuffer();
	int i = 1;
	int j = 1;
	fibonacci.append(i + " " + j);
	int m = 0;
	while(m <10){
		int temp = j;
		j = i + j;
		i = temp;
		fibonacci.append(" "+j);
		
		m++;
	}
	System.out.println(fibonacci);
}
}




