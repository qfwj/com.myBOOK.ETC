/**
* @Project: struts_spring
* @Title: LoginAction.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月7日 上午8:50:05
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package struts_spring;

import com.opensymphony.xwork2.Action;

/**
* @ClassName: LoginAction
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月7日上午8:50:05
* @remark: 
*/

public class LoginAction implements Action {

	
	private String username;
	private String password;
	private String tip;
	private MyService ms;
	
	public MyService getMs() {
		return ms;
	}

	public void setMs(MyService ms) {
		this.ms = ms;
	}

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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(ms.valid(getUsername(), getPassword())){
			this.setTip("哈哈，整合成功");
			return SUCCESS;
		}
		else
		return ERROR;
	}

}




