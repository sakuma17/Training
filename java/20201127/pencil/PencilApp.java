import java.util.*;
public class PencilApp{
	public static void main(String[]args){
		System.out.print("何色の鉛筆を作りますか>");
		String color=new Scanner(System.in).nextLine();
		Pencil pen1=new Pencil(color);
		while(true){
			System.out.print("操作を入力してください1…書く,2…情報を見る,3…終了>");
			int num=new Scanner(System.in).nextInt();
			if(num==3){
				break;
			}
			switch(num){
				case 1:
					if(pen1.penLength==0){
						System.out.println("もう書けません");
					}else{
						System.out.println(pen1.color+"で書いた");
						pen1.penLength-=1;
					}
					break;
				case 2:
					System.out.println("色:"+pen1.color);
					for(int i=0;i<pen1.penLength;i++){
						System.out.print("+");
					}
					System.out.println(">");
					break;
			}
		}
		System.out.println("アプリケーションを終了します");
	}
}
