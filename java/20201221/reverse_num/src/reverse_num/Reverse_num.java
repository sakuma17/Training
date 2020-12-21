package reverse_num;
import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("数値(1~10000)>");
			String num=sc.next();
			if(num.length()>4 && !num.equals("10000")) {
				System.out.println("1~10000で入力してください");
				continue;
			}
			if(num.equals("0")) {
				System.out.println("終了します");
				return;
			}
			String r="";
			for(int i=0;i<num.length();i++) {
				r+=num.charAt(num.length()-1-i);
			}
			int r_num=Integer.parseInt(r);
			System.out.println("逆順にしました>"+r_num);
		}
	}

}
