public abstract Asset{
	String name;
	int price;
	public Asset(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return this.name;
	}
	public String getPrice(){
		return this.price;
	}
}
