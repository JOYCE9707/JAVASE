package DAY10;
//��ʽ����֮��������Ϊ������ʱ������
//��һ��������
abstract class Student{
	public abstract void Study();
	}
//�������һ����������
class GrilStudent extends Student{
	public void Study(){
		System.out.println("Ůѧ���ƺ�����������ѧϰ");
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
