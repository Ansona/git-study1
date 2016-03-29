package com.rshi.math;

/**
 * lang包下的Math类的一些方法
 * 
 * lang包为java虚拟机默认包，无需导入
 * 
 * @author dell
 * @version 1.0
 */
public class MathTest01 {
	public static void main(String[] args) {
		/* abs()方法可返回double float int long这几种类型的绝对值 */
		double a = -3.9;
		System.out.println("返回四种类型值得绝对值" + Math.abs(a));

		/*
		 * 一些三角函数的方法：
		 * 
		 * sin返回角的三角正弦
		 * asin方法返回角的反正弦
		 * sinh返回double值得双曲线正弦
		 * cos(double a)返回角的三角余弦
		 * acos方法返回角的反余弦，
		 * cosh返回double值的双曲线余弦
		 *  
		 *  tan返回角的正切
		 *  atan返回会角的反正切
		 *   atan2(double x,doubley)将矩形坐标(x,y)转化成极坐标(r,theta)
		 *   tanh返回double值得双曲线正切
		 */

		/* cbrt(double a)返回double值得立方根 */
		double b = 8;
		System.out.println("返回double类型的立方根" + Math.cbrt(b));
		
		/* ceil(double a)，该值大于或等于参数，并且等于某个整数 */
		double c = -3.3;
		/*floor(double a)该值小于或者等于参数，并且等于某个整数*/
		//double c1 = 3.8;		
		System.out.println("该值大于或者等于参数的double值：" + Math.ceil(c));
		System.out.println("该值小于或者等于参数的double值"+Math.floor(c));
		
		/*exp(double a)返回欧拉数e的double次幂*/
		double d = 2;
		System.out.println("返回欧拉数e的double次幂"+Math.exp(d));
		
		/*pow(double a,double b)返回第一个参数的第二个参数次幂的值*/
		System.out.println("第一个参数的第二个参数次幂的double值"+Math.pow(2,3));
		
		/*sqrt()返回正确舍入的double值的正平方
		 	1.如果参数是NaN或者小于零则返回NaN
		 	2.如果参数正无穷大，那么结果也是正无穷大
		 	3.如果参数是正零或者负零，那么结果同参数一样*/
		System.out.println("参数为负："+Math.sqrt(-4));
		//System.out.println("参数正无穷打"+Math.sqrt(Inf));
		
		/*round(float a)或者round(double a)四舍五入*/
		System.out.println("3.5四舍五入之后的值是："+Math.round(3.5));
		System.out.println("3.4四舍五入的值是："+Math.round(3.4));
		
		/*返回参数的符号signum*/
		System.out.println("2的符号是："+Math.signum(2));
		System.out.println("-2的符号是："+Math.signum(-2));
		System.out.println("+-0的符号是："+Math.signum(-0));
		
		/*random产生一个0.0到1.0的伪随机数*/
		System.out.println("random产生的伪随机数："+Math.random());
		
		
		
	}
}
