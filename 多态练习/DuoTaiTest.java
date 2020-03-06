package DAY9;
class  Animal {
	public void eat(){
		System.out.println("吃东西");
	} 
	}

class dog extends Animal {
	public void eat(){
		System.out.println("狗吃肉");
	}
	public void lookDoor(){
		System.out.println("狗看门");
	}
}
class cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void playGame(){
		System.out.println("猫玩游戏");
	}
}

public class DuoTaiTest {
public static void main(String[] args) {
	//定义为狗
	Animal a =new dog();
	a.eat();
	System.out.println("-------------------");
	//还原成狗
	dog d=(dog)a;
	d.eat();
	d.lookDoor();
	System.out.println("-------------------");
	//变成猫
	a= new cat();
	a.eat();
	System.out.println("-------------------");
	//还原成猫
	cat c = (cat)a;
	c.eat();
	c.playGame();
	
}
}
