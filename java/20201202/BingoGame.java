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
			System.out.println();
			System.out.printf("%d!(%d回目)",numbers[i],i+1);
			checkNum(numbers[i],card);
			int count=countBingoLine(card);
			if(count>0){
				System.out.print(":BINGO!!");
			}
			System.out.println();
			showCard(card);
			if(count>0){return;}
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
	static boolean isSame(int[]line){
		boolean isSame=true;
		int first=line[0];
		for(int i=1;i<line.length;i++){
			if(first != line[i]){
				isSame=false;
				break;
			}
		}
		return isSame;
	}

	static int[][] horizontalLines(int[][]card){
		int[][]lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	static int[][] verticalLines(int[][]card){
		int[][]lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[j][i]=card[j][i];
			}
		}
		return lines;
	}
	static int[][] crossLines(int[][] card){
		int[][] lines=new int[2][card.length];
		for(int i=0;i<lines.length;i++){
			for(int j=0;j<card.length;j++){
				if(i==0){
					lines[i][j]=card[j][j];
				}else{
					lines[i][j]=card[j][card.length-1-j];
				}
			}
		}
		return lines;
	}
	static int countBingoLine(int[][] card){
		int count=0;
		int[][]h=horizontalLines(card);
		int[][]v=verticalLines(card);
		int[][]c=crossLines(card);
		int[][] lines=mergeThreeLines(h,v,c);
		for(int[] line:lines){
			if(isSame(line)){
				count++;
			}
		}
		return count;
	}

	static int[][] mergeThreeLines(int[][] h,int[][] v,int[][] c){
		int[][] lines=new int[h.length+v.length+c.length][h[0].length];
			for(int i=0;i<lines.length;i++){
				int[] line=null;
				if(i<h.length){
					line=h[i];
				}else if(i<h.length+v.length){
					line=v[i-h.length];
				}else{
					line=c[i-h.length-v.length];
				}
				lines[i]=line;
			}
		return lines;
	}
}
