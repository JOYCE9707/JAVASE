package bianli;

import java.util.Iterator;
import java.util.LinkedList;

//�����͵�LinkedList�Զ�����󲢷ֱ���for ������������ǿfor���� 
/*
 * ��
 * 
 * A:����ѧ����
 * B:�������϶���
 * C:����Ԫ�ض���
 * D:��Ԫ����ӵ�����
 * E:��������
 */
public class LinkedListDemo2 {
public static void main(String[] args) {
	LinkedList<Student> list = new LinkedList<Student>();
	
	Student s1 = new Student(20,"����ϯ��");
	Student s2 = new Student(30,"����˹��");
	Student s3 = new Student(25,"ʷ����");
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	//������
	Iterator<Student> i  = list.iterator();
	while(i.hasNext()){
		Student s = i.next();
		System.out.println(s.getName()+"-----"+s.getAge());
	}
	System.out.println("--------------");
	//for
	for(int x = 0; x<list.size();x++){
		Student ss = list.get(x);
		System.out.println(ss.getName()+"-----"+ss.getAge());
		}
	System.out.println("--------------");
	//��ǿfor
	for(Student sss:list){
		System.out.println(sss.getName()+"-----"+sss.getAge());
		}
	
}
}
