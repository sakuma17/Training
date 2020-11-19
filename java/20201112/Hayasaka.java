import java.util.*;
public class Hayasaka{
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int ScanNum=new Scanner(System.in).nextInt();
		int[] nums=new int[ScanNum];
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(100)+1;
			nums[i]=num;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		System.out.println("合計："+sum);
		System.out.println("平均："+(sum/nums.length));
	}
}

