package bianli;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * 需求：ArrayList存储自定义对象并遍历。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Student s1 = new Student(40, "曹操"); 
		Student s2 = new Student(30, "蒋干"); 
		Student s3 = new Student(26, "诸葛亮");
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		
		//迭代器遍历
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
		//增强FOR
		for(Student sss:array){
			System.out.println(sss.getName()+"----"+sss.getAge());
		}
		
		
		
	}


}
