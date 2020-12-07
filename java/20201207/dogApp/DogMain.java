import java.util.*;
public class DogMain{
	public static void main(String[]args){
		Dog d1=new Dog("John");
		System.out.println(d1.getName());
		Dog d2=new Dog("Paul",2);
		d2.setWeight(4000d);
		System.out.printf("%s(%d)の体重は%.1fです。%n",d2.getName(),d2.getAge(),d2.getWeight());
		Dog d3=new Dog("George",3,7000d);
		d3.agePlus();
		Dog[] dogs={d1,d2,d3};
		for(Dog d:dogs){
			d.bow();
			System.out.println(d.getId());
		}
	}
}
