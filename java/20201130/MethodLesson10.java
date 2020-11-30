import java.util.*;
public class MethodLesson10{
	static int priceInTax(int price,int tax){
		double priceTd=price*(1+tax/100.0);
		int priceT=(int)priceTd;
		return priceT;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("消費税は何%ですか>");
		int tax=sc.nextInt();
		int sum=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int price=sc.nextInt();
			sum+=price;
			if(price==0){
				break;
			}
		}
		int priceT=priceInTax(sum,tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です。%n",priceT);
	}
}
