package com.neusoft.test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

	
	public static int getLastNumber() {
		//��֤�����빲 13 λ��������һ����Ʒ���룬ǰ 12 λ��692116851128���о���������壬�� 13 λ��ͨ�����²���������ģ�
		 //�� 1 ����ȡ������������λ�ͣ�c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20
		 //�� 2 ����ȡ��������ż��λ�ͣ�c2 = 9 + 1 + 6 + 5 + 1 + 8 = 30
		 //�� 3 ������"������"��"ż���͵�����"��ӣ�cc = c1+c2*3 = 20 + 30 * 3 = 110
		 //�� 4 ����ȡ����ĸ�λ������ 10 ȡ�ࣩ��110 �ĸ�λ��Ϊ��110%10=0��
		 //�� 5 ������ 10 ��ȥ�����λ����10 - 0 = 10
		 //�� 6 �����Եõ�������ȡ��λ������ 10 ȡ�ࣩ��10%10=0
		 //����У����Ϊ 0
        String str = "692116851128";
        int jiShu = 0;
        int ouShu = 0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				// ȡ����λ
				jiShu += Integer.parseInt(str.charAt(i)+"");
			}else {
				// ż��λ
				ouShu += Integer.parseInt(str.charAt(i)+"");
			}
		}
		 //�� 3 ������"������"��"ż���͵�����"��ӣ�cc = c1+c2*3 = 20 + 30 * 3 = 110
		int result3 = jiShu+ouShu*3;
		//�� 4 ����ȡ����ĸ�λ������ 10 ȡ�ࣩ��110 �ĸ�λ��Ϊ��110%10=0��
		int result4 = result3%10;
		//�� 5 ������ 10 ��ȥ�����λ����10 - 0 = 10
		int result5 = 10 - result4;
		 //�� 6 �����Եõ�������ȡ��λ������ 10 ȡ�ࣩ��10%10=0
		int result6 = result5 % 10;
		return result6;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(getLastNumber());
		// java.util.Scanner
//        Scanner sc = new Scanner(System.in);
//        // �����
//        Random random = new Random();
//        // java.lang.*
//        System.out.println("����ɼ�: ");
//        int n = sc.nextInt();
//        if (n < 60) {
//            System.out.println("������");
//        } else if (60 <= n && n <= 79) {
//            System.out.println("һ��");
//        } else if (80 <= n && n <= 89) {
//            System.out.println("����");
//        } else if (90 <= n && n < 100) {
//            System.out.println("����");
//        } else if (n == 100) {
//            System.out.println("����");
//        }
        
//        Scanner nums = new Scanner(System.in);
//        while(true) {
//        	System.out.println("������һ����:");
//        	int nextInt = nums.nextInt();
//        	if(-1 == nextInt){
//        		break;
//        	}
//        }
        
        //��������֮�����
//        int x1,x2,y1,y2;
//		Scanner in = new Scanner(System.in);
//		System.out.println("������p1��xֵ");
//		x1=in.nextInt();
//		System.out.println("������p1��yֵ");
//		y1=in.nextInt();
//		System.out.println("������p2��xֵ");
//		x2=in.nextInt();
//		System.out.println("������p2��yֵ");
//		y2=in.nextInt();
//		double dis;
//		dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//		System.out.println("����ľ���Ϊ��"+dis);
        
        // ��������ȼ�
		//int i = 1;
		//boolean b = 3+4>4||5!=6 &&7>8+ ++i
//		               7               10
//		  boolean b = 3+4>4||5!=6 &&7>8+2  
//		              true     true      false
//		  boolean b = 7>4 || 5!=6 && 7>10
//		  boolean b = true || false
		//a.�﷨���� b.true c ������� d.���д��� e.false
        
//        int a;
        //System.out.println(a);    //����֮�� ������ eclipse �Ѿ��ѵ�ǰ�ļ�������(�൱��ִ����javac����)
         // ������� ������֮ǰ�Ѿ���������
		 
    }
}