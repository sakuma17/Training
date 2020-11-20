import java.util.*;
public class MethodLesson9{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String str=new Scanner(System.in).next();
		System.out.print("繰り返す回数>");
		int num=new Scanner(System.in).nextInt();
		System.out.printf(strNum(str,num));
	}
	static String strNum(String s,int n){
		String str="";
		for(int i=0;i<n;i++){
			str+=s;
		}
		return str;
	}
}
