package stringtihuan;

import java.util.Scanner;



/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:����һ�����ַ���
 * 		C:���ű����ַ������õ�ÿһ���ַ�
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
 */
public class StringTest2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("����һ���ַ�����");
	String s =  sc.nextLine();
	    String js = myReverse(s);
	System.out.println("��ת��Ľ��Ϊ:"+js);
}


public static String myReverse(String s){
	String ss = "";
	char[] chs =s.toCharArray();//ת��Ϊ�ַ�����
	for(int x =chs.length-1;x>=0;x--){//��ת����
		ss+=chs[x];//������
		}
	return ss;
	
	
}






}
