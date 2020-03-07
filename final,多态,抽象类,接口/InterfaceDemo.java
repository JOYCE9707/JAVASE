package DAY10;


/*
	�������˶�Ա����(ѧ������Ȼ�󽲽�)
		ƹ�����˶�Ա�������˶�Ա��
		ƹ������������������
		Ϊ�˳�����������ƹ������ص���Ա����ҪѧϰӢ�
		������ѧ֪ʶ��
		�������������������Щ�����࣬��Щ�ӿڣ���Щ�����ࡣ
	
	�����������̣�����ͨ����ͼ����ġ�	
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
		System.out.println("�˶���Ҫ˯����");
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
		System.out.println("�Դ�ײˣ�����");
	};
	public  void Study(){
		System.out.println("ѵ��ƹ����");
	};
	public void speak() {
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
	
}
class BasketballPlayer extends Player {
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("��С�ײˣ��Է�");
	}
	public  void Study(){
		System.out.println("ѵ������");
	}
}
class PingPongCoach extends Coach implements SpeakEnglish{
	public PingPongCoach(){}
	public PingPongCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("ƹ������������⣬�ȹ�֭");
	};
	public  void teach(){
		System.out.println("��ƹ����");
	};
	public void speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}
	
}

class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("���������ţ�⣬��ơ��");
	};
	public  void teach(){
		System.out.println("�̴�����");
	};
}
class InterfaceDemo{
	public static void main(String[] args) {
		PingPongPlayer ppp = new PingPongPlayer();
		ppp.setAge(30);
		ppp.setName("����");
		System.out.println(ppp.getName()+"------"+ppp.getAge());
		ppp.sleep();
		ppp.Study();
		ppp.speak();
		System.out.println();
		
		
	}
	
	
}

