import java.util.*;
public class Kakunin{
	public static void main(String[] args){
		int[] dices=new int[10];
		for(int i=0;i<dices.length;i++){
			int dice=new Random().nextInt(6)+1;
			dices[i]=dice;
		}
		System.out.println(Arrays.toString(dices));
	}
}
