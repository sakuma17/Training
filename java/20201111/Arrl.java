import java.util.*;
public class Arrl{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(101);
			nums[i]=n;
		}
		for(int i=0;i<nums.length;i++){
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
