package ex02;

import java.util.Scanner;
public class GradeIdentify {
public static void main(String[] args) {
System.out.println("请输入成绩(1-100)");
Scanner sc = new Scanner(System.in);
int score = sc.nextInt();
if (score < 0 || score > 100) {
System.out.println("对不起，你输入有误");
return;
}
System.out.println("你获得了："+getGrade(score));
sc.close();
}


public static String getGrade(int i) {
String ret = null;
switch (i / 10) {
case 10:
ret = "A";
break;
case 9:
ret = "A";
break;
case 8:
ret = "B";
break;
case 7:
ret = "C";
break;
case 6:
ret = "D";
break;
default:
ret = "E";
break;
}
return ret;
}
}
