import java.util.*;
public class MonkeyApp{
	public static void main(String[]args){
		System.out.print("おさるの名前を決めてください:>");
		String name=new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください:>");
		int age=new Scanner(System.in).nextInt();
		Monkey m1=new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか?1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int num=new Scanner(System.in).nextInt();
			switch(num){
				case 1:
					m1.greet();
					break;
				case 2:
					m1.takeuma();
					break;
				case 3:
					m1.sakadachi();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
