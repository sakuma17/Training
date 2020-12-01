import java.util.*;
public class BingoGame{
	public static void main(String[] args) throws Exception{
		//ここを記述
		Scanner sc=new Scanner(System.in);
		System.out.print("あなたの名前を入力してください>");
		String name=sc.nextLine();
		System.out.print("あなたの年齢を入力してください>");
		int age=sc.nextInt();
		Bingo b1=new Bingo(name,age);
		if(b1.ageCheck()){
			System.out.println("残り枚数:"+b1.coin);
		}else{
			System.out.println("18歳未満の方は遊戯できません");
			return;
		}
		while(true){
			if(b1.coin==0){
				b1.gameOver();
				return;
			}
			System.out.print("BET枚数を入力。0で終了 1-"+b1.coin+'>');
			int betCoin=sc.nextInt();
			if(betCoin==0){
				b1.gameOver();
				return;
			}
			b1.play(betCoin);
		}
	}
}

class Bingo{
  final int BINGO_RATIO=12;
	String userName;
	int userAge;
	int coin=100;
	public Bingo(String userName,int userAge){
		//ここを記述
		this.userName=userName;
		this.userAge=userAge;
		System.out.printf("こんにちは%s(%d)さん。%n",this.userName,this.userAge);
	}
	public boolean ageCheck(){
	 //ここを記述
	 return this.userAge>17;
	}
	public void play(int bet) throws Exception{
		if(this.coin < bet){
			System.out.println("コインが不足しています");
			return;
		}
		this.coin -= bet;
		Random rand=new Random();
		int[] table=new int[9];
		for(int i=0;i<9;i++){
			/*ここに1秒止める処理を記述*/
			Thread.sleep(1000);
			table[i]=rand.nextInt(10);
			System.out.print(table[i]);
			if((i+1) % 3==0){
				System.out.println();
			}
		}
		int bingoCount=bingoCount(table);
		if(bingoCount==0){
			System.out.println("boo");
		}else{
			int win=bet*BINGO_RATIO*bingoCount;
			System.out.println(bingoCount+" LINE BINGO!!win:"+win);
			this.coin += win;
		}
		System.out.printf("%sさんの所持コイン:%d%n",this.userName,this.coin);
	}	
	public int bingoCount(int[] table){
		int[][] bc={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bc.length;i++){
			int[] c= bc[i];
			if(table[c[0]]==table[c[1]]&&table[c[1]]==table[c[2]]){
				bingo++;
			}
		}
		return bingo;
	}
	public void gameOver(){
		System.out.println("Game Over");
	}
}
