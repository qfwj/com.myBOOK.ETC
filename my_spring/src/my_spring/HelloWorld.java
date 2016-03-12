/**
* @Project: my_spring
* @Title: HelloWorld.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月4日 上午8:36:07
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_spring;

/**
* @ClassName: HelloWorld
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月4日上午8:36:07
* @remark: 
*/

public class HelloWorld {
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

private String hello;
public void show(){
	System.out.println(hello);
}
}




