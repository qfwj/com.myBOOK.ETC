/**
* @Project: NKW
* @Title: Stack_Push_Pop.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月18日 下午5:22:27
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Stack_Push_Pop
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月18日下午5:22:27
* @remark: 
*/


public class Stack_Push_Pop {
	 public static boolean IsPopOrder(int [] A,int [] B) {
	        if(null == A && null == B) return true;
	        if(null == A || null == B) return false;
	        if(A.length != B.length) return false;
	        for(int i = 0; i < A.length; i++){
	          if(A[i] != B[A.length -1 -i]) return false;
	      }
	        return true;
	    }

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {5,4,3,2,1};
     System.out.println(IsPopOrder(a,b));
     List aa = new ArrayList();
	}

}




