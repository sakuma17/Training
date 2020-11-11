import java.util.*;
public class T1043{
	public static void main(String[] args){
		int[] box=new int[100];
		for(int i=0;i<box.length;i++){
			int num=new Random().nextInt(100);
			System.out.print(num+",");
			box[i]=num;
		}
		System.out.println();
		int target=77;
		int i=0;
		for(;i<box.length;i++){
			if(box[i]==target){
				System.out.printf("最初の%dのindexは%dです。",target,i);
				break;
			}
		}
		if(i==box.length){
			System.out.println("77はありませんでした。");
		}
	}
}
