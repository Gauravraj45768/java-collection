package com.jsp.collection;

import java.util.Stack;

public class Stackp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Stack s=new Stack();
          s.add(10);
          s.add(20);
          s.add(30);
          s.add("hi");
          System.out.println(s);
          s.pop();
          System.out.println(s); 
	}

}
