package homeWork;

import java.util.Scanner;

public class OddOrDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int n=0;	
	  System.out.println("输入数组长度");
	  Scanner reader=new Scanner(System.in);
	   n =reader.nextInt();
	  ODnumber od= new ODnumber(n);
      od.input();
      od.sort();
      od.output();
	  od.tranForm();	
		
		
	}

}


class ODnumber{

	int[] arr;//原始数组，存放输入
	int[] arrO;//奇数数组
	int[] arrD;
	
	ODnumber(int length){
		arr=new int[length];
	}
	
	
	//1.输入
	void input() {
		System.out.println("输入数据到数组");
		for(int i=0;i<arr.length;i++)
		{
			Scanner reader=new Scanner(System.in);
			int num=reader.nextInt();
			arr[i]=num;
		}
		
	}
	
	//2.分类
	void sort() {
		//计数
		int counterO=0;
		int counterD=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				 counterD++;
			}
			else{
				counterO++;
			}
		
		}
		//根据计数，初始化数组数量
		arrO=new int[counterO];
		arrD=new int[counterD];
		
		//分别存进两个数组
		
		int arrDCT=0;//用于循环
		int arrOCT=0;
		for(int i=0;i<arr.length;i++)
		{   
			//判断原来数组
			if(arr[i]%2==0)
			{
				arrD[arrDCT]=arr[i];//加到偶数组
				arrDCT++;
			}
			else{
				arrO[arrOCT]=arr[i];//加到奇数组
				arrOCT++;
			}
		}
			
		
	 }
	
	//3.输出
	void output() {
				
			if(arrD.length>arrO.length){//如果偶数个数较多
				for(int i=0;i<=arrO.length-1;i++){
					System.out.print(arrO[i]+" "+arrD[i]+" ");
				}//先按照奇数的个数交替输出
				for(int i=arrO.length;i<=arrD.length-1;i++){
					System.out.print(arrD[i]+" ");
				}//输出剩下的偶数
			}else{
				for(int i=0;i<=arrD.length-1;i++){
					System.out.print(arrO[i]+" "+arrD[i]+" ");
				}//先按照偶数的个数交替输出
				for(int i=arrD.length;i<=arrO.length-1;i++){
					System.out.print(arrO[i]+" ");
				}//输出剩下的奇数
			}

	}
	
	//二。
	void tranForm() {
		String []num=new String[arr.length];
		//字符串数组赋值
		for(int i=0;i<arr.length;i++)
		{
			num[i]=String.valueOf(arr[i]);
		}
		if(num.length%2==0) {
			System.out.println("字符串长度为偶数");
		}
		else {
			System.out.println("字符串长度为奇数");
		}
		
	}
	

	
	
}
