import java.util.*;
public class ArrayListLesson2{
	public static void main(String[]args){
		ArrayList<Slime> slimes=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listにスライムを追加していってみよう。");
		while(true){
			System.out.print("スライムを追加する?(1…yes,2…no):");
			int select=sc.nextInt();sc.nextLine();
			if(select==2){
				break;
			}
			System.out.print("追加するスライムの名前を決めてね:");
			String slimeName=sc.nextLine();
			slimes.add(new Slime(slimeName));
		}
		for(int i=0;i<slimes.size();i++){
			(slimes.get(i)).attack();
		}
	}
}
