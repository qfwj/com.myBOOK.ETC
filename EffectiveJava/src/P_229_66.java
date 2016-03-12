/**
* @Project: EffectiveJava
* @Title: P_229_66.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月28日 下午3:04:28
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: P_229_66
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月28日下午3:04:28
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
	   //测试是否会被阻塞
    	int j = 0;
    	while(j < 100){
    		j++;
        	System.out.println(Thread.currentThread().getName()+ " "+j);	
    	}
    }
    static synchronized void  decrej(){
    	//用来判断是不是因为公用的i的原因导致被锁
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
    		   increj();//没有上锁的方法不会出现竞争
    		   //increi();
    	   }
       });
       Thread test2 = new Thread(new Runnable(){
    	   public void run(){
    		
    		 //  decrei();
    		   decrej();//还是会被锁住
    	   }
       });
       
       test1.start();
       test2.start();
       //Thread.sleep(500);
       //test = true;//并不会立即通知test线程；
       //stopTest();//解决方案使用同步来锁定
	}

}




