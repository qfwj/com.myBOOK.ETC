/**
* @Project: struts_spring
* @Title: MyService.java
* @Description: TODO
* @author: zhongbo
* @date :2015��11��7�� ����8:57:50
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package struts_spring;
/**
* @ClassName: MyService
* @Description: TODO
* @author: zhongbo
* @date: 2015��11��7������8:57:50
* @remark: 
*/

public class MyService {
 public boolean valid(String name, String pass){
	 if(name.equals("qingfeng") && pass.equals("123456")){
		 return true;
	 }
	 else return false;
 }
}




