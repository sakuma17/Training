public class ElectricBicycle extends Bicycle{
	int battery;
	static final int MAX=10;
	public ElectricBicycle(){
		this.type="電動自転車";
		this.wheelSize=24;
		this.battery=10;
	}
	@Override
	public void ride(){
		super.ride();
		if(this.battery==0){
			System.out.println("バッテリーが切れるととても重いです");
		}else{
			System.out.println("坂道だってラクラクです");
		}
		this.battery-=5;
	}
	public void batteryCharge(){
		System.out.println("バッテリーを充電しました");
		this.battery=MAX;
	}
}
