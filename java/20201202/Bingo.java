import java.util.*;
public class Bingo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("幅>");
		int width=sc.nextInt();
		int[][] card=makeCard(width);
		showCard(card);
		/*int[][] h=horizontalLines(card);
		System.out.println();
		showCard(h);
		int[][] v=verticalLines(card);
		System.out.println();
		showCard(v);
		int[][] c=crossLines(card);
		System.out.println();
		showCard(c);*/
		int bingoCount=countBingoLine(card);
		System.out.println(bingoCount);
	}//end main

	static int[][] makeCard(int width){
		Random rand=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				card[i][j]=rand.nextInt(9)+1;
			}
		}
		return card;
	}

	static void showCard(int[][]card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				System.out.print(card[i][j]);
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

	//横のラインの組み合わせを返すメソッド
	static int[][] horizontalLines(int[][]card){
		int[][]lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	//縦のラインの組み合わせを返すメソッド
	static int[][] verticalLines(int[][]card){
		int[][]lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[j][i]=card[j][i];
			}
		}
		return lines;
	}
	//斜めの組み合わせを返すメソッド
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
	
}//end class
