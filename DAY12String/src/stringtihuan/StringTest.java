package stringtihuan;
/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 * 
 * �Ѵ����ù���ʵ�֡�
 */
public class StringTest {
public static void main(String[] args) {
	int[] arr = {1,2,3};
	String h = arrayToString(arr);
	System.out.println("���ս���ǣ�" + h);
}
public static String arrayToString(int[] arr){
	String s = "";
	s+="[";
	for(int x=0;x<arr.length;x++)
	{ if(x==arr.length-1){
		s+=arr[x];
		s+="]";
	}else{
		s+=arr[x];
		s+=",";
	}
		
	}
	
return s;	
}


}
