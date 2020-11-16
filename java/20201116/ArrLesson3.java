import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		System.out.print("何クラス?>");
		int classNum=new Scanner(System.in).nextInt();
		int[][] datas=new int[classNum][];
		for(int i=0;i<datas.length;i++){
			System.out.printf("クラス%dは何人?>",i+1);
			int peopleNum=new Scanner(System.in).nextInt();
			datas[i]=new int[peopleNum];
			for(int j=0;j<datas[i].length;j++){
				System.out.printf("%d人目の点数は?>",j+1);
				datas[i][j]=new Scanner(System.in).nextInt();
			}
		}
		System.out.println("---結果---");
		for(int i=0;i<datas.length;i++){
			for(int j=0;j<datas[i].length;j++){
				System.out.printf("%4d",datas[i][j]);
			}
			System.out.println();
		}
	}
}
