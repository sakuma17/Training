import java.util.*;
public class CatCollection{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		ArrayList<Cat> cats=new ArrayList<Cat>();
		System.out.println("***Cat Collection***");
		while(true){
			System.out.print("1.Collect 2.Play 3.End>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					int num=rand.nextInt(3);
					Cat.appeared(num);
					System.out.print("Please name this cat>");
					String name=sc.next();
					cats.add(new Cat(name,num));
					break;
				case 2:
					if(cats.isEmpty()){
						System.out.println("You do not have anyone to play with.");
						break;
					}
					for(int i=0;i<cats.size();i++){
						cats.get(i).showCats(i);
					}
					System.out.print("Who do you play with?>");
					int catNum=sc.nextInt();
					cats.get(catNum).play();
					break;
				case 3:
					System.out.println("Game over");
					return;
			}
		}
	}
}
