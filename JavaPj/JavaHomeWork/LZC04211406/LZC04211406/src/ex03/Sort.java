package ex03;

import java.util.Scanner;

public class Sort{


public static void main(String[] args) {
// TODO Auto-generated method stub
int[] arr=new int[8];
System.out.println("请输入长度");
Scanner r2=new Scanner(System.in); 
int len=r2.nextInt();
r2.close();


System.out.println("数组内容");
for(int i=0;i<len;i++)
{  
   Scanner reader=new Scanner(System.in); 
   arr[i]=reader.nextInt();
   
}


sortArray(arr,len);



for(int i=0;i<len;i++)
{
	System.out.print(arr[i]+" ");
}


	
}


public static void sortArray(int[] arr,int len) {
	


	for(int i=0;i<len-1;i++)
	{
		for(int j=0;j<len-1-i;j++)
		{
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	
}


}

	
	
	


