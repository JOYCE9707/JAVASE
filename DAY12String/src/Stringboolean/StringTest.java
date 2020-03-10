package Stringboolean;

import java.util.Scanner;

/*模拟登录 给三次机会，提示有几次机会
 *    
 *    
 *    1，定义用户名和密码
 *    2，键盘录入用户名和密码
 *    3，比较用户名和密码
 *    4，给三次机会，用FOR
 * 
 * 
 */
public class StringTest {
public static void main(String[] args) {
	//定义用户名和密码
	String username = "admin";
	String password = "admin";
	for(int x = 0; x<3;x++){
	//键盘录入用户名和密码
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入用户名:");
	String name = sc.nextLine();
	System.out.println("请输入密码:");
	String pwd = sc.nextLine();
	if (name.equals(username)&&pwd.equals(password))
	{
		System.out.println("登录成功");
		GuessNumberGame.start();
	    break;
	}
	else{
		if((2-x)==0){
			System.out.println("次数用完，账号被锁定");
			}
		else{
			System.out.println("登录失败,你还有"+(2-x)+"次机会");
		    }
	     }
			
			
			
		}
	}
}


