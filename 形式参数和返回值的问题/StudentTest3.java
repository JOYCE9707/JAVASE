package DAY10;

//��ʽ����Ϊ�ӿ�ʱ������ ���ӿ���Ҫ�о�������ʵ����
//����һ��������Ľӿ�
interface Love{
	public  abstract void love();
}
class LoveDemo {
	public void method (Love l){
	l.love();
}
}
//����ѧ����ʵ�ֽӿ�
class Student implements Love{
	public void love(){
		System.out.println("ѧ����ѧϰ");
	}
} 



public class StudentTest3 {
public static void main(String[] args) {
	//������Ҫ����LoveDemo���е�love()����
	LoveDemo LD = new  LoveDemo();
	Love l=new  Student();//��̬
	LD.method(l);//����
}
}
