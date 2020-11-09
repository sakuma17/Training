public class ArrLesson1{
	public static void main(String[] args){
		int[] nums=new int[3];
		System.out.println(nums.length);

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		nums[0]=10;
		nums[1]=20;
		nums[2]=30;

		System.out.println(nums[0]);

		nums[0]=nums[1]+nums[2];
		System.out.println(nums[0]);
	}
}
