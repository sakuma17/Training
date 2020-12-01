import java.util.*;
public class HitBlow{
	public static void main(String[]args){
		int num=5;
		int[] arr=makeArr(num);
		System.out.println(Arrays.toString(arr));
	}
	static int[] makeArr(int num){
		int[] nums={0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<nums.length-1;i++){
			int index=new Random().nextInt(nums.length-i);
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		int[] arr=new int[num];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=nums[i];
		}
		return arr;
	}
}
