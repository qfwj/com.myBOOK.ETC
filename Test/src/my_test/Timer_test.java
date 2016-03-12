/**
* @Project: Test
* @Title: Timer_test.java
* @Description: TODO
* @author: zhongbo
* @date :2016年1月7日 下午2:35:29
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;


import java.util.Timer;
import java.util.TimerTask;

/**
* @ClassName: Timer_test
* @Description: TODO
* @author: zhongbo
* @date: 2016年1月7日下午2:35:29
* @remark: 
*/
class my_task extends TimerTask{
	
	/*int id;
	public my_task(int id){
		this.id = id;
	}*/
	@Override
	public void run(){
		Thread current = Thread.currentThread();
			System.out.println(current.getId() + ":" + current.getName());
		
	}
}

public class Timer_test {
	public static void main(String [] args){
		my_task yy = new my_task();
		my_task xx = new my_task();
		   Timer t = new Timer();
		   t.schedule(yy, 30,3000);
		   t.schedule(yy, 30,3000);;
	}
	
}
/*Timer终止的问题：
默认情况下，只要一个程序的timer线程在运行，那么这个程序就会保持运行。可以通过以下3种方法终止一个timer线程：
（1）调用timer的cancle方法。你可以从程序的任何地方调用此方法，甚至在一个timer task的run方法里；
（2）让timer线程成为一个daemon线程（可以在创建timer时使用new Timer(true)达到这个目地），这样当程序只有daemon线程的时候，它就会自动终止运行； 
（3）调用System.exit方法，使整个程序（所有线程）终止。
TimerTask也有cancel方法。*/



