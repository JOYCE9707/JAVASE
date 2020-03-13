package listtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




/*
 * 存储自定义对象并遍历,用普通for循环。(size()和get()结合)
 */
public class ListTest2 {
	public static void main(String[] args) {
	List list = new ArrayList();
	Student s1 = new Student("薛宝钗",16);
	Student s2 = new Student("林黛玉",15);
	Student s3 = new Student("王熙凤",25);
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	//构造器方法
	Iterator it = list.iterator();
	while(it.hasNext()){
		Student s = (Student)it.next();//next方法输出的是一个对象所以要先强转成Student类型再用Student接收
		System.out.println(s.getAge()+"-----"+s.getName());
	}
	
	
		
	//get size方法	
	for (int x=0;x<list.size();x++){
		
		
		System.out.println(((Student)list.get(x)).getAge()+"----"+((Student)list.get(x)).getName());
		
	}
	
	
	
	
	
	}
}
