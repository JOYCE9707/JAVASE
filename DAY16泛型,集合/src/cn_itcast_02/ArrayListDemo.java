package cn_itcast_02;

import java.util.ArrayList;



/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �����󼯺�
		ArrayList<ArrayList<Student>> Bigarray = new ArrayList<ArrayList<Student>>();
		
		//������һ��С����
		ArrayList<Student> fristarray = new ArrayList<Student>();
		Student s1 = new Student("��ɮ", 30);
		Student s2 = new Student("�����", 29);
		Student s3 = new Student("��˽�", 28);
		Student s4 = new Student("ɳɮ", 27);
		fristarray.add(s1);
		fristarray.add(s2);
		fristarray.add(s3);
		fristarray.add(s4);
		//�����ڶ���С����
				ArrayList<Student> secondarray = new ArrayList<Student>();
				Student ss1 = new Student("�����", 30);
				Student ss2 = new Student("����", 29);
				Student ss3 = new Student("����", 28);
				Student ss4 = new Student("�ŷ�", 27);
				secondarray.add(ss1);
				secondarray.add(ss2);
				secondarray.add(ss3);
				secondarray.add(ss4);	
				//����������С����
				ArrayList<Student> thirdarray = new ArrayList<Student>();
				Student sss1 = new Student("������", 30);
				Student sss2 = new Student("������", 29);
				Student sss3 = new Student("�ֱ���", 28);
				Student sss4 = new Student("Ѧ����", 27);
				thirdarray.add(sss1);
				thirdarray.add(sss2);
				thirdarray.add(sss3);
				thirdarray.add(sss4);
		
				Bigarray.add(fristarray);
				Bigarray.add(secondarray);		
				Bigarray.add(thirdarray);		
				for(ArrayList<Student> a:Bigarray){
					for(Student aa:a){
						System.out.println(aa.getName()+"-------"+aa.getAge());
						
					}
				}
				
	
}
}
