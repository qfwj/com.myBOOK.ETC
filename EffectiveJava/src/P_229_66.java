/**
* @Project: EffectiveJava
* @Title: P_229_66.java
* @Description: TODO
* @author: zhongbo
* @date :2016��2��28�� ����3:04:28
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: P_229_66
* @Description: TODO
* @author: zhongbo
* @date: 2016��2��28������3:04:28
* @remark: 
*/

public class P_229_66 {
    public static boolean test;
    public static int i;
    static  synchronized void increi(){
    	
    	while(i < 100){
    		i++;
        	System.out.println(Thread.currentThread().getName()+ " "+i);	
    	}
    }
   static void increj(){
	   //�����Ƿ�ᱻ����
    	int j = 0;
    	while(j < 100){
    		j++;
        	System.out.println(Thread.currentThread().getName()+ " "+j);	
    	}
    }
    static synchronized void  decrej(){
    	//�����ж��ǲ�����Ϊ���õ�i��ԭ���±���
    	int j =0;
    	while(j >-100){
    		j--;
        	System.out.println(Thread.currentThread().getName()+ " "+j);	
    	}
    	
    }
    static synchronized void  decrei(){
    	while(i >-100){
    		i--;
        	System.out.println(Thread.currentThread().getName()+ " "+i);	
    	}
    	
    }
   static  synchronized boolean getTest(){
    	return test;
    }
    static synchronized void stopTest(){
    	test = true;
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Thread test1 = new Thread(new Runnable(){
    	   public void run(){
    		   increj();//û�������ķ���������־���
    		   //increi();
    	   }
       });
       Thread test2 = new Thread(new Runnable(){
    	   public void run(){
    		
    		 //  decrei();
    		   decrej();//���ǻᱻ��ס
    	   }
       });
       
       test1.start();
       test2.start();
       //Thread.sleep(500);
       //test = true;//����������֪ͨtest�̣߳�
       //stopTest();//�������ʹ��ͬ��������
	}

}




