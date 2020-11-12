import java.util.*;
public class Arr1{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		int[] scores=new int[num];
		for(int i=0;i<scores.length;i++){
			System.out.print((i+1)+"人目の点数>");
			scores[i]=new Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(scores));
	}
}
