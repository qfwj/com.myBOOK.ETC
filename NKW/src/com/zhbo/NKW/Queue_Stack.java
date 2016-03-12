/**
* @Project: NKW
* @Title: Queue_Stack.java
* @Description: TODO
* @author: zhongbo
* @date :2015��12��3�� ����7:22:34
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.Stack;

/**
* @ClassName: Queue_Stack
* @Description: TODO
* @author: zhongbo
* @date: 2015��12��3������7:22:34
* @remark: 
* ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
* Stack����peek��ջ���� push pop empty search�����ص���λ�ò���������
* 
*/

public class Queue_Stack {
	
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        
	        if(stack1.empty()) {
	           stack1.push(node); 
	        } else {
	            while(!stack1.empty()){
	                stack2.push(stack1.pop());
	            }
	            stack1.push(node);
	            while(!stack2.empty()){
	                stack1.push(stack2.pop());
	            }
	        }
	        
	    }
	    
	    public int pop() {// ���ܶ����Ѿ�Ϊ���˴�ʱ���쳣 
	      /*if(stack1.empty()){
	          return null;
	      }*/
	        return stack1.pop();
	    }
	    
	    
	    
	    public static void main(String [] args){
	    	Queue_Stack que = new Queue_Stack();
	    	que.push(1);
	    	que.push(3);
	    	System.out.println(que.stack1.search(3));
	    	System.out.println(que.stack1.peek());
	    	que.pop();
	    	que.pop();
	    
	    
	    }
	}





