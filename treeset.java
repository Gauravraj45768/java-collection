package com.jsp.collection;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeSet ts=new TreeSet();
          ts.add(10);
          ts.add(10);
          ts.add(5);
//          ts.add(null); java.lang.NullPointerException
//          ts.add("she"); java.lang.ClassCastException
          System.out.println(ts);//asc order
          
	}

}
