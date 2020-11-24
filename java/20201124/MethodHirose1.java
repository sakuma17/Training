import java.util.*;
public class MethodHirose1{
	public static void main(String[] args){
		String[] people={"Aさん","Bさん","Cさん","Dさん"};
		System.out.print("何回振る?>");
		int num=new Scanner(System.in).nextInt();
		int[][] nums=new int[people.length][num];
		for(int i=0;i<people.length;i++){
			nums[i]=dice(num);
		}
		int[] sums=new int[people.length];
		for(int i=0;i<people.length;i++){
			System.out.print(people[i]+":");
			for(int n:nums[i]){
				System.out.print(n+", ");
				sums[i]+=n;
			}
			System.out.println("合計:"+sums[i]);
		}
		/*if(sums[0]>sums[1]){
			System.out.printf("%sの勝ち",people[0]);
		}else if(sums[0]<sums[1]){
			System.out.printf("%sの勝ち",people[1]);
		}else{
			System.out.println("引き分け");
		}*/
		int max=0;
		for(int i=0;i<sums.length-1;i++){
			max=sums[0]>sums[i+1]?sums[0]:sums[i+1];
			System.out.println("maxは"+max);
		}
		for(int i=0;i<sums.length;i++){
			if(sums[i]==max){
				System.out.print(people[i]+" ");
			}
		}
		System.out.printf("の勝ち%n");
	}

	static int[] dice(int num){
		int[] dice=new int[num];
		for(int i=0;i<num;i++){
			dice[i]=new Random().nextInt(6)+1;
		}
		return dice;
	}

}
