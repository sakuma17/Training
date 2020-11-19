import java.util.*;
public class Sh17a{
	public static void main(String[]args){
		System.out.print("要素数を入力>");
		int y=new Scanner(System.in).nextInt();
		int[] nums=new int[y];
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(20)+1;
			nums[i]=(num==1)||(num%10==7)? num:0;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=1;i<=17;i++){
			int count=0;
			if((i==1)||(i==7)||(i==17)){
				for(int j=0;j<nums.length;j++){
					if(nums[j]==i){
						count++;
					}
				}
				if(count==0){
					System.out.printf("%dは出ませんでした。%n",i);
				}else{
					System.out.printf("%dは%d回出ました。%n",i,count);
				}
			}
		}
	}
}
