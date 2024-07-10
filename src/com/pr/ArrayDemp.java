package com.pr;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Array
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=5;
		arr[2]=7;
		arr[3]=9;
		arr[4]=4;
		for(int i:arr)
		{
			System.out.println("Array elements are :"+i);
		}
		
		
		//Char array
		char ch[]= {'a','b','d','c'};
		Arrays.sort(ch);
		System.out.print("Sorted char Array"+ch+" ");
		for(char c:ch)
		{
			System.out.println(c);
			
		}	
			
			//COLLECTIONS.........
     String str="Praveen";
     char[] char1=str.toCharArray();
     for(char a:char1)
     {
    	 System.out.println("String to Char Array :"+a);
     }
     // Int to String Array
     int[] a1= {3,6,8,2,7,8,9};
     Arrays.sort(a1);
     System.out.println("Sorting with array:"+Arrays.toString(a1));
     
     //ArrayList
     ArrayList list=new ArrayList();
     list.add(10);
     list.add("rocky");
     list.add('r');
     list.add('h');
     list.add(13);
     for(var a2:list)
     {
    	 System.out.println("Non Generic :"+a2);
     }
     System.out.println("Empty or Not: "+list.isEmpty());
     System.out.println("Empty or Not: "+list.size());
     list.remove(4);
     list.set(2,"Apple");
     for(var a2:list)
     {
    	 System.out.println("Non Generic :"+a2);
     }
  }
}
