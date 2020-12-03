import java.util.*;
public class PoolApp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Pool p1=new Pool();
		while(true){
			System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>");
			int num=sc.nextInt();
			switch(num){
				case 1:
					System.out.print("給水する水量を入力してください>");
					int fWater=sc.nextInt();
					p1.feedWater(fWater);
					break;
				case 2:
					System.out.print("排水する水量を入力してください>");
					int dWater=sc.nextInt();
					p1.drainWater(dWater);
					break;
				case 3:
					p1.display();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
