package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�ַ�����������
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class CollectionTest{
	public static void main(String[] args) {
		Collection cc = new ArrayList();
		
		
		cc.add("���ǳ�");
		cc.add("�ܽ���");
		cc.add("������");
		cc.add("�ֿ���");
		cc.add("�Ž�");
		//D:��������
		Iterator it = cc.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
			
			
		}
	}
}