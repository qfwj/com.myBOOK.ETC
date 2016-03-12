/**
* @Project: NKW
* @Title: Tree_searchTree.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��22�� ����9:41:06
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Tree_searchTree
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��22������9:41:06
* @remark: ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
* ����������Yes,�������No���������������������������ֶ�������ͬ��
*/

/*�㷨˼��:  ������� С �� �� �����ݷֲ���ʽ  �ҵ�һ�������һλС��ֵ �ֳ��������� ǰ�����������  ������������ �������е�ֵ����С���������һλ
	    8             5 7 6 9 11 10 8
	   /  \
	  6   10
	 / \  / \
	5  7 9   11
	*/
public class Tree_searchTree {
	public boolean VerifySquenceOfBST(int [] s) {
        if( s.length == 0) return false;//[]�ж�Ӧ��Ϊ���Ƕ���������
       if(null == s || s.length == 1 || s.length == 0) return true;
         int left = s.length;
         boolean bleft = true;//[]
        boolean right = true;������Ϊ[] Ϊfalse �����Ҫ���� ��־λ
       for(int i = 1; i < s.length; ++i)
        {
           if(s[ s.length-1] > s[ s.length -1-i]){
              left = i;
               break;
           }
       }
        int [] left1 = new int[s.length - left];
        
        int [] right1 = new int[left-1];
        if(left1.length != 0) {
             System.arraycopy(s,0,left1,0,s.length - left);
        for(int j = 0; j < s.length - left; ++j){
            if(left1[j] > s[s.length-1]) return false;�ؼ�
        }
            bleft = VerifySquenceOfBST(left1);
           
        }
         if(right1.length != 0){
            System.arraycopy(s,s.length - left,right1,0,left - 1); 
             right = VerifySquenceOfBST(right1);
         }
        
        ArrayList<ArrayList<Integer>> hh = new ArrayList<ArrayList<Integer>>();
        hh.add(new ArrayList<Integer>().add(0) );
        
        if(bleft && right) return true;
        else
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




