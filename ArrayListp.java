package com.jsp.collection;

import java.util.ArrayList;

public class ArrayListp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ArrayList al=new ArrayList();
            al.add(null);
            al.add(null);
            al.add(10);
            al.add(3,100);
            System.out.println(al);
//            ArrayList al1=new ArrayList(al);
//            System.out.println(al1);
//            ya
            ArrayList al1=new ArrayList();
            al1.addAll(al);
           
            
            al1.add(20);
//            follow nidhi
//            al1.remove(0);
//            System.out.println(al1);
            System.out.println(al1);
            al1.removeAll(al);//return unique
            System.out.println(al1);
            al1.add(10);           
            al.add(20);
            System.out.println(al);
            System.out.println(al1);
            al1.retainAll(al);//return common
            System.out.println(al1);
            Object o=20;
            al1.remove(o);
            System.out.println(al1);
            Object o1=10;
            System.out.println(al1.contains(o1));
            
            
            
	}

}
