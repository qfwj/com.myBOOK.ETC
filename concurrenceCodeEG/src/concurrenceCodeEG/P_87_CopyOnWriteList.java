/**
* @Project: concurrenceCodeEG
* @Title: P_87_CopyOnWriteList.java
* @Description: TODO
* @author: zhongbo
* @date :2016年3月8日 下午12:44:41
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
* @ClassName: P_87_CopyOnWriteList
* @Description: TODO
* @author: zhongbo
* @date: 2016年3月8日下午12:44:41
* @remark: 
*/

class ttt{
	int i;
	ttt(int i){
		this.i = i;
	}
}
class rrr extends Thread{
	final CopyOnWriteArrayList list;
	rrr(CopyOnWriteArrayList list){
		this.list = list;
	}
	@Override
	public void run(){
		try {this.sleep(3);}catch (Exception e){}
		list.add(5);
		int i =0;
	}
}

class nn {
	final tt [] qq;
	nn(tt[] cc){
		qq=cc;
	}
}
public class P_87_CopyOnWriteList {

	public static void main(String[] args) {
		
		tt [] sr = new tt[2];
		sr[0] = new tt(1);
		sr[1] =new tt(2);
		nn n1 = new nn(sr);
		sr[0] = new tt(99);
		
		
		
		
		
		
		// TODO Auto-generated method stub
		CopyOnWriteArrayList  list = new CopyOnWriteArrayList();
		list.add(new tt(1));
		list.add(new tt(2) );
		list.add(new tt(3));
		list.add(new tt(4));
		list.add(new tt(5));
		list.add(new tt(6));
		int i =0;
		 new rrr(list).start();
		 Iterator itr = list.iterator();
		 while(itr.hasNext())
			 {
			 ++i; 
			 tt ii = (tt)itr.next();
			 ii.i = 99;
			 try {Thread.currentThread().sleep(3);
			 list.add(1);}
			 catch (Exception e){}
			 }
		  itr = list.iterator();
		 i = 0;

	}

}




