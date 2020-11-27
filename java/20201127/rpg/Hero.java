public class Hero{
	//フィールド
	String name;
	int hp=100;

	//コンストラクタ class名と一緒
	public Hero(String name){
		this.name=name;
	}
	//public Hero(){}オーバーロードも可能
	public Hero(String name,int hp){
		this(name);//String型1つを引数とするコンストラクタを呼び出している。この呼び出しは1行目に書く必要がある。
		this.hp=hp;
	}
	public void sleep(){
		this.hp=100;
		System.out.println(this.name +"は、眠って回復した!");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った!");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は、転んだ!");
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
