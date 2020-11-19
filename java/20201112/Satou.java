import java.util.*;
public class Satou{
	public static void main(String[] args){
		System.out.print("1~10のうち好きな数字を入力してください>");
		int ScanNum=new Scanner(System.in).nextInt();
		int[] nums=new int[10];
		int count=0;
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(10)+1;
			nums[i]=num;
			System.out.print(num+",");
			count=nums[i]==ScanNum? count+1:count;
		}
		System.out.println();
		if(count==0){
			System.out.printf("%dは出ませんでした",ScanNum);
		}else{
			System.out.printf("%dは%d回出ました%n",ScanNum,count);
		}
	}
}
