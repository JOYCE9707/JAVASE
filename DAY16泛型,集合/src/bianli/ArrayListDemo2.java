package bianli;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * ����ArrayList�洢�Զ�����󲢱�����
 * 
 * A:����ѧ����
 * B:�������϶���
 * C:����Ԫ�ض���
 * D:��Ԫ����ӵ�����
 * E:��������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Student s1 = new Student(40, "�ܲ�"); 
		Student s2 = new Student(30, "����"); 
		Student s3 = new Student(26, "�����");
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		
		//����������
		Iterator<Student> i = array.iterator();
		while(i.hasNext()){
			Student s=i.next();
			System.out.println(s.getName()+"----"+s.getAge());
			}
		System.out.println("---------------------------");
		//for
		for(int x = 0;x<array.size();x++){
			Student ss = array.get(x);
			System.out.println(ss.getName()+"----"+ss.getAge());
			}
		
		System.out.println("---------------------------");
		//��ǿFOR
		for(Student sss:array){
			System.out.println(sss.getName()+"----"+sss.getAge());
		}
		
		
		
	}


}
