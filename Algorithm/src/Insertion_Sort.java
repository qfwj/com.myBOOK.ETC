import java.util.Arrays;
import java.util.List;

/**
* @Project: Algorithm
* @Title: Insertion_Sort.java
* @Description: TODO
* @author: zhongbo
* @date :2015��11��27�� ����2:15:29
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: Insertion_Sort
* @Description: ���������㷨
* @author: zhongbo
* @date: 2015��11��27������2:15:29
* @remark: ÿ�α����ҳ���С�ķ���δ�������ǰ��
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
* Ҫ��֤���������ʽ��Ȼ����Ҫ��ı�����֧�ţ���¼ÿ�α�������С��λ�ã�������λ������Ӧֵ
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
	
	




