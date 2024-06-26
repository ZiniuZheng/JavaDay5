package string;

import java.util.Scanner;
/*
 * 模拟登录，给三次机会，并提示还有几次。
 * 
 * 分析：
 * 		A：定义两个字符串对象，用于存储已经存在的用户名和密码
 * 		B：键盘录入用户名和密码
 * 		C：拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
 * 			如果内容相同，提示登录成功
 * 			如果内容不同，提示登录失败，并提示还有几次机会
 */
public class StringTest {

	public static void main(String[] args) {
		//定义两个字符串对象，用于存储已经存在的用户名和密码
		String username = "admin";
		String password = "admin";
		
		//给三次机会，用for循环实现
		for(int i=0;i<3;i++) {
			//键盘录入用户名和密码
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			
			//拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
			if(username.equals(name)&&password.equals(pwd)) {
				System.out.println("登录成功");
				break;
			}else if((2-i)==0) {
				System.out.println("用户名和密码被锁定，请与管理员联系");
			}else {
				System.out.println("登录失败，你还有"+(2-i)+"次机会");
			}
		}

	}

}
