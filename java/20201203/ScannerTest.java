import java.util.*;
public class ScannerTest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("好きな数字は>");
		int num=sc.nextInt();sc.nextLine();
		//↑nextLineが改行に反応してしまうので空読みさせている。
		System.out.print("お名前>");
		String name=sc.nextLine();
		System.out.println(name+"さんの好きな数字は"+num+"ですね!");
	}
}
