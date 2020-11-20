import java.util.*;
public class MethodLesson5{
	public static void main(String[] args){
		System.out.print("言葉>");
		String word=new Scanner(System.in).nextLine();
		String dW=decoration(word);
		System.out.println(dW);
		/*int n=sumOf(3,5);
		System.out.println(n);i*/
	}
	static String decoration(String a){
		return "***"+a+"***";
	}
	//戻り値のあるメソッド
	static int sumOf(int a,int b){
		return a+b;
	}
}
