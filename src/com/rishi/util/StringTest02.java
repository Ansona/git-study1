package com.rishi.util;
/**
 * String������ʹ��
 * @author rishi
 *@version 1.0
 */
import java.util.Arrays;
public class StringTest02 {
	public static void main(String[] args){
		String s = "HelloWorld";
		//�ַ����Ľ�ȡ,���ذ���ѡ��ʼ�±�����������
		/*��ȡ��Χ��0-10����Ȼ10�󲻷����κ�ֵ,�Ĳ���Ϊ11�ͻᱨ��Խ��*/
		String subStr = s.substring(1);
		System.out.println(subStr);//������elloWord
		//System.out.println(s);
		/*indexOf(String str)���ص�һ�γ��ִ��ַ�����һ�γ��ֵ�����*/
		System.out.println(s.indexOf("o"));
		
		/*indexOf(String str,int fromIndex)��ָ������������ʼ��
		 * ���ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ���������*/
		System.out.println(s.indexOf("o",4));
		System.out.println(s.indexOf("o",5));
		
		/*lastIndexOf(String str)���ش��ַ��������һ�γ��ֵ�ָ���ַ���������*/
		System.out.println(s.lastIndexOf("l"));
		/*lastIndexOf(String str,int fromIndex)��ָ��λ��������ʼ
		 * �����ڴ��ַ��������һ�γ���ָ���ַ���������*/
		
		
		/*split()��ȡ�ַ���,���ҷֿ���ʽ���������ģ�����������ʽʽ������   */
		System.out.println(Arrays.toString(s.split("W")));//��ʾ���Ϊ[Hello,orld]
	}
}
