package string;
/*
 * 遍历字符串（获取字符串中的每一个字符）
 */
public class StringTest2 {

	public static void main(String[] args) {
		//创建一个字符串对象
		String s = "abcde";
		
		//原始做法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("----------");
		
		//用for循环改进
		for(int i=0;i<5;i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("----------");
		
		//用length()方法获取字符串的长度
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}
