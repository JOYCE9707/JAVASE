package DAY10;
/*����ֵ����
�������ͣ�
	��:���ص��Ǹ���Ķ���
	������:
           �ӿ�:
*/
class Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}
	
class PersonDemo {
	public Person getPerson() {
		return new Person();//person p= new Person() ,return  p���ص���NEW�Ķ���
	}
}

class PersonTest {
public static void main(String[] args) {
	PersonDemo pd = new PersonDemo();
	Person p =pd.getPerson();
	p.study();
}
}
