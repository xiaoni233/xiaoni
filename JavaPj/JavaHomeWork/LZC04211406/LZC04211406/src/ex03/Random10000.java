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

//注意类放在主类外
 class RandomNumber1_20{
	
	
	//1.弄一个存统计0-20的统计数子数组
	//2.生成10000个随机数，并把它放到一个数组
	//3.进行统计（10000个随机数里比较然后赋值给arrC
	//4.打印结果
	
	//1.
	int arrC[];//统计数组
	//2.
	int arrR[];
	
	//1.初始化
	RandomNumber1_20() {
		this.arrC=new int[21];
	}
	
	//2.
	//生成10000随机数,并存储
	void genRanN() {
		arrR=new int[10000];
		for(int i=0;i<10000;i++)
		{ 
			arrR[i]=(int)(Math.random()*20+0.5);				
		}
		
	}
	
	//3.计数器
	void counter() {
		//赋初始值
		for(int i=0;i<arrC.length;i++)
		{
			arrC[i]=0;
		}
		
		
		//进行统计
		for(int i=0;i<this.arrR.length;i++)
		{ 
			//arrR【0】时
			
			//arrC[0-21]循环判断
			
			for(int j=0;j<arrC.length;j++)
			{
				//当前arr【i】与j比较，然后计数arrC【j】++
				//为什么要arrC。length？，它只是j的上线，使j成为 0-arrC。length与当前arrC【i】
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
		System.out.println("随机数组中"+i+"数字有"+arrC[i]+"个");
	}
	
	
	
}
