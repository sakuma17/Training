import java.util.*;
public class Main{
	public static void main(String[] args){
		//System.out.println(Hero.money);
		Hero.showMoney();
		Hero h=new Hero("ロト");
		h.setHp(100);
		Hero h1=new Hero("ジェシカ");
		h1.setHp(100);
		h.attack();
		h1.attack();
		Hero.showMoney();
		System.out.println(h.getName()+":"+h.getHp());
		System.out.println(h1.getName()+":"+h1.getHp());
	}
}
