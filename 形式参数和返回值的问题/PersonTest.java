package DAY10;
/*返回值类型
引用类型：
	类:返回的是该类的对象
	抽象类:
           接口:
*/
class Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}
	
class PersonDemo {
	public Person getPerson() {
		return new Person();//person p= new Person() ,return  p返回的是NEW的对象
	}
}

class PersonTest {
public static void main(String[] args) {
	PersonDemo pd = new PersonDemo();
	Person p =pd.getPerson();
	p.study();
}
}
