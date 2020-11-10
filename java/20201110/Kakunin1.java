import java.util.*;
public class Kakunin1{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(101);
			nums[i]=num;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
