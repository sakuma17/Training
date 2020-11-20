import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("言葉1>");
		String wordA=new Scanner(System.in).nextLine();
		System.out.print("言葉2>");
		String wordB=new Scanner(System.in).nextLine();
		mojisuu(wordA,wordB);
	}
	static void mojisuu(String a,String b){
		int aLength=a.length();
		int bLength=b.length();
		/*前後合わせてif(a.length()==b.length())と書いてもOK*/
		if(aLength==bLength){
			System.out.println("引き分けです");
		}else{
			System.out.printf("%sの勝ちです",aLength>bLength?a:b);
		}
	}
}
