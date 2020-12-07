public class Hero{
	private String name;
	private int hp;
	static int money;
	public Hero(String name){
		this.setName(name);
	}
	public Hero(String name,int hp){
		this.setName(name);
		this.setHp(hp);
	}
	public void attack(){
		money+=10;
		int damage=new java.util.Random().nextInt(10)+1;
		this.hp-=damage;
		System.out.println(this.name+"は"+damage+"のダメージを受けた");
		System.out.println("戦闘に勝利した");
	}
	public static void showMoney(){
		System.out.println("所持金:"+money);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
}
