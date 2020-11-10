import java.util.*;
public class Rps{
	public static void main(String[] args){
		String[] cHands={"グー","チョキ","パー"};
		int index=new Random().nextInt(cHands.length-1);
		System.out.print("あなたの手を入力 0.グー、1.チョキ、2.パー>");
		int yHand=new Scanner(System.in).nextInt();
		System.out.printf("PCは%sです%n",cHands[index]);
		if(index==yHand){
			System.out.println("あいこです");
		}else if(yHand==0 && index==2){
			System.out.println("あなたの負けです");
		}else if(yHand<index){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
}
//(Yhand+3-index)%3でうまいこと判定する方法もある
