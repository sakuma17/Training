import java.util.*;
public class Lesson5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int[] nums={10,20,30,40};
		while(true){
			System.out.print("index(qで終了)>");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("q")){
				System.out.println("終了");
				return;
			}
			try{
				int index=Integer.parseInt(str);
				System.out.println(nums[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error:数値は0~"+(nums.length-1)+"の範囲で入力してください");
			}catch(NumberFormatException e){
				System.out.println("error:1,2...のような数値で入力してください");
			}
		}
	}
}
