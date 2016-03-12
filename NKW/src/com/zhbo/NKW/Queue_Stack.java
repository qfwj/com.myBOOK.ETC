/**
* @Project: NKW
* @Title: Queue_Stack.java
* @Description: TODO
* @author: zhongbo
* @date :2015年12月3日 下午7:22:34
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package com.zhbo.NKW;

import java.util.Stack;

/**
* @ClassName: Queue_Stack
* @Description: TODO
* @author: zhongbo
* @date: 2015年12月3日下午7:22:34
* @remark: 
* 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
* Stack方法peek（栈顶） push pop empty search（返回的是位置不是索引）
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
	    
	    public int pop() {// 可能队列已经为空了此时抛异常 
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





