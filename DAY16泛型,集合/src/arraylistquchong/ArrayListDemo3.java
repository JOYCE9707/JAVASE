package arraylistquchong;

import java.util.ArrayList;


/*
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
 * Ϊʲô��?
 * 		���Ǳ���˼������������?
 * 		ͨ���򵥵ķ���������֪��������������ж��ϡ�
 * 		������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
 * contains()�����ĵײ���������equals()������
 * �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
 * Object()��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˡ���Ϊnew�Ķ�������ֵַ����ͬ��
 * ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
 * �Զ����ɼ��ɡ�
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 28);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		

		// �����¼���
		ArrayList<Student> newarray = new ArrayList<Student>();
		//�����ɼ���
		for(Student s:array){
			if(!newarray.contains(s))
			newarray.add(s);
			}
		
		

		// �����¼���
		for(Student ss:newarray){
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}
		//���ǵ���дequals()   ��equals()�Ƚ����ݶ����ǵ�ֵַ
	}
}