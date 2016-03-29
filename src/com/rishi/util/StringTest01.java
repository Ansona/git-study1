package com.rishi.util;
/**
 * 1.字符串一旦被创建就不可更改
 * 2。在java中所有使用双引号括起来的字符串都会在字符串都会在”字符串常量池“中创建一份在
 * 方法区中
 * @author dell
 *@version 1.0
 */
public class StringTest01 {
	public static void main(String[] args){
		//创建一个字符串常量，这种字面量会存放在class文件的常量池中，为的就是实现复用
		//而str1变量存放该对象的内存地址
		String str1 = "Hello";
		String s1 = "Hello";
		System.out.println(str1 == s1);//true,,字面值相等，而后在栈中分配相同的地址
		
		//不但创建了一个"Hello"对象，并且会在堆中创建一个字符串对象;
		//此方法比较占内存
		/*创建流程：1.括号里的Hello先到Sring常量池中看有没有，没有则创建
		 *       2.通过new又创建一个hello对象，存放在堆中。str2指向堆中的Hello
		 * */
		String str2 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(str2 == s2);//false
		
		//字符串的拼接
		String str3 = "Hel"+"lo";
		
		String str4 = "Hel";
		String str5 = "lo";
		String str6 = str4 + str5;
		
		System.out.println(str1 == str2);//结果为false
		//   "=="查看字符串地址是否相同，比较字符串是否相等用equeal方法
		System.out.println(str1 == str3);//结果为true
		
		
		/*字面值虽然相等，但是拼接成的Hello存放在堆中的地址是不确定的，所以str1和str6肯定是不一样的。*/
		System.out.println(str1 == str6);//false
		
		/*intern方法会尝试将Hello字符串添加到常量池中，并且返回其在常量池中的地址。look this，因为常量池中已经有Hello字符串，所以intern直接返回地址
		 * 所以str1和str7指向同一个地址*/
		
		String str7 = str2.intern();
		System.out.println(str1 == str7);//true
	}
}
