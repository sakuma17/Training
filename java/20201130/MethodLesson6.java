import java.util.*;
public class MethodLesson6{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("一文字入れてください");
		String s=scan.next();
		char c=s.charAt(0);
		System.out.println("幅を入れてください");
		int width=scan.nextInt();
		printSquare(c,width);
	}
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
