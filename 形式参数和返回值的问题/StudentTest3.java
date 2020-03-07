package DAY10;

//形式参数为接口时的做法 ，接口需要有具体类来实现他
//定义一个爱好类的接口
interface Love{
	public  abstract void love();
}
class LoveDemo {
	public void method (Love l){
	l.love();
}
}
//具体学生类实现接口
class Student implements Love{
	public void love(){
		System.out.println("学生爱学习");
	}
} 



public class StudentTest3 {
public static void main(String[] args) {
	//需求：我要测试LoveDemo类中的love()方法
	LoveDemo LD = new  LoveDemo();
	Love l=new  Student();//多态
	LD.method(l);//传参
}
}
