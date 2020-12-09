public class Cat{
	static char[] types={'A','B','C'};
	char type;
	String name;
	int intimacy;

	public Cat(String name,int num){
		this.name=name;
		this.type=types[num];
		System.out.println(this.name+" joined!");
	}

	public static void appeared(int num){
		System.out.println(types[num]+"-type cat appeared!");
	}

	public void showCats(int i){
		System.out.println(i+"..."+this.name+"["+this.type+"]("+this.intimacy+")");
	}

	public void play(){
		System.out.println("Playing with "+this.name);
		System.out.println("...");
		this.intimacy++;
		System.out.println("Intimacy is up!!");
	}
}
