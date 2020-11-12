import java.util.*;
public class Sh17{
	public static void main(String[] args){
		System.out.print("要素数を入力>");
		int youso=new Scanner(System.in).nextInt();
		int[] nums=new int[youso];
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(20)+1;
			nums[i]=(num==1)||(num%10==7)? num:0;
		}
		System.out.println(Arrays.toString(nums));
		int count1=0;
		int count7=0;
		int count17=0;
		for(int i=0;i<nums.length;i++){
			count1=nums[i]==1?count1+1:count1;
			count7=nums[i]==7?count7+1:count7;
			count17=nums[i]==17?count17+1:count17;
		}
		if(count1==0){
			System.out.println("1は出ませんでした。");
		}else{
			System.out.println("1は"+count1+"回出ました。");
		}
		if(count7==0){
			System.out.println("7は出ませんでした。");
		}else{
			System.out.println("7は"+count7+"回出ました。");
		}
		if(count17==0){
			System.out.println("17は出ませんでした。");
		}else{
			System.out.println("17は"+count17+"回出ました。");
		}
	}
}
