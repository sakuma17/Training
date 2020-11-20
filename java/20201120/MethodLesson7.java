import java.util.*;
public class MethodLesson7{
	public static void main(String[] args){
		System.out.print("数字を入力>");
		int a=new Scanner(System.in).nextInt();
		methodA(a);
		System.out.printf("%s%n",decorateStr("Hello",2));
		System.out.println(decorateStr("Hello",1));
	}
	static String decorateStr(String str,int num){
		if(num%2==0){
			return "***"+str+"***";
		}else{
			return "---"+str+"---";
		}
	}
	static void methodA(int a){
		if(a<0){
			return;
		}
		System.out.println(a);
	}
}
