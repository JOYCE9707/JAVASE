package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 		C:创建学生对象
 * 		D:把学生对象添加到集合对象中
 * 		E:遍历集合
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		//创建学生对象
		Student s1 = new Student("周星驰",50);
		Student s2 = new Student("周杰伦",40);
		Student s3 = new Student("王力宏",30);
		Student s4 = new Student("林俊杰",20);
		//把学生对象添加到集合对象中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		// 遍历集合
		Iterator i = c.iterator();
		while (i.hasNext());{
			Student s = (Student)i.next();
			
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		
	}
}