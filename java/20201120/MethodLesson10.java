import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double weight=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		int height=new Scanner(System.in).nextInt();
		System.out.printf("体重:%.1fkg,身長:%dcmのBMIは%.1fです。",weight,height,calcBMI(weight,height));
	}
	static double calcBMI(double weightKg,int heightCm){
		double bmi=weightKg/(heightCm*heightCm/10000);
		return bmi;
	}
}
