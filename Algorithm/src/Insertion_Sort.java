import java.util.Arrays;
import java.util.List;

/**
* @Project: Algorithm
* @Title: Insertion_Sort.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月27日 下午2:15:29
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: Insertion_Sort
* @Description: 插入排序算法
* @author: zhongbo
* @date: 2015年11月27日下午2:15:29
* @remark: 每次遍历找出最小的放在未排序的最前面
* [0, 4, 3, 2, 6, 5, 7, 2, 8, 1]
* [0, 1, 4, 3, 2, 6, 5, 7, 2, 8]
* [0, 1, 2, 4, 3, 6, 5, 7, 2, 8]
* [0, 1, 2, 2, 4, 3, 6, 5, 7, 8]
* [0, 1, 2, 2, 3, 4, 6, 5, 7, 8]
* [0, 1, 2, 2, 3, 4, 6, 5, 7, 8]
* [0, 1, 2, 2, 3, 4, 5, 6, 7, 8]
* [0, 1, 2, 2, 3, 4, 5, 6, 7, 8]
* [0, 1, 2, 2, 3, 4, 5, 6, 7, 8]
* [0, 1, 2, 2, 3, 4, 5, 6, 7, 8]
* 
* 要保证这种输出形式必然会需要多的变量来支撑，记录每次遍历的最小点位置（进行移位）、对应值
*/

public class Insertion_Sort {
 
	public static void main(String []args){
		int []insert = {4,3,2,6,5,7,2,8,1,0};
		for(int i = 0; i < 10; ++i){
			int key = insert[i];
			int j = i;
			int c = 0;
		 while(j < 10){
			 if(key > insert[j]) {
			     key = insert[j];
				 c = j;
				
			};
			 ++j;
		 }
		 for(j = c; j > i; --j ){
			 insert[j] = insert[j-1]; 
		 }
		 insert[i] = key; 
		System.out.println(Arrays.toString(insert));	
	  }
		
		}
		
		
	}
	
	




