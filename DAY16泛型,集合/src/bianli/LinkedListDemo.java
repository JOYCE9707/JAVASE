package bianli;

import java.util.Iterator;
import java.util.LinkedList;
//�����͵�LinkedList�洢�ַ������ֱ���for ������������ǿfor���� 
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	
	
	list.add("Hello");
	list.add("world");
	list.add("java");
	
	
	
	//������
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
	//��ǿFOR
	for(String s:list){
		System.out.println(s);
		
		
	}
	
}
}
