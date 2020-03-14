package bianli;

import java.util.Iterator;
import java.util.LinkedList;
//带泛型的LinkedList存储字符串并分别用for ，迭代器，增强for遍历 
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	
	
	list.add("Hello");
	list.add("world");
	list.add("java");
	
	
	
	//迭代器
	Iterator<String> i = list.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
		}
	System.out.println("---------------------------");
	//for
	for(int x =0 ;x<list.size();x++){
		System.out.println(list.get(x));
		}
	System.out.println("---------------------------");
	//增强FOR
	for(String s:list){
		System.out.println(s);
		
		
	}
	
}
}
