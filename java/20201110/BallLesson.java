public class BallLesson{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		int[] nums=new int[balls.length];
		int count=balls.length;
		while(count>0){
			int rand=new java.util.Random().nextInt(balls.length);
			if(nums[rand]==0){
			System.out.println(balls[rand]);
			nums[rand]=balls[rand];
			count=count-1;
			}
		}
	}
}
