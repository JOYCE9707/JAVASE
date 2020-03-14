package cn_itcast_02;

import java.util.ArrayList;



/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建大集合
		ArrayList<ArrayList<Student>> Bigarray = new ArrayList<ArrayList<Student>>();
		
		//创建第一个小集合
		ArrayList<Student> fristarray = new ArrayList<Student>();
		Student s1 = new Student("唐僧", 30);
		Student s2 = new Student("孙悟空", 29);
		Student s3 = new Student("猪八戒", 28);
		Student s4 = new Student("沙僧", 27);
		fristarray.add(s1);
		fristarray.add(s2);
		fristarray.add(s3);
		fristarray.add(s4);
		//创建第二个小集合
				ArrayList<Student> secondarray = new ArrayList<Student>();
				Student ss1 = new Student("诸葛亮", 30);
				Student ss2 = new Student("刘备", 29);
				Student ss3 = new Student("关羽", 28);
				Student ss4 = new Student("张飞", 27);
				secondarray.add(ss1);
				secondarray.add(ss2);
				secondarray.add(ss3);
				secondarray.add(ss4);	
				//创建第三个小集合
				ArrayList<Student> thirdarray = new ArrayList<Student>();
				Student sss1 = new Student("林黛玉", 30);
				Student sss2 = new Student("王熙凤", 29);
				Student sss3 = new Student("贾宝玉", 28);
				Student sss4 = new Student("薛宝钗", 27);
				thirdarray.add(sss1);
				thirdarray.add(sss2);
				thirdarray.add(sss3);
				thirdarray.add(sss4);
		
				Bigarray.add(fristarray);
				Bigarray.add(secondarray);		
				Bigarray.add(thirdarray);		
				for(ArrayList<Student> a:Bigarray){
					for(Student aa:a){
						System.out.println(aa.getName()+"-------"+aa.getAge());
						
					}
				}
				
	
}
}
