package homeWork;

import java.util.Scanner;

public class OddOrDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int n=0;	
	  System.out.println("�������鳤��");
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

	int[] arr;//ԭʼ���飬�������
	int[] arrO;//��������
	int[] arrD;
	
	ODnumber(int length){
		arr=new int[length];
	}
	
	
	//1.����
	void input() {
		System.out.println("�������ݵ�����");
		for(int i=0;i<arr.length;i++)
		{
			Scanner reader=new Scanner(System.in);
			int num=reader.nextInt();
			arr[i]=num;
		}
		
	}
	
	//2.����
	void sort() {
		//����
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
		//���ݼ�������ʼ����������
		arrO=new int[counterO];
		arrD=new int[counterD];
		
		//�ֱ�����������
		
		int arrDCT=0;//����ѭ��
		int arrOCT=0;
		for(int i=0;i<arr.length;i++)
		{   
			//�ж�ԭ������
			if(arr[i]%2==0)
			{
				arrD[arrDCT]=arr[i];//�ӵ�ż����
				arrDCT++;
			}
			else{
				arrO[arrOCT]=arr[i];//�ӵ�������
				arrOCT++;
			}
		}
			
		
	 }
	
	//3.���
	void output() {
				
			if(arrD.length>arrO.length){//���ż�������϶�
				for(int i=0;i<=arrO.length-1;i++){
					System.out.print(arrO[i]+" "+arrD[i]+" ");
				}//�Ȱ��������ĸ����������
				for(int i=arrO.length;i<=arrD.length-1;i++){
					System.out.print(arrD[i]+" ");
				}//���ʣ�µ�ż��
			}else{
				for(int i=0;i<=arrD.length-1;i++){
					System.out.print(arrO[i]+" "+arrD[i]+" ");
				}//�Ȱ���ż���ĸ����������
				for(int i=arrD.length;i<=arrO.length-1;i++){
					System.out.print(arrO[i]+" ");
				}//���ʣ�µ�����
			}

	}
	
	//����
	void tranForm() {
		String []num=new String[arr.length];
		//�ַ������鸳ֵ
		for(int i=0;i<arr.length;i++)
		{
			num[i]=String.valueOf(arr[i]);
		}
		if(num.length%2==0) {
			System.out.println("�ַ�������Ϊż��");
		}
		else {
			System.out.println("�ַ�������Ϊ����");
		}
		
	}
	

	
	
}
