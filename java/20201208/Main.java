public class Main{
	public static void main(String[] args){
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		Hero h1=new Hero();
		h.name="ミナト";
		//System.out.println(h.toString());
		//↑↓同じ処理になる
		System.out.println(h);
		if(h.equals(h1)){
			System.out.println("同じです。");
		}
	}
}
