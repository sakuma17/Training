import my.util.*;
import java.util.*;
public class CommonTest{
	public static void main(String[]args){
		System.out.print("配列の要素数を入力してください>");
		int count=new Scanner(System.in).nextInt();
		int min=-10;
		int max=10;
		int[] arr= Common.arrRandomRange(min,max,count);
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arr));
		int[] cloneArr=Common.arrClone(arr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int num=new Scanner(System.in).nextInt();
			if(num==4){
				break;
			}
			switch(num){
				case 1:
				System.out.println(Arrays.toString(arr));
				break;
				case 2:
				Common.arrSort(cloneArr);
				System.out.println(Arrays.toString(cloneArr));
				break;
				case 3:
				Common.arrSort(cloneArr,true);
				System.out.println(Arrays.toString(cloneArr));
				break;
			}
		}
		System.out.println("アプリケーションを終了します");
	}
}
