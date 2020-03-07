package DAY9;

interface Jumpping {
	public abstract void jump();
}


abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat();//�Բ�һ���Ķ������������ǳ��󷽷�
	
	public void sleep(){
		System.out.println("���ﶼ��˯��");
	}//���ﶼ��˯���������Ǿ��巽��
	
}
//����è��
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("è�����");
	}
}
//���幷��
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�������");
	}
}
//�����߹��ܵ�è
class JumpCat extends Cat implements Jumpping{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("��д���è������");
	}
}
//�����߹��ܵĹ�
class JumpDog extends Dog implements Jumpping{//�̳й�����ʵ������
	public JumpDog(){}//���췽��
	public JumpDog(String name,int age){//�������Ĺ��췽��
		super(name,age);
	}
	public void jump(){
		System.out.println("��д��Ĺ�������");
	}
}



public class InterfaceTest {
	
	public static void main(String[] args) {
		//�����ߵ�è
		JumpCat jc = new JumpCat();
		jc.setAge(3);
		jc.setName("TOM");
		System.out.println("��è"+jc.getAge()+"����-----"+"����������"+jc.getName());
		jc.eat();
		jc.sleep();
		jc.jump();
		//�ù��췽����ֵ
		JumpCat jc2 = new JumpCat("ѩ��",2);
		System.out.println("��è"+jc2.getAge()+"����-----"+"����������"+jc2.getName());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		//�����ߵĹ�
		JumpDog jd = new JumpDog();
		jd.setAge(3);
		jd.setName("����");
		System.out.println("��"+jd.getAge()+"����-----"+"����������"+jd.getName());
		jd.eat();
		jd.sleep();
		jd.jump();
	}
	

}
