import java.util.*;
public class ArrLesson4{
	public static void main(String[] args){
		String[] w4={"いつ","誰が","どこで","何をした"};
		String[][] words=new String[w4.length][];
		for(int i=0;i<words.length;i++){
			System.out.printf("%sはいくつ?>",w4[i]);
			int num=new Scanner(System.in).nextInt();
			words[i]=new String[num];
			for(int j=0;j<words[i].length;j++){
				System.out.printf("%sを入れて>",w4[i]);
				words[i][j]=new Scanner(System.in).nextLine();
			}
		}
		String[] seps={"、","が","で",""};
		for(int i=0;i<words.length;i++){	
			int num=new Random().nextInt(words[i].length);
			System.out.print(words[i][num]+seps[i]);
		}
		System.out.println();
	}
}
