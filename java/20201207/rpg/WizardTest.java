import java.util.*;
public class WizardTest{
	public static void main(String[] args){
		Hero h=new Hero("ロト",100);
		Wizard w=new Wizard();
		w.setName("ジェシカ");
		w.setMp(100);
		w.setHp(100);
		Wand wand=new Wand();
		wand.setName("さとりの杖");
		wand.setPower(50d);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h.getName()+"のHPは"+h.getHp());
	}
}
