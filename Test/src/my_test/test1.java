/**
* @Project: Test
* @Title: test1.java
* @Description: TODO
* @author: zhongbo
* @date :2015年10月27日 下午2:04:51
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
* @ClassName: test1
* @Description: TODO
* @author: zhongbo
* @date: 2015年10月27日下午2:04:51
* @remark: 
*/



  class AAA{
	int a;
	AAA(int a ){
		this.a =a;
		System.out.println("调用了少年");
	
	}
	private void privatemethod(){
		System.out.println("私有方法");
	}
	public void publicMethod(){
		this.privatemethod();
		System.out.println("共有方法");
	}
}

public  class test1 {
private  AAA asd = new AAA(2);
	test1(int i){
		j = i;
		System.out.println("hahahahhahhah");
	}

	final int j ;
	 public void change(final AAA aa){
		 aa.a = 3;
	 }
	 public static int GCD(int a, int b) {
		   if (b == 0) return a;
		   return GCD(b,a % b);
	 }
    public static void main(String[]args) {
    	
    	
    	Stack<Integer> ss = new Stack<Integer>();
    	ss.push(1);
    	ss.push(2);
    	int iii = ss.peek();
    	
    	try{
    		List<AAA> list = new ArrayList<AAA>();
    		list.add(new AAA(2));
            AAA head = list.get(0);
            list.clear();
    		/* Integer head1  = list.get(0);
    		 head1 = 1;
    		 boolean bbn = head ==head1;*/
    		
    		
    		test1 ewe = new test1(1);
    		
    		AAA dwe =new AAA(3);
    		dwe.publicMethod();
    		
    		Set<String> st = new TreeSet<String>(); 
    		st.add("q");
    		st.add("w");
    		st.add("e");
    		st.add("r");
    		Iterator it = st.iterator();
    		while(it.hasNext()){
    		System.out.println(it.next());
    		}
    		for(String s:st)System.out.println(s);
    		
    		Set<Integer> st1 = new LinkedHashSet<Integer>(); 
    		st1.add(4);
    		st1.add(3);
    		st1.add(2);
    		st1.add(1);
    		System.out.println(st1.toArray()[0]);
    		st1.add(new Integer(3));
    		Iterator it1 = st1.iterator();
    		while(it1.hasNext()){
    		System.out.println(it1.next());
    		}
    		for(Integer s:st1)System.out.println(s);
    		
    		String strdate = "2015-12-26 18:24:24";
        	Date date;
        	DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        	date = format.parse(strdate);
            String strate = format.format(date);
            Integer ni = Integer.valueOf(-128);
        	Integer ii = Integer.valueOf(-128);
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    	Integer ni = Integer.valueOf(-128);
    	Integer ii = Integer.valueOf(-128);
    	boolean bbb = (ni == ii);
    	  AAA aa = new AAA(4);
    	  AAA cc = new AAA(3);
    	  int i = aa.a;
    	  test1 a = new test1(1);
    	  a.change(aa);
    	  int z = aa.a;
    	  final List<AAA> li = new ArrayList<AAA>();
    	  li.add(aa);
    	  aa=cc;
    	  li.add(cc);
    	  
    	/*while(true){
    		
    	}*/
    	/*try{
    		Class c = Class.forName("my_test.test1");必须带上包名；而且必须有无参的构建器
    	 c.newInstance();
    	} catch (Exception e){
    	
    		e.printStackTrace();
    	}*/
    	
    	//aa [] sas = new aa[8];
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	Object [] array = list.toArray();
    	List<Object> list1 = Arrays.asList(array);
    	String scope;
    	int m = 9;
    	int n =12;
    	int ccb = GCD(9,12);
    	boolean si = false;
    	 int j =  ~m;
    	//Map <aa,Double> map = new HashMap<aa,Double>();
    	/*aa a = new aa();*/
    //	map.put(a, 2.1);
    	//Double aa = map.put(a, 1.3);
    	
    	
    	double d1 = 100000000000000001.0/300000000000000000.0;
    	double d2 = 10.0/30.0;
    	System.out.println(d2==d1);
    	/*String ss = "    12  12323 12 ";
    	
         if(ss.indexOf(" ") == 0) ss = ss.substring(1);
         
        ss = ss.trim();
     	StringBuffer sc = new StringBuffer();
     	String[] str = ss.split(" ");
     	if(str.length == 1) System.out.println(ss);
     	for(int i = str.length -1; i >= 0; --i){
     	   
     		sc.append(str[i] + " ");
     		
     	}
    	System.out.println(sc);
    	*/
    	/*String str = "打扫打扫 东三省的撒";
    	System.out.println(str.contains("东三"));
    	
    	Date de = new Date();
    	System.out.println(de.toString());*/
    	
    	/*StringBuffer erpCode = new StringBuffer();
    	char [] charAE = new char[26];
    	for(int i = 0; i < 26; ++i){
    		charAE[i] = (char)((int)'A'+ i);
    	}*/
    	
    	
    	
    	
    	/*Scanner ss = new Scanner(System.in);*/
    	/*
    	String s2 = ss.nextLine();
    	System.out.println(s1);
    	System.out.println(s2);
    	while(ss.hasNext()) {String s1 = ss.nextLine();System.out.println(s1);};
    	Object o = null;
    	System.out.println(null == o ? o :0);*/
    /*	 固定的为MM表示天 mm表示分钟 hh HH表示24小时制
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	  Date date = new Date();
    	  String strdate = format.format(date);
    	  System.out.println(strdate);*/
    	/*测试index  为 2 
    	String str = "wein the mountain";
    	System.out.println(str.indexOf("in"));*/
    	
    	/*HashMap测试
    	HashMap<Integer,String> hh = new HashMap<Integer,String>();
    	hh.put(1, "11");
    	hh.put(1, "22");
    	System.out.println(hh.toString());
    	System.out.println(hh.get(1));
    	*/
    	/*String str = "worerg wewe";
    	int [] bb = {9};
    	int [] aa = {1,2,3,4,5,6};
    	System.arraycopy(aa,1, aa, 0, 4);
	System.out.println(aa[0]);
    	
    	*/
    	
	
	
	
	
	
    	/*
    	
    	int[] a = {1,2,3,4,5,6,7,8,9,10};
    	int []b = new int[10];
    	b[0] = a[0];
    	for(int i= 0; i < 9; ++i){
    		b[i+1] = b[0];
    		b[0] *= a[i+1];
    		System.out.println(b[0]);
    		
    	}
    	b[0] = a[9];
    	for(int i = 8; i > 0; --i){
    		b[i] *= b[0];
    		b[0] *=a[i];
    	}
    	for( int i = 0; i < 10;++i){
    		System.out.println(b[i]);
    	}
    	*/
    	/* String date = "2015-10-30 17-04-20";
    	   
    	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	   ParsePosition pos = new ParsePosition(0);
    	   Date currentTime= formatter.parse(date,pos);
    	   System.out.print(currentTime);*/
    }   
}




