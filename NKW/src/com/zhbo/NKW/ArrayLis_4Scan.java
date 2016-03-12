/**
* @Project: NKW
* @Title: ArrayLis_4Scan.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月1日 下午8:11:07
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @ClassName: ArrayLis_4Scan
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月1日下午8:11:07
* @remark: 
*/

public class ArrayLis_4Scan {
 public static void main(String []args){
	 List list = new ArrayList();
	 list.add(1);
	 list.add("一");
	 list.add(2.3);
	 list.add(false);
	 Iterator ir = list.iterator();
	 while(ir.hasNext()){
		 System.out.println(ir.next());必须从next开始迭代器的定义
	 }
	 for(int i = 0; i< list.size(); ++i){
		 System.out.println(list.get(i));
	 }
	 List<Integer> list1 = new ArrayList<Integer>();
	 list1.add(1);
	 list1.add(1);
	 list1.add(1);
	 list1.add(1);
	 
foreach 只能使用一种指定了类型的
	 for(int temp:list1){
		 System.out.println(temp);
	 }
 }
}




