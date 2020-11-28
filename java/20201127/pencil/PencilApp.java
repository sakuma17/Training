import java.util.*;
public class PencilApp{
	public static void main(String[]args){
		System.out.print("何色の鉛筆を作りますか>");
		String color=new Scanner(System.in).nextLine();
		Pencil pen1=new Pencil(color);
		while(true){
			System.out.print("操作を入力してください1…書く,2…情報を見る,3…終了>");
			int num=new Scanner(System.in).nextInt();
			switch(num){
				case 1:
					pen1.write();
					break;
				case 2:
					pen1.status();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
