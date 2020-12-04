public class Computer extends TangibleAsset{
	String makerName;
	public Book(String name,int price,String color,String makerName){
		super(name,price,color);
		this.makerName=makerName;
	}
	public String getMakerName(){
		return this.makerName;
	}
}
