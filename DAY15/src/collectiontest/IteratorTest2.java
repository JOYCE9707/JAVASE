package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
 */
public class IteratorTest2 {
	public static void main(String[] args) {
     Collection c = new ArrayList();
    Student s1 = new Student("周星驰",50);
 	Student s2 = new Student("周杰伦",40);
 	Student s3 = new Student("王力宏",30);
 	Student s4 = new Student("林俊杰",20);
 	c.add(s1);
 	c.add(s2);
 	c.add(s3);
 	c.add(s4);
 	
 	
// 	
// 	Iterator it = c.iterator();
// 	while(it.hasNext()){
// 		Student s = (Student)it.next();
// 		System.out.println(s.getAge()+"----"+s.getName());
// 		
 		for(Iterator it = c.iterator();it.hasNext();){
 			Student s = (Student)it.next();
              System.out.println(s.getAge()+"----"+s.getName());
 			
 		}
 	}
	}

