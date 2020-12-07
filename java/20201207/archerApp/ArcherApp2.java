import java.util.*;
public class ArcherApp2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Archer[] archers=new Archer[10];
		for(int i=0;i<archers.length;i++){
			archers[i]=new Archer();
		}
		System.out.print("アーチャー番号を入力(1~10):");
		int num=sc.nextInt();
		archers[num-1].shootArrow();
	}
}
