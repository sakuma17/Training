import java.util.*;
public class BingoGame{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] card=makeBingoCard();
		int[] numbers=makeRandomArr();
		showCard(card);
		for(int i=0;i<numbers.length;i++){
			System.out.print("エンター");
			String botton=sc.nextLine();
			System.out.printf("%d!(%d回目)%n",numbers[i],i+1);
			checkNum(numbers[i],card);
			showCard(card);
			if(i==9){break;}
		}
	}
	static int[] makeRandomArr(){
		Random rand=new Random();
		int[] nums=new int[99];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		for(int i=0;i<nums.length-1;i++){
			int index=rand.nextInt(nums.length-i);
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		return nums;
	}
	static int[][] makeBingoCard(){
		int[] nums=makeRandomArr();
		int[][] card=new int[5][5];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				card[i][j]=nums[i*card.length+j];
			}
		}
		card[2][2]=0;
		return card;
	}

	static void checkNum(int num,int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				if(card[i][j]==num){
					card[i][j]=0;
					return;
				}
			}
		}
	}
	static void showCard(int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				if(card[i][j]==0){
					System.out.print("@@ ");
				}else{
					System.out.printf("%02d ",card[i][j]);
				}
			}
			System.out.println();
		}
	}
}
