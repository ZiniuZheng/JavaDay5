package string;

public class StringDemo2 {
/*
 * 通过构造方法创建的字符串对象和直接赋值方式创建的字符串对象有什么区别呢？
 * 		通过构造方法创建字符串对象是在堆内存。
 * 		直接赋值方式创建对象是在方法区的常量池。
 * 
 * ==：
 * 		基本数据类型：比较的是基本数据类型的值是否相同
 * 		引用数据类型：比较的是引用数据类型的地址值是否相同
 */
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		System.out.println("s1==s2: "+(s1==s2)); //false：s1在堆内存，s2在方法区的常量池
		
		String s3 = "hello";
		System.out.println("s1==s3: "+(s1==s3)); //false：s1在堆内存，s3在方法区的常量池
		System.out.println("s2==s3: "+(s2==s3)); //true：s2和s3的地址相同
		System.out.println("s1和s2的值相等："+s1.equals(s2)); //比较s1和s2的值是否相同

	}

}
