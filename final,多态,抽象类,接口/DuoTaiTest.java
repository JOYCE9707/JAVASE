package DAY9;
class  Animal {
	public void eat(){
		System.out.println("�Զ���");
	} 
	}

class dog extends Animal {
	public void eat(){
		System.out.println("������");
	}
	public void lookDoor(){
		System.out.println("������");
	}
}
class cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
	public void playGame(){
		System.out.println("è����Ϸ");
	}
}

public class DuoTaiTest {
public static void main(String[] args) {
	//����Ϊ��
	Animal a =new dog();
	a.eat();
	System.out.println("-------------------");
	//��ԭ�ɹ�
	dog d=(dog)a;
	d.eat();
	d.lookDoor();
	System.out.println("-------------------");
	//���è
	a= new cat();
	a.eat();
	System.out.println("-------------------");
	//��ԭ��è
	cat c = (cat)a;
	c.eat();
	c.playGame();
	
}
}
