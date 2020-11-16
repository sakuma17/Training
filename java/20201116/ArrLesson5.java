import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		System.out.println("---掛け算表---");
		System.out.print("n(1~9)?>");
		int num=new Scanner(System.in).nextInt();
		int[][] kuku=new int[num][9];
		for(int i=0;i<kuku.length;i++){
			for(int j=0;j<kuku[i].length;j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<kuku.length;i++){
			for(int j=0;j<kuku[i].length;j++){
				System.out.printf("%2d",kuku[i][j]);
				if(j<kuku[i].length-1){
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
}
