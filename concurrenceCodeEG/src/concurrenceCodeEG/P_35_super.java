/**
* @Project: concurrenceCodeEG
* @Title: P_35_super.java
* @Description: TODO
* @author: zhongbo
* @date :2016年3月4日 下午5:30:56
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;
/**
* @ClassName: P_35_super
* @Description: TODO
* @author: zhongbo
* @date: 2016年3月4日下午5:30:56
* @remark: 
*/
class a{
	synchronized void hh(){
		int i = 0;
		System.out.println(Thread.currentThread().getName());
	}
}
class b extends a{
	@Override
	synchronized void hh(){
		int i =0;
		System.out.println(Thread.currentThread().getName()+"hh");
		this.cc();
		
		//super.hh();
		
	}
	synchronized void cc(){
		int i =0;
		System.out.println(Thread.currentThread().getName()+"cc");
		while(i < 1000000){
			i++;
		}
		
	//	super.hh();
		
	}
}

public class P_35_super {

	public static void main(String[] args){
		// TODO Auto-generated method stub
     
    final  b bb = new b();
      int i =0;
      Thread thead1 = new Thread(new Runnable(){
	    	 public void run(){
	         bb.hh();
	         
	      }});
	     thead1.setName("线程1");
	     Thread thread2 = new Thread(new Runnable(){
	     	 public void run(){
	          bb.cc();
	       }});
	     thead1.start();
    	 
   	  
   	  
   	  thread2.start();
     /* while(i < 100){
    	  
    	     thead1.start();
    	 
    	  
    	  
    	  thread2.start();
    	  int j = 0;
    	  while(j < 10000){ int n = 13/14;j++;}
  	i++;}*/
  	 
		
	}

}




