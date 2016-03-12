/**
* @Project: Test
* @Title: test4.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月24日 下午8:54:10
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
* @ClassName: test4
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月24日下午8:54:10
* @remark: 
*/
enum ewe{
	ONE,TWO,THREE,FOUR,FIVE,SIX;
}
class asd{
	void da(){
		
	}
}
class sas extends asd{
	void da(){
		int i =0;
		super.da();
	}
}
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Thread t1 = new Thread(new Runnable(){
				public void run(){
					try {
						this.wait();
					} catch (Exception e){}
				}
			});
			t1.start();
			
			System.out.println(ewe.FIVE);
			int i = -1;
			int j = i << 6;
			double da = 0.2;
			float dsd = 0.2f;
			List<ewe> list1 = Arrays.asList(ewe.values());
			List<ewe> list2 = Arrays.asList(ewe.values());
			/*Iterator iter = list1.iterator();*/
		/*	for(Iterator i = list1.iterator();i.hasNext();){
				for(Iterator j = list2.iterator();j.hasNext();){
					System.out.println(i.next()+" "+j.next());
				}
			}*/
			for(ewe e : list1){
				for(ewe h :list2){
					System.out.println(e+" "+h);
				}
			}
			List list = new ArrayList();
			list.add(1);
			list.add("Sas");
			//t1.interrupt();
			if(t1.isInterrupted()){
				System.out.println("中断了");
			}
			
			
	
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}

}




