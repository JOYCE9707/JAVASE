package stringtihuan;

import java.util.Scanner;



/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:定义一个新字符串
 * 		C:倒着遍历字符串，得到每一个字符
 * 			a:length()和charAt()结合
 * 			b:把字符串转成字符数组
 * 		D:用新字符串把每一个字符拼接起来
 * 		E:输出新串
 */
public class StringTest2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入一个字符串：");
	String s =  sc.nextLine();
	    String js = myReverse(s);
	System.out.println("反转后的结果为:"+js);
}


public static String myReverse(String s){
	String ss = "";
	char[] chs =s.toCharArray();//转换为字符数组
	for(int x =chs.length-1;x>=0;x--){//反转过来
		ss+=chs[x];//接起来
		}
	return ss;
	
	
}






}
