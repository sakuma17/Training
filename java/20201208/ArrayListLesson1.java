import java.util.*;
public class ArrayListLesson1{
	public static void main(String[]args){
		System.out.println("ArrayListを作ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		ArrayList<Integer> nums=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("要素を追加するよ!数字を入れてね(0で終了):");
			int num=sc.nextInt();
			if(num==0){
				break;
			}
			nums.add(num);
			System.out.println(num+"をListに追加したよ!");
		}
		System.out.println("──結果──");
		System.out.println("要素数:"+nums.size());
		System.out.print("要素:");
		for(int i=0;i<nums.size();i++){
			System.out.print(nums.get(i)+",");
		}
		System.out.println();
	}
}
