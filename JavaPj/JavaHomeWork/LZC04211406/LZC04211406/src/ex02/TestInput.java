package ex02;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**

* @version 2.0

* @��ʾ������������ַ�ʽ

* @since 2014.9

* @author Guoxiaoyan

*/

public class TestInput {

/**

* ����һ��

* ���ñ�׼�������ķ�����ȡ�Ӽ�����������ַ�����

* jdk1.4֮ǰ�ķ������ӿ���̨����һ���ַ�����Ȼ�����ӡ������

* ��Ҫ�õ�BufferedReader���InputStreamReader��

* ����ͬѧҪ�����˲���ҪԤϰ��7���ļ�����������

* @return ���ؼ���������ַ���

*/

public static String InputOne(){

String str = null;

try{

//System.in�Ǳ�׼�����������ֽ�����

//InputStreamReader�ǽ��ֽ���ת��Ϊ�ַ�����

//BufferedReader�Ǵ������������

System.out.println("ʹ�������������Ӽ��������������:");

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

str = br.readLine();//str��ȡ���Ӽ�����������ݣ����س���������

}//��33�д�����׳�һ��IO�쳣������Ҫ���в�׽��

catch(IOException e){

System.err.print(e);

}

return str;

}

/**

* ���Ƽ��ķ�������Scanner�࣬�Ƚ�����

* ����Scanner��Ľ�������û���������

* �����аٶȻ�鿴jdk�����ĵ�

* @return ���ؼ���������ַ���

*/

public static String InputTwo(){

Scanner in=null;

System.out.println("ʹ��Scanner�����Ӽ��������������:");

in=new Scanner(System.in);

//��ȡ���������һ�У��Իس�����Ϊ�������룩

String readLine = in.nextLine();

in.close();

return readLine;

}

/**

* ��ͼ�λ�����ķ�ʽ

* �����ַ�ʽ���ܺ���������һ����֣�

* ����Ե������������е��÷����� *

* @return ���ؼ���������ַ���

*

*/

public static String InputThree(){

String a=JOptionPane.showInputDialog("�����룺");

System.out.println("your value is :"+a);

return a;

}

public static void main(String[] args) {

String input1,input2,input3;

/*input1=TestInput.InputOne();//���õ�һ�ַ�����

input2=TestInput.InputTwo();//���õڶ��ַ���

System.out.println("ʹ����������������������� :"+input1);

System.out.println("ʹ��scanner����������ַ�����"+input2);*/
input3=TestInput.InputThree();

/**

input3=TestInput.InputThree();//���õ����ַ���

System.out.println("ʹ��scanner����������ַ�����"+input3);

*/

}

}