package homeWork;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //triAngle();
		diamond();
		
	}
	
	
	public static void triAngle() {
		int line=0;
		System.out.println("�����������������");
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		
		for(int i=0;i<line;i++)
		{
			
		for(int j=1;j<line-i;j++)
		{
			System.out.print(" ");
		}
		//��ӡ�ĸ��������������ͳ�ʼ�����Ĳ�
		
		for(int star=1;star<=2*i+1;star++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		}
	
		sc.close();
			
	}
	
	public static void diamond() {
		int line=0;
		System.out.println("�����뵽�������������������");
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		
		for(int i=0;i<line;i++)
		{
			
		for(int j=1;j<line-i;j++)
		{
			System.out.print(" ");
		}
		//��ӡ�ĸ��������������ͳ�ʼ�����Ĳ�
		
		for(int star=1;star<=2*i+1;star++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		}
	
		
		//�°벿��
		for(int i=1;i<=line-1;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print(" ");
			}
			
			for(int star=0;star<2*(line-1-i)+1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();
			
	}
	
	
	
	
	
	

}
