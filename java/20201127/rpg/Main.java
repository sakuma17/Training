import java.util.*;
/*Random rand=new Random();
int n=rand.nextInt(10);*/
/*Scanner scan=new Scanner(System.in);
int num=scan.nextInt();*/
public class Main{
	public static void main(String[]args){
		Hero h=new Hero();
		h.name="ロト";
		h.sleep();
		System.out.println(h.hp);
		Hero h2=new Hero();
		h2.name="ジェシカ";
		h2.sleep();
		h2.hp-=10;
		Hero h3=new Hero();
		h3.name="ククール";
		h3.hp=200;

		h.sit(10);
		h2.slip();
		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		Matango m2=new Matango();
		m2.hp=48;
		m2.suffix='B';
		m1.run();
		m2.run();
		h3.run();
	}
}
