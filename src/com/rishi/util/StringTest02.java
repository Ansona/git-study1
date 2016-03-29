package com.rishi.util;
/**
 * String方法的使用
 * @author rishi
 *@version 1.0
 */
import java.util.Arrays;
public class StringTest02 {
	public static void main(String[] args){
		String s = "HelloWorld";
		//字符串的截取,返回包括选择开始下标的往后的数组
		/*截取范围是0-10，当然10后不返回任何值,改参数为11就会报错越界*/
		String subStr = s.substring(1);
		System.out.println(subStr);//输出结果elloWord
		//System.out.println(s);
		/*indexOf(String str)返回第一次出现此字符串第一次出现的索引*/
		System.out.println(s.indexOf("o"));
		
		/*indexOf(String str,int fromIndex)从指定的索引处开始，
		 * 返回第一次出现的指定子字符串在此字符串的索引*/
		System.out.println(s.indexOf("o",4));
		System.out.println(s.indexOf("o",5));
		
		/*lastIndexOf(String str)返回此字符串中最后一次出现的指定字符串的索引*/
		System.out.println(s.lastIndexOf("l"));
		/*lastIndexOf(String str,int fromIndex)从指定位置索引开始
		 * 返回在此字符串中最后一次出现指定字符串的索引*/
		
		
		/*split()截取字符串,并且分开形式是在这样的，还有正则表达式式的样子   */
		System.out.println(Arrays.toString(s.split("W")));//显示结果为[Hello,orld]
	}
}
