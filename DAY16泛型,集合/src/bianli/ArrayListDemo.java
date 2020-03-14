package bianli;

import java.util.ArrayList;
import java.util.Iterator;
//带泛型的ArrayList存储字符串并分别用for ，迭代器，增强for遍历 
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> array = new ArrayList<String>();
	
	array.add("hello");
	array.add("wolrd");
	array.add("java");
	
	
	//迭代器遍历
	Iterator<String>  i =  array.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	    }
	System.out.println("---------------------------");
	//for
	for(int x = 0;x<array.size();x++){
		System.out.println(array.get(x));
		}
	System.out.println("---------------------------");
	//增强for遍历
	for(String ii:array){
		System.out.println(ii);
		}
	
}
}
