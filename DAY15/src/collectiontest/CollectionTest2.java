package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱���Student(name,age)
 *
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:����ѧ������
 * 		D:��ѧ��������ӵ����϶�����
 * 		E:��������
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();
		//����ѧ������
		Student s1 = new Student("���ǳ�",50);
		Student s2 = new Student("�ܽ���",40);
		Student s3 = new Student("������",30);
		Student s4 = new Student("�ֿ���",20);
		//��ѧ��������ӵ����϶�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		// ��������
		Iterator i = c.iterator();
		while (i.hasNext());{
			Student s = (Student)i.next();
			
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		
	}
}