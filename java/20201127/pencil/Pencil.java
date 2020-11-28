public class Pencil{
	String color;
	int penLength=5;

	public Pencil(String color){
		this.color=color;
	}
	public void write(){
		if(this.penLength==0){
			System.out.println("もう書けません");
			return;
		}
		System.out.println(this.color+"で書いた");
		this.penLength-=1;
	}
	public void status(){
		System.out.println("色:"+this.color);
		for(int i=0;i<this.penLength;i++){
			System.out.print('+');
		}
		System.out.println('>');
	}
}
