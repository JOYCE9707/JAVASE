package DAY9;

class Person{
	public void eat(){
		System.out.println("吃饭");
	}
} 
class SouthPerson extends Person{
	public void eat(){
		System.out.println("吃米饭,炒菜");
	}	
	public void jingShang(){
		System.out.println("喜欢经商");		
	}
}
class NouthPerson extends Person{
	public void eat(){
		System.out.println("吃面,炖菜");
	}
	public void yanJiu(){
		System.out.println("喜欢研究");
		
	}
}



public class DuoTaiTest2 {
public static void main(String[] args) {
	//南方人
	Person p = new SouthPerson();
	p.eat();
	//南方人
	SouthPerson sp = (SouthPerson)p;
	sp.eat();
	sp.jingShang();
	//北方人
	p = new NouthPerson();
	p.eat();
	NouthPerson np = (NouthPerson)p;
	np.eat();
	np.yanJiu();
	
}
}
