package bianli;

import java.util.Iterator;
import java.util.LinkedList;

//带泛型的LinkedList自定义对象并分别用for ，迭代器，增强for遍历 
/*
 * 。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class LinkedListDemo2 {
public static void main(String[] args) {
	LinkedList<Student> list = new LinkedList<Student>();
	
	Student s1 = new Student(20,"拜拉席恩");
	Student s2 = new Student(30,"兰尼斯特");
	Student s3 = new Student(25,"史塔克");
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	//迭代器
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
	//增强for
	for(Student sss:list){
		System.out.println(sss.getName()+"-----"+sss.getAge());
		}
	
}
}
