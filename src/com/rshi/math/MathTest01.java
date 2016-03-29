package com.rshi.math;

/**
 * lang���µ�Math���һЩ����
 * 
 * lang��Ϊjava�����Ĭ�ϰ������赼��
 * 
 * @author dell
 * @version 1.0
 */
public class MathTest01 {
	public static void main(String[] args) {
		/* abs()�����ɷ���double float int long�⼸�����͵ľ���ֵ */
		double a = -3.9;
		System.out.println("������������ֵ�þ���ֵ" + Math.abs(a));

		/*
		 * һЩ���Ǻ����ķ�����
		 * 
		 * sin���ؽǵ���������
		 * asin�������ؽǵķ�����
		 * sinh����doubleֵ��˫��������
		 * cos(double a)���ؽǵ���������
		 * acos�������ؽǵķ����ң�
		 * cosh����doubleֵ��˫��������
		 *  
		 *  tan���ؽǵ�����
		 *  atan���ػ�ǵķ�����
		 *   atan2(double x,doubley)����������(x,y)ת���ɼ�����(r,theta)
		 *   tanh����doubleֵ��˫��������
		 */

		/* cbrt(double a)����doubleֵ�������� */
		double b = 8;
		System.out.println("����double���͵�������" + Math.cbrt(b));
		
		/* ceil(double a)����ֵ���ڻ���ڲ��������ҵ���ĳ������ */
		double c = -3.3;
		/*floor(double a)��ֵС�ڻ��ߵ��ڲ��������ҵ���ĳ������*/
		//double c1 = 3.8;		
		System.out.println("��ֵ���ڻ��ߵ��ڲ�����doubleֵ��" + Math.ceil(c));
		System.out.println("��ֵС�ڻ��ߵ��ڲ�����doubleֵ"+Math.floor(c));
		
		/*exp(double a)����ŷ����e��double����*/
		double d = 2;
		System.out.println("����ŷ����e��double����"+Math.exp(d));
		
		/*pow(double a,double b)���ص�һ�������ĵڶ����������ݵ�ֵ*/
		System.out.println("��һ�������ĵڶ����������ݵ�doubleֵ"+Math.pow(2,3));
		
		/*sqrt()������ȷ�����doubleֵ����ƽ��
		 	1.���������NaN����С�����򷵻�NaN
		 	2.����������������ô���Ҳ���������
		 	3.���������������߸��㣬��ô���ͬ����һ��*/
		System.out.println("����Ϊ����"+Math.sqrt(-4));
		//System.out.println("�����������"+Math.sqrt(Inf));
		
		/*round(float a)����round(double a)��������*/
		System.out.println("3.5��������֮���ֵ�ǣ�"+Math.round(3.5));
		System.out.println("3.4���������ֵ�ǣ�"+Math.round(3.4));
		
		/*���ز����ķ���signum*/
		System.out.println("2�ķ����ǣ�"+Math.signum(2));
		System.out.println("-2�ķ����ǣ�"+Math.signum(-2));
		System.out.println("+-0�ķ����ǣ�"+Math.signum(-0));
		
		/*random����һ��0.0��1.0��α�����*/
		System.out.println("random������α�������"+Math.random());
		
		
		
	}
}
