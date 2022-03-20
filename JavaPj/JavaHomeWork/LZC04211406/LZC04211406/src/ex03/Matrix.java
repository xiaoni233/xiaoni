package ex03;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Matr ma=new Matr(5);
     //ma.input();
     
	int arr0[][]=new int[5][5];
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			arr0[i][j]=i*j;
		}
	}
		
	ma.importA(arr0);
	ma.printer();
	}
	
	

}

class Matr{
	int[][] arr;
	int width;
	Matr(int n){
		
		this.width=n;
		arr=new int[width][width];
	}
	
	void printer() {
		for(int i=0;i<this.width;i++)
		{
			for(int j=0;j<this.width;j++)
			{
				System.out.println("第"+i+"行"+" 第"+j+"列："+arr[i][j]);
			}
		}
		
	}
	
	void importA(int arrI[][]) {
		this.arr=arrI;
	}
	
	void input() {
		for(int i=0;i<this.width;i++)
		{
			for(int j=0;j<this.width;j++)
			{
				System.out.println("请输入"+"第"+i+"行"+" 第"+j+"列：");
				Scanner reader=new Scanner(System.in);
				arr[i][j]=reader.nextInt();
				
			}
		}
		
	}
	
	
	
}
