public class Archer{
	private static int totalArcher=0;
	private int no;
	public Archer(){
		totalArcher++;
		this.no=totalArcher;
		System.out.println("Archer"+this.no+"を生成しました。");
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"は矢を放った!");
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
}
