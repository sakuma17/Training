public class Pool{
		double water;
		final double MAX_WATER=600.0;

	public Pool(){
		this.water=0.0;
	}
	public void feedWater(double water){
		if(water<0){
			System.out.println("給水量は正の値を入力してください。");
			return;
		}
		if(this.water==MAX_WATER){
			System.out.println("水が満杯です。");
			return;
		}
		//waterとMAX_WATER-this.waterの小さい方を代入しても良い
		double feedWater=this.water+water>MAX_WATER? MAX_WATER-this.water:water;
		this.water+=feedWater;
		System.out.println(feedWater+"立法メートル給水しました。");
	}
	public void drainWater(double water){
		if(water<0){
			System.out.println("排水量は正の値を入力してください。");
			return;
		}
		if(this.water==0.0){
			System.out.println("水がありません。");
			return;
		}
		double drainWater=this.water>water? water:this.water;
		this.water-=drainWater;
		System.out.println(drainWater+"立法メートル排水しました。");
	}
	public void display(){
		System.out.println("現在の水量は"+this.water+"立法メートルです。");
	}
}
