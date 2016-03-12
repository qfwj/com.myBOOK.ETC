import java.util.Arrays;

/**
* @Project: Algorithm
* @Title: Merge_sort.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月27日 下午4:18:12
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: Merge_sort
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月27日下午4:18:12
* @remark: 合并排序  
* 建议不要使用递归的方法  消耗栈 到时内存溢出
* 
* http://www.cnblogs.com/hexiaochun/archive/2012/09/04/2670070.html
* 不使用返回值的时候 public void merge_sort(int[] arrays,int start,int end)
*/

public class Merge_sort{
	public  int[] merge(int []aa,int []bb){
		int[] merge = new int[aa.length + bb.length];
		int i = 0;
		int j = 0;
		int c = 0;
		
		
		/看看别人的while(i<arrayOneLen || j<arrayTwoLen){  
            if(i==arrayOneLen && j<arrayTwoLen){  
                resultArray.add(arrayTwo[j]);  
                j++;  
            }else if(i<arrayOneLen && j==arrayTwoLen){  
                resultArray.add(arrayOne[i]);  
                i++;  
            }else{  
                if(arrayOne[i]<=arrayTwo[j]){  
                    resultArray.add(arrayOne[i]);  
                    i++;  
                }else if(arrayOne[i]>arrayTwo[j]){  
                    resultArray.add(arrayTwo[j]);  
                    j++;  
                }  
            }  
        }  
		*/
		
		
		
		while(i < aa.length){
			while(j < bb.length){
				if(aa[i]<bb[j]){
					merge[c++] = aa[i++];
					break;
				}else {
					merge[c++] = bb[j++];
			}
			
			}
			if(j == bb.length){
				merge[c++] = aa[i++];
			}
		}
		while(j <bb.length){
			merge[c++] = bb[j++];
		}
		return merge;
	}
	public int[] devide(int aa[]){
		if(aa == null || aa.length == 0){
			return null;
		}
		if(aa.length == 1){
			return aa;
		}
		int [] left = new int[aa.length/2];
		int [] right = new int[aa.length - aa.length/2];
		System.arraycopy(aa, 0, left, 0, aa.length/2);
		System.arraycopy(aa, aa.length/2, right, 0, aa.length - aa.length/2);
		left = devide(left);
		right = devide(right);
		aa = this.merge(left, right);
		return aa;
	}
 public static void main(String [] args){
	/* int [] aa = {3,1,5,4,0,0};*/
	 int [] aa= {0};
	 aa = new Merge_sort().devide(aa);
	 System.out.println(1);
	/* int [] bb = {2,4,6,8,10,11};
	 int i = 0;
	 Merge_sort mm = new Merge_sort();
	 System.out.println(Arrays.toString(new Merge_sort().merge(aa, bb)));
	 while(i < bb.length){
		 mm.devide(aa);
		 
	 }*/
	 
 }
}




