package zz;
/*è���ĳ����స��
 * �������è����
 * ����:���֣����䣬�Է�

 * è��
 * ��Ա����������������
 * ���췽�����޲Σ�����
 * ��Ա�������Է���è���㣩
 * ����
 * ��Ա����������������
 * ���췽�����޲Σ�����
 * ��Ա�������Է��������⣩
 * 
 * �������ݿ��Զ���Ϊһ������
 * ����Ϊ�ԵĶ�����һ�� �����ԳԷ��ķ���Ϊ�����
 * ��Ϊ�����ǳ���ģ����԰���������Ҳ����Ϊ������
 * ������Ϊ�����ࣺ
 * ��Ա����������������
 * ���췽�����޲Σ�����
 * ��Ա�������Է�();
 * 
 * 
 * */
abstract class Animal {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public Animal(){}
	public Animal (int age,String name){
		this.age=age;
		this.name=name;
	}
	//����һ�����󷽷�
	public abstract void eat (); 
} 
//������
class Cat extends Animal {
	public Cat(){}
	public Cat(int age,String name){
		super(age,name);
	}
	
	public  void eat (){
		System.out.println("è����");
}
}
class Dog extends Animal {
	public Dog(){}
	public Dog(int age,String name){
		super(age,name);
	}
	
	public  void eat (){
		System.out.println("������");
}
}


public class AbstractTest {
public static void main(String[] args) {
	//��
	Dog d= new Dog();
	d.setName("���");
	d.setAge(3);
	System.out.println(d.getAge()+"----"+d.getName());
	d.eat();
	//��ʽ2
	Dog d2= new Dog(2,"С��");
	System.out.println(d2.getAge()+"----"+d2.getName());
	d.eat();
	//è
	Cat c= new Cat();
	c.setName("���");
	c.setAge(3);
	System.out.println(c.getAge()+"----"+c.getName());
	c.eat();
	//��ʽ2
	Cat c2= new Cat(2,"С��");
	System.out.println(c2.getAge()+"----"+c2.getName());
	c.eat();
	
	
}
}
