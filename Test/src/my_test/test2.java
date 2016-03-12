/**
* @Project: Test
* @Title: test2.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月24日 下午8:52:32
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @ClassName: test2
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月24日下午8:52:32
* @remark: 
*/

class parenttest<E>{
	void hh(){
		System.out.println("父类hh");
		this.ee();
		rr();
		E[] ee =  (E[]) new Object[2];
	}
	void rr(){
		System.out.println("父类rr");
	}
	void ee(){
		System.out.println("父类ee");
	}
}
public class test2 extends parenttest{
	void hh(){
		System.out.println("子类hh");
	   super.hh();
	}
	void rr(){
		System.out.println("子类rr" );
	}
	void ee(List<?> aa){
		aa.add(null);
			System.out.println(aa.get(0));
		
		
		
	}
	public static void dsa(List<?> list){
		System.out.println("List<?>");
	}
	public  static void dsa(Set<?> list){
		System.out.println("Set<?>");
	}
	public  static void dsa(Collection<?> list){
		System.out.println("Collection<?>");
	}

	static void asserttest(int a, String s){
		assert a != 0;
		assert s == null;
	}
	public static void main(String[] args) {
		 Collection<String>  colle = new ArrayList<String>();
		 Set<String>  set111 = new HashSet<String>();
		 List<String>  list111 = new ArrayList<String>();
         String[] dada = new String[2];
         dada[0] = "No.1";
         dada[1] = "No.2";
         System.out.printf(Arrays.toString(dada));
		dsa(colle);
		dsa(set111);
		dsa(list111);
		
		asserttest(0,"");
		
		
		
		// TODO Auto-generated method stub
        new test2().hh();
        
        Date date = new Date();
        Calendar calen  = Calendar.getInstance();
        calen.setTime(date);
        calen.add(calen.DATE, 7);
        date = calen.getTime();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dtestr = format.format(date);
       /* List<String> sr = new ArrayList<Object>();会编译出错
        List<Object> sr1 = new ArrayList<String>();*/
        
        @SuppressWarnings("unchecked")
        Set<String>set = new HashSet();
        Object[] t = new Object[2];
        t[0] = new  ArrayList<String>(); 
        t[0] = "wew";
        String str = "wewer";
        List<String> list = new ArrayList<String>();
        list.add("we");
        List<String> liststr = new ArrayList<String>();
       
       // String ss = liststr.get(0);
        Set s1 = new HashSet<String>();
        s1.add("12");
        Set s2 = new HashSet<String>();
        containss(s1,s2);
        adds(String.class,new String("wewe"));
        op da = op.valueOf("jia");
        new dnis();
	}
	public static void containss(Set<?> s1, Set<?> s2){
		int i= 0 ;
		for(Object j :s1){
			if(s2.contains(j)) i++;
		}
		
	}
	public  static <Ee> Ee adds(Class<Ee> list,Object o){ 
		return list.cast(o);
		}

}
class dnis{
	dnis(){
		System.out.println("gou");
	}
	 {
		System.out.println("stic");
	}
}
 enum op{
	jia{int apply(int x, int y){ return x+y;} },
	jian{int apply(int x, int y){ return x-y;} },
	chen{int apply(int x, int y){ return x*y;}};
	abstract int apply(int x, int j);
	static {
		
	}
}


