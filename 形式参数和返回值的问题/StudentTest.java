package DAY10;
//��ʽ����֮��������Ϊ����ʱ������
//����һ����
class Student{
	public void Study(){
		System.out.println("ѧϰ��ѧ��������");
	}
	}
//����ڶ�����	
class StudentDemo{
		public void method(Student s){ //ss; sd = new Student();  Student s = new Student();
			s.Study();
		}
		}
	
public class StudentTest {
public static void main(String[] args) {
	Student s =new Student();//��new����
	StudentDemo sd=new StudentDemo();//��new����
	sd.method(s);//s��Ϊ�������ݵ���StudentDemo����method����ȥִ����s.Study();
}
}



