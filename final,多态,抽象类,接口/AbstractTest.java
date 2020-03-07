package zz;
/*猫狗的抽象类案例
 * 具体事物：猫，狗
 * 共性:名字，年龄，吃饭

 * 猫：
 * 成员变量：姓名，年龄
 * 构造方法：无参，带参
 * 成员方法：吃饭（猫吃鱼）
 * 狗：
 * 成员变量：姓名，年龄
 * 构造方法：无参，带参
 * 成员方法：吃饭（狗吃肉）
 * 
 * 共性内容可以定义为一个父类
 * 又因为吃的东西不一样 ，所以吃饭的方法为抽象的
 * 因为方法是抽象的，所以包括他的类也必须为抽象类
 * 则动物类为抽象类：
 * 成员变量：姓名，年龄
 * 构造方法：无参，带参
 * 成员方法：吃饭();
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
	//定义一个抽象方法
	public abstract void eat (); 
} 
//具体类
class Cat extends Animal {
	public Cat(){}
	public Cat(int age,String name){
		super(age,name);
	}
	
	public  void eat (){
		System.out.println("猫吃鱼");
}
}
class Dog extends Animal {
	public Dog(){}
	public Dog(int age,String name){
		super(age,name);
	}
	
	public  void eat (){
		System.out.println("狗吃肉");
}
}


public class AbstractTest {
public static void main(String[] args) {
	//狗
	Dog d= new Dog();
	d.setName("大黄");
	d.setAge(3);
	System.out.println(d.getAge()+"----"+d.getName());
	d.eat();
	//方式2
	Dog d2= new Dog(2,"小黄");
	System.out.println(d2.getAge()+"----"+d2.getName());
	d.eat();
	//猫
	Cat c= new Cat();
	c.setName("大白");
	c.setAge(3);
	System.out.println(c.getAge()+"----"+c.getName());
	c.eat();
	//方式2
	Cat c2= new Cat(2,"小白");
	System.out.println(c2.getAge()+"----"+c2.getName());
	c.eat();
	
	
}
}
