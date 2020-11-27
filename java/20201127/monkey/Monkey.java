public class Monkey {
	String name;
	int age;
	public Monkey(String name,int age){
		this.name=name;
		this.age=age;
	}
	//挨拶をするメソッド
	public void greet(){
		System.out.println("こんにちは。"+this.name+"("+this.age+"才)です。よろしく!");
	}
	//竹馬をするメソッド
	public void takeuma(){
		System.out.println(this.name+"は上手に竹馬にのった！");
	}
	//逆立ちをするメソッド
	public void sakadachi(){
		System.out.println(this.name+"はひょいと逆立ちをした!");
	}
}
