package ex02;

import java.util.Scanner;

public class EvenNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 System.out.println("«Î ‰»În");
	      int n=input.nextInt();
	      for(int i=0;i<=n;i++)
	      {
	    	  if(i%2==0)
	    		  System.out.println(i);
	      }
		
		input.close();
		
		
	}

}
