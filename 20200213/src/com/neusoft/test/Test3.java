package com.neusoft.test;

public class Test3 {

	/**
	 * ����:ʵ��һ�κ����ļ��� y=f(x)=3x+6 
	 */

	/**
	 * int age
	 * String name
	 * char sex
	 * 
	 * ���η� ����ֵ���� ������(�����б�){
	 * 	  ������
	 * }
	 */
	//This method must return a result of type int
	public static int f(int num) {
		return 3*num+6;
	}
	
	 public static void outputchar(int x) {
		System.out.println((char)x);
	 }
	
	 public static int i(char x) {
	    return (int)x;
	 }
	
	// ���
	public static void main(String[] args) {
//		int a = 1;
//		int b = 1;
//		b = a++;
//		System.out.println("a"+a+",b"+b);
		
//		int c = 1;
//      c = c++;  
//      System.out.print(c);
        
		//������ϰ��
//		int a = 1;
		     
		     
//		a = ++a;
//		a = a++;
//		     a=2
//		    a++ 2 a=3   ++a 4 a=4	 
//		a = a++ + ++a;
//		                   a=5    6     7
//		                    6     6     6   7
//		System.out.println(a-- + ++a + a++ +a); 25
//		System.out.println(a); 7
		                   
//		2.��ֱ�����x,y��ֵ?
//		��int x = 3;
//		           x=4   5
//		           3     5     50
//		��int y = x++ + ++x + x * 10;
//		  System.out.print(x); 58
//		  System.out.print(y); 5
		int x = 3;
		int y = x++ + ++x + x * 10;
		System.out.print("x"+x);
		System.out.print(y);
	}
}