/**
* @Project: Test
* @Title: Timer_test.java
* @Description: TODO
* @author: zhongbo
* @date :2016��1��7�� ����2:35:29
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
* @date: 2016��1��7������2:35:29
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
/*Timer��ֹ�����⣺
Ĭ������£�ֻҪһ�������timer�߳������У���ô�������ͻᱣ�����С�����ͨ������3�ַ�����ֹһ��timer�̣߳�
��1������timer��cancle����������Դӳ�����κεط����ô˷�����������һ��timer task��run�����
��2����timer�̳߳�Ϊһ��daemon�̣߳������ڴ���timerʱʹ��new Timer(true)�ﵽ���Ŀ�أ�������������ֻ��daemon�̵߳�ʱ�����ͻ��Զ���ֹ���У� 
��3������System.exit������ʹ�������������̣߳���ֹ��
TimerTaskҲ��cancel������*/



