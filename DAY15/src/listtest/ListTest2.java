package listtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




/*
 * �洢�Զ�����󲢱���,����ͨforѭ����(size()��get()���)
 */
public class ListTest2 {
	public static void main(String[] args) {
	List list = new ArrayList();
	Student s1 = new Student("Ѧ����",16);
	Student s2 = new Student("������",15);
	Student s3 = new Student("������",25);
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	//����������
	Iterator it = list.iterator();
	while(it.hasNext()){
		Student s = (Student)it.next();//next�����������һ����������Ҫ��ǿת��Student��������Student����
		System.out.println(s.getAge()+"-----"+s.getName());
	}
	
	
		
	//get size����	
	for (int x=0;x<list.size();x++){
		
		
		System.out.println(((Student)list.get(x)).getAge()+"----"+((Student)list.get(x)).getName());
		
	}
	
	
	
	
	
	}
}
