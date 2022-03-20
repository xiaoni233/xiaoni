package ex02;

import java.util.Scanner;

public class IntegerCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    
		System.out.println("输入两个数");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    Scanner sc2 = new Scanner(System.in);
    int num2= sc2.nextInt();
    System.out.println("输入运算符+-*/");
    Scanner sc3=  new Scanner(System.in);
    String op=sc3.next();
    switch(op) {
    case "+":
    	System.out.println(num1+num2);
    	break;
    case "-":
    	System.out.println(num1-num2);	
    	break;
    case "*":
    	System.out.println(num1*num2);	
    	break;
    	
    case "/":
    	System.out.println(num1/num2);	
    	break;
    default:
    	System.out.println("error");	
    	break;
    	
    }
    sc.close();
    sc2.close();
    sc3.close();
    
    
	}

}
