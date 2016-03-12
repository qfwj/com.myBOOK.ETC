import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
* @Project: EffectiveJava
* @Title: Conefor11.java
* @Description: TODO
* @author: zhongbo
* @date :2016年1月16日 下午2:30:05
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: Conefor11
* @Description: TODO
* @author: zhongbo
* @date: 2016年1月16日下午2:30:05
* @remark: 
*/
class myClone implements Cloneable{
	 String name;
	 int age;
	myClone(int age, String name){
		this.name = name;
	this.age = age;
	}
	@Override //可以使用myClone代替Object
	public myClone clone() throws  CloneNotSupportedException{
	
				
	/*	return super.clone();//仅仅是浅复制 
*/		
		
		//实现深复制  如果是其他的对象要实现深复制就需要重载clone方法
		myClone my = (myClone)super.clone();
		my.name = new String(my.name);
		return my;
		
		  
				
	}
	
}

class hh extends myClone{
	 hh(int i, String ss){
		super(i, ss);
	}
}
public class Conefor11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String datestr = format.format(date);
		List<Integer> hh = new ArrayList<Integer>();
		Iterator iter = hh.iterator();
		Iterator iter1 = hh.iterator();
		System.out.println(iter == iter1);
      
		try{
			hh my  = new hh(12,"小小");
		
			hh you = (hh)my.clone();
      
      System.out.println(my.name == you.name);//浅拷贝，还是同一个对象同一个String对象 返回true
      System.out.println(my.getClass() == you.getClass());//返回为true
      System.out.println(my == you);//但是所指的myClone已经不是同一个了 返回false
      }catch (Exception e){
    	  e.printStackTrace();
      }
		
	}

}




