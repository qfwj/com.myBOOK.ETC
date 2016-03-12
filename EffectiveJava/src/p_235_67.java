import java.util.ArrayList;
import java.util.List;

/**
* @Project: EffectiveJava
* @Title: p_235_67.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月29日 下午1:12:15
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: p_235_67
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月29日下午1:12:15
* @remark: 
*/

public class p_235_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list = new ArrayList<Integer>();
     list.add(11);
     list.add(12);
     list.add(13);
     list.add(14);
     for(Integer i :list){
    	 list.remove(new Integer(13));
     }
	}

}




