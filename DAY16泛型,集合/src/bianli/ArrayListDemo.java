package bianli;

import java.util.ArrayList;
import java.util.Iterator;
//�����͵�ArrayList�洢�ַ������ֱ���for ������������ǿfor���� 
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> array = new ArrayList<String>();
	
	array.add("hello");
	array.add("wolrd");
	array.add("java");
	
	
	//����������
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
	//��ǿfor����
	for(String ii:array){
		System.out.println(ii);
		}
	
}
}
