/**
* @Project: NKW
* @Title: Odd_Even.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��10�� ����7:08:57
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.Arrays;

/**
* @ClassName: Odd_Even
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��10������7:08:57
* @remark: 
*/

public class Odd_Even {
	public static void reOrderArray(int [] array) {
        if(array !=null && array.length>1){
            int len = array.length;
            int j = 0;
            int []temp = new int[len];
               System.arraycopy(�ĸĸ�array,0,temp,0,len)
            for(int i = 0; i < len; ++i){
                if(temp[i]%2 != 0){
                    array[j] = temp[i];
                    ++j;
                }
            }
           for(int i = 0; i < len; ++i){
                if(temp[i]%2 == 0){
                    array[j] = temp[i];
                    ++j;
                }
            }
         
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*int[] aa = {1,2,3,6,7,-2,0,10,5}; */
		int[] aa= {1};
    reOrderArray(aa);
    System.out.println(��������Arrays.toString(aa))
	}

}




