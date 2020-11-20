import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("整数a>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b=new Scanner(System.in).nextInt();
		System.out.printf("大きい方は%d%n",max(a,b));
	}
	static int max(int a,int b){
		return a>b?a:b;
	}
}
