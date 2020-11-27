import java.util.*;
public class NakamaApp{
	public static void main(String[] args){
		System.out.print("名前を入力してください>");
		String name=new Scanner(System.in).nextLine();
		System.out.print("職業を入力してください>");
		String job=new Scanner(System.in).nextLine();
		Nakama n1=new Nakama(name,job);
		System.out.println(n1.name+"("+n1.job+")");
		System.out.println(Arrays.toString(n1.status));
		status(n1.status);
	}
	static void status(int[] st){
		System.out.println("現在のステータス");
		System.out.printf("HP:%d,MP:%d,力:%d,守り:%d,速さ:%d,運:%d",st[0],st[1],st[2],st[3],st[4],st[5]);
	}
}
