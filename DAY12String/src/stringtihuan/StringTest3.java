package stringtihuan;



/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 * 
 * ������
 * 		ǰ�᣺���Ѿ�֪���˴󴮺�С����
 * 
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class StringTest3 {
public static void main(String[] args) {
	String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
	// ����С��
	String minString = "java";
	int c = getcount(maxString,minString);
	System.out.println("������"+c+"��");
	
	
	}
/*
 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
 */
public static int getcount(String maxString,String minString){
	// ����һ��ͳ�Ʊ�������ʼ��ֵ��0
	int count = 0;
	// ���ڴ��в���һ��С����һ�γ��ֵ�λ��
//	int s = maxString.indexOf(minString);
//	// ��������-1��˵�����ڣ�ͳ�Ʊ���++
//	while( s!=-1){
//		count++;
//	// �Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
//	int startIndex=	s + minString.length();
//	//����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
//	maxString=maxString.substring(startIndex);
//	// ������
//	s=maxString.indexOf(minString); 
//	
//	}return count;
	int s;
	while((s=maxString.indexOf(minString))!=-1){
		count++;
		maxString=maxString.substring(s + minString.length());
	}return count;
}
}
