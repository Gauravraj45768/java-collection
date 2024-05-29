package com.jsp.collection;

import java.util.PriorityQueue;

public class PriorityQp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PriorityQueue p=new PriorityQueue();
         p.add(10);
        // p.add(null);  java.lang.NullPointerException
         p.add(10);
         p.add(3);
         //p.add("ram");  java.lang.ClassCastException
         System.out.println(p);
	}

}
