package arraylistquchong;

import java.util.ArrayList;


/*
 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * 
 * ������
 * 		A:�������϶���
 * 		B:��Ӷ���ַ���Ԫ��(����������ͬ��)
 * 		C:�����¼���
 * 		D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
 * 			�У���������
 * 			û�У�����ӵ��¼���
 * 		F:�����¼���
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<String> array = new ArrayList<String>();

		// ��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		//�����¼���
		ArrayList<String> newarray = new ArrayList<String>();
		/*�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
		 * 			�У���������
		 * 			û�У�����ӵ��¼���
		 * */
		for(String s :array){
			if (!newarray.contains(s)) {
				newarray.add(s);
			}
		}
		//�����¼���
		for(String ss:newarray){
			System.out.println(ss);
		}
		

	}
}
