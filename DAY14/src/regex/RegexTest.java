package regex;

import java.util.Scanner;

//�жϹ���
public class RegexTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�����������:");
	String ss = sc.nextLine();
	String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
	boolean flag = ss.matches(regex);
	System.out.println("flag:"+flag);
}
}
