import java.util.*;
public class Main{
	public static void main(String[]args){
		Animal[] animals=new Animal[3];
		animals[0]=new Dog("ジョン");
		animals[1]=new Cat("ミケ");
		animals[2]=new Pig("サム");
		for(Animal a:animals){
			a.makeNoize();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
		/*
		Cat c=(Cat)animals[1];
		c.sleep();
		*/
		//((Cat)animals[1]).sleep();
	}
}
