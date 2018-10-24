package com.vivek.collectionDemo;
import java.util.*;
public class TreeMapComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t=new TreeMap(new MyComparator());
		t.put("xxx", 10);
		t.put("aaa", 20);
		t.put("zzz", 30);
		t.put("lll",5);
		System.out.println(t);

	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s2.compareTo(s1);
	}
	


}
