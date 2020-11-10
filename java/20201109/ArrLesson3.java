import java.util.Arrays;
//import java.util.*
//new Random().nextInt(100)+1;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA={3,5,10};//宣言と同時のみOKな書き方

		int[] dataB=new int[]{4,6,10};//宣言と同時じゃなくても（2行に分けても）OK

		String[] strs={"hoge","fuga","bar"};
		double[] nums={1.1,2.2,3.3};
		boolean[] bools={false,false,true,true};
		for(int i=0;i<strs.length;i++){
			System.out.println(strs[i]);
		}

		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//拡張for文 dataBの要素を出し切るまで回す
		//通常のコロンであることに注意
		for(int n:dataB){
			System.out.println(n);
		}

		for(String n:strs){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
