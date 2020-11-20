import java.util.*;
public class MethodLesson11{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
		System.out.print("どうする?1…三角形の面積を求める0…やめる>");
		int num=new Scanner(System.in).nextInt();
		triangleC(num);
	}
	static void triangleC(int n){
		if(n==1){
			System.out.print("底辺を入力してください>");
			double bottom=new Scanner(System.in).nextDouble();
			System.out.print("高さを入力してください>");
			double height=new Scanner(System.in).nextDouble();
			System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです%n",bottom,height,(bottom*height/2));
		}else{
			return;
		}
	}
}
