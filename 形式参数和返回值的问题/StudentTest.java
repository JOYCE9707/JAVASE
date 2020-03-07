package DAY10;
//形式参数之引用类型为类名时的做法
//定义一个类
class Student{
	public void Study(){
		System.out.println("学习是学生的任务");
	}
	}
//定义第二个类	
class StudentDemo{
		public void method(Student s){ //ss; sd = new Student();  Student s = new Student();
			s.Study();
		}
		}
	
public class StudentTest {
public static void main(String[] args) {
	Student s =new Student();//先new出来
	StudentDemo sd=new StudentDemo();//先new出来
	sd.method(s);//s作为类名传递到了StudentDemo类中method方法去执行了s.Study();
}
}



