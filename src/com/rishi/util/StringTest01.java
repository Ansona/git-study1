package com.rishi.util;
/**
 * 1.�ַ���һ���������Ͳ��ɸ���
 * 2����java������ʹ��˫�������������ַ����������ַ��������ڡ��ַ��������ء��д���һ����
 * ��������
 * @author dell
 *@version 1.0
 */
public class StringTest01 {
	public static void main(String[] args){
		//����һ���ַ�������������������������class�ļ��ĳ������У�Ϊ�ľ���ʵ�ָ���
		//��str1������Ÿö�����ڴ��ַ
		String str1 = "Hello";
		String s1 = "Hello";
		System.out.println(str1 == s1);//true,,����ֵ��ȣ�������ջ�з�����ͬ�ĵ�ַ
		
		//����������һ��"Hello"���󣬲��һ��ڶ��д���һ���ַ�������;
		//�˷����Ƚ�ռ�ڴ�
		/*�������̣�1.�������Hello�ȵ�Sring�������п���û�У�û���򴴽�
		 *       2.ͨ��new�ִ���һ��hello���󣬴���ڶ��С�str2ָ����е�Hello
		 * */
		String str2 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(str2 == s2);//false
		
		//�ַ�����ƴ��
		String str3 = "Hel"+"lo";
		
		String str4 = "Hel";
		String str5 = "lo";
		String str6 = str4 + str5;
		
		System.out.println(str1 == str2);//���Ϊfalse
		//   "=="�鿴�ַ�����ַ�Ƿ���ͬ���Ƚ��ַ����Ƿ������equeal����
		System.out.println(str1 == str3);//���Ϊtrue
		
		
		/*����ֵ��Ȼ��ȣ�����ƴ�ӳɵ�Hello����ڶ��еĵ�ַ�ǲ�ȷ���ģ�����str1��str6�϶��ǲ�һ���ġ�*/
		System.out.println(str1 == str6);//false
		
		/*intern�����᳢�Խ�Hello�ַ�����ӵ��������У����ҷ������ڳ������еĵ�ַ��look this����Ϊ���������Ѿ���Hello�ַ���������internֱ�ӷ��ص�ַ
		 * ����str1��str7ָ��ͬһ����ַ*/
		
		String str7 = str2.intern();
		System.out.println(str1 == str7);//true
	}
}
