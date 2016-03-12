/**
* @Project: spring_struts
* @Title: LoginAction.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月5日 下午3:45:11
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package springstruts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
* @ClassName: LoginAction
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月5日下午3:45:11
* @remark: 
*/

public class LoginAction extends ActionSupport {

private final static String SS = "hh"; 
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
private String username;
private String password;
private String tip;

public String getTip() {
	return tip;
}
public void setTip(String tip) {
	this.tip = tip;
}
public String execute()throws Exception{
	if(this.getUsername().equals("qingfeng")&&this.getPassword().equals("123456")){
		ActionContext.getContext().getSession().put("user", getUsername());
		this.setTip(username);
		return SS;
	}else {
		return ERROR;
	}
	
}



}




