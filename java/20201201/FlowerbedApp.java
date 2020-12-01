import java.util.*;
public class FlowerbedApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何色の花にしますか?>");
		String color=sc.nextLine();
		System.out.print("種をいくつ植えますか?>");
		int seedNum=sc.nextInt();
		Flowerbed fb1=new Flowerbed(color,seedNum);
		while(true){
			System.out.println("何をしますか?1…水汲み2…水撒き3…花壇を見る4…終了>");
			int num=sc.nextInt();
			if(num==4){
				System.out.println("アプリケーションを終了します");
				break;
			}
			switch(num){
				case 1:
					fb1.drawWater();
					break;
				case 2:
					fb1.waterFlower();
					break;
				case 3:
					fb1.showStatus();
					break;
					//default:
					//System.out.println("アプリケーションを終了します");
					//return;
			}
		}
	}
}
