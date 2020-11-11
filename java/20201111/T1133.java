import java.util.*;
public class T1133{
	public static void main(String[] args){
		int[] nums=new int[10];
		String[] oddEven=new String[10];
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(10);
			nums[i]=num;
			System.out.printf("%d,",num);
			oddEven[i]=num%2==0? "偶数":"奇数";
		}
		System.out.println();
		System.out.println(Arrays.toString(oddEven));
	}
}
