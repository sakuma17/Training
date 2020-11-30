import java.util.*;
public class MethodLesson9{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double weightKg=scan.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double heightCm=scan.nextDouble();
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです%n",weightKg,heightCm,calcBMI(weightKg,heightCm));
	}
	static double calcBMI(double weightKg,double heightCm){
		double heightM=heightCm/100;
		double bmi=weightKg/(heightM*heightM);
		return bmi;
	}
}
