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
	
	public abstract void eat();//吃不一样的东西，所以这是抽象方法
	
	public void sleep(){
		System.out.println("动物都会睡觉");
	}//动物都会睡觉所以这是具体方法
	
}
//具体猫类
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫会吃鱼");
	}
}
//具体狗类
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗会吃肉");
	}
}
//有跳高功能的猫
class JumpCat extends Cat implements Jumpping{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("重写后的猫会跳高");
	}
}
//有跳高功能的狗
class JumpDog extends Dog implements Jumpping{//继承狗并且实现跳高
	public JumpDog(){}//构造方法
	public JumpDog(String name,int age){//带参数的构造方法
		super(name,age);
	}
	public void jump(){
		System.out.println("重写后的狗会跳高");
	}
}



public class InterfaceTest {
	
	public static void main(String[] args) {
		//会跳高的猫
		JumpCat jc = new JumpCat();
		jc.setAge(3);
		jc.setName("TOM");
		System.out.println("黑猫"+jc.getAge()+"岁了-----"+"它的名字是"+jc.getName());
		jc.eat();
		jc.sleep();
		jc.jump();
		//用构造方法赋值
		JumpCat jc2 = new JumpCat("雪伊",2);
		System.out.println("白猫"+jc2.getAge()+"岁了-----"+"它的名字是"+jc2.getName());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		//会跳高的狗
		JumpDog jd = new JumpDog();
		jd.setAge(3);
		jd.setName("旺财");
		System.out.println("狗"+jd.getAge()+"岁了-----"+"它的名字是"+jd.getName());
		jd.eat();
		jd.sleep();
		jd.jump();
	}
	

}
