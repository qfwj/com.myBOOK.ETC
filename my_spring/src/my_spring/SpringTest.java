/**
* @Project: my_spring
* @Title: SpringTest.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月3日 下午8:54:47
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @ClassName: SpringTest
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月3日下午8:54:47
* @remark: 
*/

public class SpringTest {
	public static void main(String[] args){
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld fs=(HelloWorld) ctx.getBean("myBean");
        fs.show();*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("person&stoneBean.xml");
		person p = ctx.getBean("pers",person.class);
		p.useAxe();
	}
}




