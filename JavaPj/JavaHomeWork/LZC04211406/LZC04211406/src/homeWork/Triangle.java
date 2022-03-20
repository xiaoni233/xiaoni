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
		System.out.println("请输入的行数，整数");
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		
		for(int i=0;i<line;i++)
		{
			
		for(int j=1;j<line-i;j++)
		{
			System.out.print(" ");
		}
		//打印的个数是限制条件和初始条件的差
		
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
		System.out.println("请输入到最大列数的行数，整数");
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		
		for(int i=0;i<line;i++)
		{
			
		for(int j=1;j<line-i;j++)
		{
			System.out.print(" ");
		}
		//打印的个数是限制条件和初始条件的差
		
		for(int star=1;star<=2*i+1;star++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		}
	
		
		//下半部分
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
