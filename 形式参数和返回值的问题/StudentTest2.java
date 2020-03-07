package DAY10;
//形式参数之引用类型为抽象类时的做法
//有一个抽象类
abstract class Student{
	public abstract void Study();
	}
//抽象类的一个具体子类
class GrilStudent extends Student{
	public void Study(){
		System.out.println("女学生似乎更加热衷于学习");
	}
}

class StudentDome {
	public void method(Student s){
		s.Study();
		
	}
}



public class StudentTest2 {
public static void main(String[] args) {
	StudentDome sd = new StudentDome();
	Student s = new GrilStudent();
	sd.method(s);
	
}
}
