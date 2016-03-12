/**
* @Project: concurrenceCodeEG
* @Title: P_68_MAP.java
* @Description: TODO
* @author: zhongbo
* @date :2016年3月7日 下午2:39:51
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;

import java.util.Hashtable;

/**
* @ClassName: P_68_MAP
* @Description: TODO
* @author: zhongbo
* @date: 2016年3月7日下午2:39:51
* @remark: 
*/
class tt{
	int i;
	tt(int i){
		this.i = i;
	}
}
public class P_68_MAP {
  final void ssas(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*Hashtable<tt,tt> ss = new Hashtable<tt,tt>();
     tt t0 = new tt(3);
     tt t1 = new tt(3);
     ss.put(t0, t1);
     tt te =ss.get(t0);
     System.out.println(ss.get(t0).i);
     tt t2 = new tt(4);
     ss.put(t0, t2);
     System.out.println(ss.get(t0).i);
     tt sss = ss.get(t0);
     sss.i = 5;
     System.out.println(ss.get(t0).i);*/
		
	Hashtable<String,tt> ss = new Hashtable<String,tt>();
	tt t1 = new tt(3);
    ss.put("1", t1);
     System.out.println(ss.get("1").i);
     tt t2 = new tt(4);
     ss.put("1", t2);
     System.out.println(ss.get("1").i);
     tt sss = ss.get("1");
     sss.i = 5;
     System.out.println(ss.get("1").i);
     final tt[] st = new tt[2];
     st[0] = t1;
     st[1] = t2;
     st[0].i = 88;
     System.out.println(st[0].i);
	}

}




