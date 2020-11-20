public class MethodLesson1{
	static void eat(){
		System.out.println("モグモグ");
		System.out.println("ゴクゴク");
	}
	public static void main(String[] args){
		/*System.out.print("あなたの名前を入れてください>");
		String name=new java.util.Scanner(System.in).nextLine();
		hello(name);*/
		System.out.print("数字を入れてください>");
		int num=new java.util.Scanner(System.in).nextInt();
		oddEven(num);
		/*hello("田中");
		hello("佐藤");
		eat();
		bye();*/
	}
	static void hello(String name){
		System.out.println(name+"さん、Hello");
	}
	static void oddEven(int n){
		System.out.printf("%dは%sです%n",n,n%2==0?"偶数":"奇数");
		/*if(n%2==0){
			System.out.println(n+"は偶数です");
		}else{
			System.out.println(n+"は奇数です");
		}*/
	}
	static void bye(){
		System.out.println("Bye");
	}
}
