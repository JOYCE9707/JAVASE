package Stringboolean;

import java.util.Scanner;

/*ģ���¼ �����λ��ᣬ��ʾ�м��λ���
 *    
 *    
 *    1�������û���������
 *    2������¼���û���������
 *    3���Ƚ��û���������
 *    4�������λ��ᣬ��FOR
 * 
 * 
 */
public class StringTest {
public static void main(String[] args) {
	//�����û���������
	String username = "admin";
	String password = "admin";
	for(int x = 0; x<3;x++){
	//����¼���û���������
	Scanner sc = new Scanner(System.in);
	System.out.println("�������û���:");
	String name = sc.nextLine();
	System.out.println("����������:");
	String pwd = sc.nextLine();
	if (name.equals(username)&&pwd.equals(password))
	{
		System.out.println("��¼�ɹ�");
		GuessNumberGame.start();
	    break;
	}
	else{
		if((2-x)==0){
			System.out.println("�������꣬�˺ű�����");
			}
		else{
			System.out.println("��¼ʧ��,�㻹��"+(2-x)+"�λ���");
		    }
	     }
			
			
			
		}
	}
}


