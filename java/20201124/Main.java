import java.util.*;
public class Main{
	public static void main(String[]args){
		System.out.print("何人?>");
		int num=new Scanner(System.in).nextInt();
		char[] players=createAlphArr('A',num);
		int [] sums=new int[players.length];
		System.out.print("何回振る?>");
		int count=new Scanner(System.in).nextInt();
		for(int i=0;i<players.length;i++){
			int[] diceArr=createDiceArr(count);
			for(int n:diceArr){
				sums[i]+=n;
			}
			System.out.printf("%sさん:%s 合計:%d%n",players[i],Arrays.toString(diceArr),sums[i]);
		}
		if(isSame(sums)){
			System.out.println("引き分け");
		}else{
			int maxNum=maxNum(sums);
			String str="";
			for(int i=0;i<sums.length;i++){
				if(sums[i]==maxNum){
					str+=players[i]+"さん,";
				}
			}
			//最後の,を削除する処理
			str=str.substring(0,str.length()-1);
			//結果出力
			System.out.println(str+"の勝ち");
		}
	}

	static int[] createDiceArr(int count){
		int[] diceArr=new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
	static char[] createAlphArr(char first,int num){
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}
		return alphArr;
	}
	static boolean isSame(int[] nums){
		int first=nums[0];
		for(int i=1;i<nums.length;i++){
			if(first != nums[i]){
				return false;
			}
		}
		return true;
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		return max;
	}
}
