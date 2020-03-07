package DAY10;


/*
	教练和运动员案例(学生分析然后讲解)
		乒乓球运动员和篮球运动员。
		乒乓球教练和篮球教练。
		为了出国交流，跟乒乓球相关的人员都需要学习英语。
		请用所学知识：
		分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。
	
	整个分析过程，我是通过画图讲解的。	
*/
interface SpeakEnglish{
	public abstract void speak();
}
abstract class Person{
	private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
    	this.name = name;
    	this.age =age;
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
	public abstract void eat();
	public void sleep(){
		System.out.println("人都是要睡觉的");
	}
	}

abstract class Player extends Person{
	public  Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	public abstract void Study();//
	}

abstract class Coach extends Person{
	public  Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
	}


class PingPongPlayer extends Player implements SpeakEnglish{
	public PingPongPlayer(){}
	public PingPongPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("吃大白菜，和粥");
	};
	public  void Study(){
		System.out.println("训练乒乓球");
	};
	public void speak() {
		System.out.println("乒乓球运动员说英语");
	}
	
}
class BasketballPlayer extends Player {
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("吃小白菜，吃饭");
	}
	public  void Study(){
		System.out.println("训练篮球");
	}
}
class PingPongCoach extends Coach implements SpeakEnglish{
	public PingPongCoach(){}
	public PingPongCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("乒乓球教练吃羊肉，喝果汁");
	};
	public  void teach(){
		System.out.println("教乒乓球");
	};
	public void speak() {
		System.out.println("乒乓球教练说英语");
	}
	
}

class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("篮球教练吃牛肉，喝啤酒");
	};
	public  void teach(){
		System.out.println("教打篮球");
	};
}
class InterfaceDemo{
	public static void main(String[] args) {
		PingPongPlayer ppp = new PingPongPlayer();
		ppp.setAge(30);
		ppp.setName("马龙");
		System.out.println(ppp.getName()+"------"+ppp.getAge());
		ppp.sleep();
		ppp.Study();
		ppp.speak();
		System.out.println();
		
		
	}
	
	
}

