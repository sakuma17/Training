public class Main{
	public static void main(String[]args){
		/*
		Hero h=new Hero();
		h.run();
		SuperHero sh=new SuperHero();
		sh.run();
		Weapon w=new Weapon();
		*/
		/*
		Hero h=new Hero();
		Sword sword=new Sword();
		sword.name="はがねの剣";
		sword.damage=10;
		h.setSword(sword);

		Matango[] ms=new PoisonMatango[3];
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');

		for(Matango m:ms){
			m.attack(h);
		}
		System.out.println(h.name+"のHP"+h.hp);
		h.attack(ms[0]);
		*/
		//Character c=new Character();
		//Dancer dancer=new Dancer();
		Goblin gb1=new Goblin();
		Werewolf ww1=new Werewolf();
		Deathbat db1=new Deathbat();
		gb1.attack();
		gb1.run();
		ww1.attack();
		ww1.run();
		db1.attack();
		db1.run();
	}
}
