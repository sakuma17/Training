public abstract class Character{
	//一つでも抽象メソッドを持ってるクラスは抽象クラスとして宣言する
	String name;
	int hp;
	public void run(){
		System.out.println(this.name+"は、逃げ出した");
	}
	public abstract void attack(Matango m);
}
