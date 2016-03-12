/**
* @Project: Test
* @Title: httpGET.java
* @Description: TODO
* @author: zhongbo
* @date :2016年1月16日 下午2:03:49
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
* @ClassName: httpGET
* @Description: TODO
* @author: zhongbo
* @date: 2016年1月16日下午2:03:49
* @remark: 
*/

public class httpGET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String temp;
			URL baidu = new URL("http://www.baidu.com");
			URLConnection connect = baidu.openConnection();
			HttpURLConnection http = (HttpURLConnection)connect;
			 InputStreamReader isr = new InputStreamReader(http.getInputStream());  
	            BufferedReader br = new BufferedReader(isr);  
	            while((temp = br.readLine()) != null){  
	                System.out.println(temp);  
	            }     
	            br.close();  
	            isr.close(); 
		} catch (Exception e){
			e.printStackTrace();
		}
		

	}

}




