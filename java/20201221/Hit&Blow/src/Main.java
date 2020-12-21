import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		final int[] nums =new int[10];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i;
		}
		System.out.println("要素数(10以下):");
		int ansLength=sc.nextInt();
		int[] answer=new int[ansLength];
		int[] userAns=new int[ansLength];

		for(int i=0;i<answer.length;i++) {
			int index=rand.nextInt(nums.length-1-i);
			answer[i]=nums[index];
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		int count=0;
		while(true) {
			System.out.printf("%d桁の数字を入力せよ>",ansLength);
			String input=sc.next();
			if(input.length()!=ansLength) {
				continue;
			}
			count++;
			for(int i=0;i<userAns.length;i++) {
				userAns[i]=Character.getNumericValue(input.charAt(i));
			}
			int hit=0,blow=0;
			for(int i=0;i<userAns.length;i++) {
				if(userAns[i]==answer[i]) {
					hit++;
				}else {
					for(int j=0;j<answer.length;j++) {
						if(userAns[i]==answer[j]) {
							blow++;
						}
					}
				}
			}
			System.out.printf("Hit=%d/Blow=%d%n",hit,blow);
			if(hit==answer.length) {
				System.out.println("Nice Hit!!");
				System.out.println("正解="+input);
				System.out.println("Count:"+count);
				break;
			}
		}
		sc.close();
	}
}
