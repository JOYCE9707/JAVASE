package DAY9;

class Person{
	public void eat(){
		System.out.println("�Է�");
	}
} 
class SouthPerson extends Person{
	public void eat(){
		System.out.println("���׷�,����");
	}	
	public void jingShang(){
		System.out.println("ϲ������");		
	}
}
class NouthPerson extends Person{
	public void eat(){
		System.out.println("����,����");
	}
	public void yanJiu(){
		System.out.println("ϲ���о�");
		
	}
}



public class DuoTaiTest2 {
public static void main(String[] args) {
	//�Ϸ���
	Person p = new SouthPerson();
	p.eat();
	//�Ϸ���
	SouthPerson sp = (SouthPerson)p;
	sp.eat();
	sp.jingShang();
	//������
	p = new NouthPerson();
	p.eat();
	NouthPerson np = (NouthPerson)p;
	np.eat();
	np.yanJiu();
	
}
}
