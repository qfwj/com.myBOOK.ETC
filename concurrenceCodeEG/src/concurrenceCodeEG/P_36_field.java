/**
* @Project: concurrenceCodeEG
* @Title: P_36_field.java
* @Description: TODO
* @author: zhongbo
* @date :2016��3��5�� ����8:53:28
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;
/**
* @ClassName: P_36_field
* @Description: TODO
* @author: zhongbo
* @date: 2016��3��5������8:53:28
* @remark: Ϊ��֤����ļ�����Ȼ����ͨ��class.field �������޸ģ�ʹͬ��ʧЧ����ʱ��õİ취�ǽ�field��Ϊ˽��
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




