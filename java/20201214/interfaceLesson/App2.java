public abstract class App2{
	String name;
	public App2(String name){
		this.name=name;
	}
	public abstract void doApp();
}
class Excel2 extends App2{
	public Excel2(String name){
		super(name);
	}
	@Override
	public void doApp(){
		System.out.println(this.name + "で表計算を実行した");
	}
}
class Word2 extends App2{
	public Word2(String name){
		super(name);
	}
	@Override
	public void doApp(){
		System.out.println(this.name + "で文章を作成した");
	}
}
class PowerPoint2 extends App2{
	public PowerPoint2(String name){
		super(name);
	}
	@Override
	public void doApp(){
		System.out.println(this.name+"でスライドを作成した");
	}
}
