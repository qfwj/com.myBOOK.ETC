/**
* @Project: NKW
* @Title: test2.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月1日 下午6:11:46
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: test2
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月1日下午6:11:46
* @remark:   StringBuffer类和String一样，也用来代表字符串，只是由于StringBuffer的内部实现方式和String不同，
* 所以StringBuffer在进行字符串处理时，不生成新的对象，在内存使用上要优于String类。
         所以在实际使用时，如果经常需要对一个字符串进行修改，例如插入、删除等操作，使用StringBuffer要更加适合一些。
  a、append方法
         public StringBuffer append(boolean b)
该方法的作用是追加内容到当前StringBuffer对象的末尾，类似于字符串的连接。调用该方法以后，StringBuffer对象的内容也发生改变，例如：
                  StringBuffer sb = new StringBuffer(“abc”);
                   sb.append(true);
  b、deleteCharAt方法
         public StringBuffer deleteCharAt(int index)
         
    c、insert方法


         
 d、reverse方法
           
 http://www.cnblogs.com/springcsc/archive/2009/12/03/1616330.html          
*/

public class test2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("we are family");
		
       System.out.println(str.toString().replace(" ", "\\"));
       注意转义字符
       http://volfred.blog.163.com/blog/static/18601637120114810732981/
	}

}




