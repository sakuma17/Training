import java.util.*;
public class MethodLesson8{
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int month=new Scanner(System.in).nextInt();
		System.out.printf("%d月の日数は%d日です。%n",month,dayN(month));
	}
	static int dayN(int n){
		if(n==2){
			return 28;
		}else if(n==4 || n==6 || n==9 || n==11){
			return 30;
		}else{
			return 31;
		}
	}
}
