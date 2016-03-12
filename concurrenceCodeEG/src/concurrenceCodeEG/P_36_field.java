/**
* @Project: concurrenceCodeEG
* @Title: P_36_field.java
* @Description: TODO
* @author: zhongbo
* @date :2016年3月5日 上午8:53:28
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;
/**
* @ClassName: P_36_field
* @Description: TODO
* @author: zhongbo
* @date: 2016年3月5日上午8:53:28
* @remark: 为了证明类的加锁任然可以通过class.field 来进行修改；使同步失效；此时最好的办法是将field改为私有
*/
class testA1 {
	int i = 0;
	synchronized void addi(){
		this.i++;
		
	}
}
class thread1 extends Thread {
	testA1 a1;
	thread1( testA1 a1){
		this.a1 = a1;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+":"+a1.i);
		a1.addi();
		try{
			this.sleep(3000);	
		} catch (Exception e){
			
		}
		System.out.println(Thread.currentThread().getName()+":"+a1.i);
		
	}
}
public class P_36_field {
   final int jj ;
   P_36_field(){
	   jj = 0;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i;
		i = 0;
		testA1 a1 = new testA1();
		System.out.println(Thread.currentThread().getName()+":"+a1.i);
		thread1 th = new thread1(a1);
		th.start();
		Thread main = Thread.currentThread();
		try {
			main.sleep(4000);
		} catch (Exception e){
			
		}
		a1.i ++;
		System.out.println(Thread.currentThread().getName()+":"+a1.i);
		
	}

}




