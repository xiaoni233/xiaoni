package ex03;

public class Random10000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RandomNumber1_20 ran =new RandomNumber1_20() ;
       ran.genRanN();
       ran.counter();
       ran.print();
		
	}
	

}

//ע�������������
 class RandomNumber1_20{
	
	
	//1.Ūһ����ͳ��0-20��ͳ����������
	//2.����10000����������������ŵ�һ������
	//3.����ͳ�ƣ�10000���������Ƚ�Ȼ��ֵ��arrC
	//4.��ӡ���
	
	//1.
	int arrC[];//ͳ������
	//2.
	int arrR[];
	
	//1.��ʼ��
	RandomNumber1_20() {
		this.arrC=new int[21];
	}
	
	//2.
	//����10000�����,���洢
	void genRanN() {
		arrR=new int[10000];
		for(int i=0;i<10000;i++)
		{ 
			arrR[i]=(int)(Math.random()*20+0.5);				
		}
		
	}
	
	//3.������
	void counter() {
		//����ʼֵ
		for(int i=0;i<arrC.length;i++)
		{
			arrC[i]=0;
		}
		
		
		//����ͳ��
		for(int i=0;i<this.arrR.length;i++)
		{ 
			//arrR��0��ʱ
			
			//arrC[0-21]ѭ���ж�
			
			for(int j=0;j<arrC.length;j++)
			{
				//��ǰarr��i����j�Ƚϣ�Ȼ�����arrC��j��++
				//ΪʲôҪarrC��length������ֻ��j�����ߣ�ʹj��Ϊ 0-arrC��length�뵱ǰarrC��i��
			if(this.arrR[i]==j)
			{
				arrC[j]++;
			}
			
			}
			
		}
			
	}
	
	
	
	//4.
	void print() {
		
		for(int i=0;i<arrC.length;i++)
		System.out.println("���������"+i+"������"+arrC[i]+"��");
	}
	
	
	
}
