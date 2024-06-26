package string;
/*
 * Object:是类层次结构中的根类，所有的类都直接或者间接的继承自该类。
 * 如果一个方法的形式参数是Object，那么这里我们就可以传递它的任意子类对象。
 * 
 * String类的判断功能:
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
 * boolean startsWith(String str):判断字符串对象是否以指定的str开头
 * boolean endsWith(String str):判断字符串对象是否以指定的str结尾
 */
public class StringDemo3 {

	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		//boolean equals(Object obj):比较字符串的内容是否相同
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("----------");
		
		//boolean equalsIngnoreCase(String str):比较字符串的内容是否相同，忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("---------");
		
		//boolean startsWith(String str):判断字符串对象是否以指定的str开头
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("ll"));
		System.out.println("---------");
		
		//boolean endsWith(String str):判断字符串对象是否以指定的str结束
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.endsWith("ll"));
		

	}

}
