import java.util.*;
public class Tt{
	public static void main(String[] args){
		System.out.print("何人ですか>");
		int num=new Scanner(System.in).nextInt();
		int[] scores=new int[num];
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の点数>",i+1);
			int score=new Scanner(System.in).nextInt();
			scores[i]=score;
		}
		for(int i=0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]>scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
