/**
* @Project: Test
* @Title: Thread_RunnableTEST.java
* @Description: TODO
* @author: zhongbo
* @date :2016��2��28�� ����3:28:11
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;
/**
* @ClassName: Thread_RunnableTEST
* @Description: TODO
* @author: zhongbo
* @date: 2016��2��28������3:28:11
* @remark: 
*/

ͨ���Ա�������runnable����ʹ�õ���ͬһ��Runnableʵ�����ݸ�Thread�Ӷ��ܹ�ʵ����Դ�Ĺ���
class testRunnable implements Runnable{
	private int i = 10;
	public void run(){
		while(i-->0){
			System.out.println(Thread.currentThread().getName()+"��ʣƱ����"+i);
			
		}
	}
}
class testThread extends Thread{
	private int i = 10;
	public void run(){
		while(i-->0){
			System.out.println(Thread.currentThread().getName()+"��ʣƱ����"+i);
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




