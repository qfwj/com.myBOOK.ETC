/**
* @Project: Test
* @Title: test_superConstructor.java
* @Description: TODO
* @author: zhongbo
* @date :2016年3月4日 下午3:06:13
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;
/**
* @ClassName: test_superConstructor
* @Description: TODO
* @author: zhongbo
* @date: 2016年3月4日下午3:06:13
* @remark: 
*/
class aa{
/*aa(){
		System.out.println("aa无参");	
	}*/
	aa(int i){
		System.out.println("aa:i参数");	
	}
}

class bb extends aa{
bb(){
	super(6);
	System.out.println("bb无参");	
	}
bb(int i){
	super(6);
	System.out.println("BB:i参数");	
}
}
public class test_superConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new bb();
       new aa(3);
	}

}




