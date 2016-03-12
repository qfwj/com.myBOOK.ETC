import java.util.ArrayList;
import java.util.List;

/**
* @Project: EffectiveJava
* @Title: p_165_41.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月25日 上午11:25:29
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: p_165_41
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月25日上午11:25:29
* @remark: 
*/
class da0{
	public static void hhhh(){
		System.out.println("da0");
	}
}
class da1 extends da0{
	
	public static void hhhh(){
		System.out.println("da1");
	}
}
class da2 extends da1{
	public static void hhhh(){
		System.out.println("da2");
	}
}
public class p_165_41 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<da0> list= new ArrayList<da0>();
     list.add(new da0());
     list.add(new da1());
     list.add(new da2());
     da1.hhhh();
     for(da0 var:list){
    	 var.hhhh();
     }
	}

}




