import java.util.*;
public class BicycleApp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Bicycle[] Bicycles=new Bicycle[2];
		Bicycles[0] =new Bicycle();
		Bicycles[1] =new ElectricBicycle();
		while(true){
			System.out.println();
			System.out.println("自転車を選んでください>");
			System.out.printf("0・・・自転車/ホイールサイズ:%d%n",Bicycles[0].wheelSize);
			System.out.printf("1・・・電動自転車/ホイールサイズ:%d バッテリー:%d%n",((ElectricBicycle)Bicycles[1]).wheelSize,((ElectricBicycle)Bicycles[1]).battery);
			System.out.println("2・・・終了");
			System.out.print("番号を入力してください>");
			int index=sc.nextInt();
			if(index>=2){
				return;
			}
			while(true){
				String str="1/走る,2/降りる>";
				if(index==1){
					str=str.substring(0,str.length()-1);
					str+="3/充電>";
				}
				System.out.print(str);
				int num=sc.nextInt();
				if(num==2){
						System.out.println(Bicycles[index].type+"を降りました");
						break;
				}
				switch(num){
					case 1:
						Bicycles[index].ride();
						break;
					case 3:
						((ElectricBicycle)Bicycles[index]).batteryCharge();
					default:
						break;
				}
			}
		}
	}
}
