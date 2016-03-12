/**
* @Project: Test
* @Title: Thread_RunnableTEST.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月28日 下午3:28:11
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;
/**
* @ClassName: Thread_RunnableTEST
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月28日下午3:28:11
* @remark: 
*/

通过对比来发现runnable由于使用的是同一个Runnable实例传递给Thread从而能够实现资源的共享
class testRunnable implements Runnable{
	private int i = 10;
	public void run(){
		while(i-->0){
			System.out.println(Thread.currentThread().getName()+"还剩票数："+i);
			
		}
	}
}
class testThread extends Thread{
	private int i = 10;
	public void run(){
		while(i-->0){
			System.out.println(Thread.currentThread().getName()+"还剩票数："+i);
		}
	}
}
public class Thread_RunnableTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new testThread().start();
     new testThread().start();
     new testThread().start();
     testRunnable tr = new testRunnable();
     new Thread(tr).start();
     new Thread(tr).start();
     new Thread(tr).start();
     
	}

}




