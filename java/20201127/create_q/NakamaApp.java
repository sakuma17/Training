import java.util.*;
public class NakamaApp{
	public static void main(String[] args){
		System.out.print("仲間の名前を入力してください>");
		String name=new Scanner(System.in).nextLine();
		System.out.print("職業を入力してください([戦士][魔法使い][遊び人]のいずれか)>");
		String job=new Scanner(System.in).nextLine();
		Nakama n1=new Nakama(name,job);
		//n1.firstStatus();
		//n1.upStatus();
		n1.finalStatus();
	}
}
