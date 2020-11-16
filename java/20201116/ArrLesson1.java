import java.util.*;
public class ArrLesson1{
	public static void main(String[] args){
		int[][]nums=new int[3][4];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j]=new Random().nextInt(100)+1;
				System.out.printf("%3d ",nums[i][j]);
			}
			System.out.println();
		}
	}
}
