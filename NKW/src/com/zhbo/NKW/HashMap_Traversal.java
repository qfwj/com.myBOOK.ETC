/**
* @Project: NKW
* @Title: HashMap_Traversal.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月4日 上午9:49:57
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
* @ClassName: HashMap_Traversal
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月4日上午9:49:57
* @remark: 
*/

public class HashMap_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Map map = new HashMap();
			Iterator iter = map.entrySet().iterator();
			while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();//一次性查条目
			Object key = entry.getKey();
			Object val = entry.getValue();
			}
			//效率高,以后一定要使用此种方式！
			第二种:
			Map map1 = new HashMap();
			Iterator iter1 = map.keySet().iterator();
			while (iter1.hasNext()) {
			Object key = iter.next();
			Object val = map.get(key);//查了两次
			}
			　　效率低,以后尽量少使用！
	}

}




