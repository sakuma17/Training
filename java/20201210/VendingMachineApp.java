import java.util.*;
public class VendingMachineApp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Wallet w1=new Wallet(1000);
		VM vm1=new VM(3);
		vm1.showCoins();
		while(true){
			System.out.print("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.print("投入金額する金額を入力してください>");
					int money=sc.nextInt();
					int money1=w1.getMoney()>money? money:w1.getMoney();
					w1.takeOutMoney(money1);
					vm1.insertCoins(money1);
					break;
				case 2:
					vm1.purchase();
					break;
				case 3:
					if(vm1.getMoney()==0){
						System.out.println("お釣りはありません。");
						break;
					}
					w1.insertMoney(vm1.cancel());
					break;
				case 4:
					System.out.print("商品を投入する個数を入力してください>");
					int goodsNum=sc.nextInt();
					vm1.insertGoods(goodsNum);
					break;
				case 5:
					w1.display();
					break;
				case 6:
					if(vm1.getMoney()>0){
						w1.insertMoney(vm1.cancel());
					}
					System.out.println("アプリケーションを終了します。");
					return;
				default:
					break;
			}
		}
	}//main
}//App

class Wallet{
	private int money;
	Wallet(int money){
		setMoney(money);
	}
	public void setMoney(int money){
		this.money=money>0? money:0;
	}
	public int getMoney(){
		return this.money;
	}
	public void insertMoney(int money){
		System.out.println("財布に"+money+"円入れました。");
		this.money+=money;
	}
	public void takeOutMoney(int money){
		this.money-=money;
		System.out.println("財布から"+money+"円取り出しました。");
	}
	public void display(){
		System.out.println("現在の財布の中身:"+this.money+"円");
	}
}//wallet

	class VM{
		static int price=130;
		private int money;
		private int num;
		VM(int num){
			insertGoods(num);
		}
		public int getMoney(){
			return this.money;
		}
		public void insertGoods(int num){
			this.num+=num;
		}
		public void showCoins(){
			System.out.println("現在の入金額:"+this.money+"円");
		}
		public void insertCoins(int money){
			this.money+=money;
			showCoins();
		}
		public int cancel(){
			System.out.println("お釣りを取り出しました。");
			int rMoney=this.money;
			this.money=0;
			return rMoney;
		}
		public void purchase(){
			if(this.num==0){
				System.out.println("品切れです。");
				return;
			}
			if(this.money<price){
				System.out.println("投入金額が足りません。");
				return;
			}
			this.money-=price;
			this.num-=1;
			System.out.println("商品を購入しました。");
			this.showCoins();
		}
	}//VendingMachine
