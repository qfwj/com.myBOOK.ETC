/**
* @Project: NKW
* @Title: test2.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��1�� ����6:11:46
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;
/**
* @ClassName: test2
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��1������6:11:46
* @remark:   StringBuffer���Stringһ����Ҳ���������ַ�����ֻ������StringBuffer���ڲ�ʵ�ַ�ʽ��String��ͬ��
* ����StringBuffer�ڽ����ַ�������ʱ���������µĶ������ڴ�ʹ����Ҫ����String�ࡣ
         ������ʵ��ʹ��ʱ�����������Ҫ��һ���ַ��������޸ģ�������롢ɾ���Ȳ�����ʹ��StringBufferҪ�����ʺ�һЩ��
  a��append����
         public StringBuffer append(boolean b)
�÷�����������׷�����ݵ���ǰStringBuffer�����ĩβ���������ַ��������ӡ����ø÷����Ժ�StringBuffer���������Ҳ�����ı䣬���磺
                  StringBuffer sb = new StringBuffer(��abc��);
                   sb.append(true);
  b��deleteCharAt����
         public StringBuffer deleteCharAt(int index)
         
    c��insert����


         
 d��reverse����
           
 http://www.cnblogs.com/springcsc/archive/2009/12/03/1616330.html          
*/

public class test2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("we are family");
		
       System.out.println(str.toString().replace(" ", "\\"));
       ע��ת���ַ�
       http://volfred.blog.163.com/blog/static/18601637120114810732981/
	}

}




