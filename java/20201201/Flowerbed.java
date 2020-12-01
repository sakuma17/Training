public class Flowerbed{
	final int MAXWATER=3;
	String color="";
	int seedNum=0;
	int bloom=0;
	int water=0;
	public Flowerbed(String c,int n){
		this.color=c;
		this.seedNum=n;
	}
	public void drawWater(){
		if(this.water==MAXWATER){
			System.out.println("水は満杯です");
			return;
		}
		System.out.printf("水を%d杯汲みました%n",(MAXWATER-this.water));
		this.water=MAXWATER;
	}
	public void waterFlower(){
		if(this.seedNum==0){
			System.out.println("すべての花が咲いています");
			return;
		}
		switch(this.water){
			case 0:
				System.out.println("水が空っぽです");
				return;
			case 1:
			case 2:
			case 3:
		this.water-=1;
		this.seedNum-=1;
		this.bloom+=1;
		System.out.println("水を撒きました");
		}
	}
	public void showStatus(){
		String status="#";
		for(int i=0;i<bloom;i++){
			status+='*';
		}
		for(int i=0;i<seedNum;i++){
			status+='.';
		}
		status+='#';
		System.out.println("花の色は"+this.color);
		System.out.println(status);
	}
}//Flowerbed
