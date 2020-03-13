package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
 * 
 * ע�⣺
 * 		A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ��
 * 		B:���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ������������׳��ֲ����������⡣
 */
public class IteratorTest {
	public static void main(String[] args) {
		// �������϶���
	Collection c = new ArrayList();
	
	Student s1 = new Student("���ǳ�",50);
	Student s2 = new Student("�ܽ���",40);
	Student s3 = new Student("������",30);
	Student s4 = new Student("�ֿ���",20);
	c.add(s1);
	c.add(s2);
	c.add(s3);
	c.add(s4);
	
	Iterator it = c.iterator();
	while(it.hasNext()){
		Student s = (Student)it.next();
		System.out.println(s.getAge()+"----"+s.getName());
		
	}
	
	}
}
