public abstract class App{
	String name;
	public abstract void doApp();
}

class Excel extends App{
	String name="エクセル";
	@Override
	public void doApp(){
		System.out.println(this.name+"で表計算を実行した。");
	}
}

class Word extends App{
	String name="ワード";
	@Override
	public void doApp(){
		System.out.println(this.name+"でポスターを作成した。");
	}
}

class PowerPoint extends App{
	String name="パワポ";
	@Override
	public void doApp(){
		System.out.println(this.name+"でスライドを作成した。");
	}
}
