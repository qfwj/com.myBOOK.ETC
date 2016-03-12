/**
* @Project: Test
* @Title: volatile_Thread_test.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月28日 下午6:28:31
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;
/**
* @ClassName: volatile_Thread_test
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月28日下午6:28:31
* @remark: 
*/

public class volatile_Thread_test {
  volatile static int i;
  static  int j;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int n = 0; n < 100 ;n++){
			 new Thread(new Runnable(){
		    	  public void run(){
		    		  try {
		    	            Thread.sleep(20);
		    	        } catch (InterruptedException e) {
		    	        }
		    		  i++;//不是原子操作
		    		  j++;
		    		  System.out.println(Thread.currentThread().getName() +" i:" +i +" " +"j:" + j);
		    	  }
		      }).start();
		}
     
    /*  Thread test2 = new Thread(new Runnable(){
    	  public void run(){
    		  i++;
    		  j++;
    		  System.out.println( Thread.currentThread().getName() +" i:" +i +" " +"j:" + j);
    	  }
      });
      test1.start();
      test2.start();*/
      
      Thread.sleep(5000);
      System.out.println(Thread.currentThread().getName()+" i:" +i +" " +"j:" + j);
      
	}

}




