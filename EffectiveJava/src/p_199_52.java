/**
* @Project: EffectiveJava
* @Title: p_199_52.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月28日 上午8:44:14
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: p_199_52
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月28日上午8:44:14
* @remark: 
*/
abstract class testabstract{
	void testab1(){}
	void testab2(){}
}
interface testinterface{
	void test1();
	int test2();
}
class testimplement extends testabstract implements testinterface{
	public  void test1(){ System.out.println("test3"); }
	   public int test2(){System.out.println("test3"); return 0;}
	   public void test3(){   System.out.println("test3");
	   };
}
public class p_199_52{
 
	void test4(testinterface face){
		face.test1();
		face.test2();
		//编译时决定，只有test1  test2两个
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testimplement().test3();
		new testimplement().testab1();
	}

}




