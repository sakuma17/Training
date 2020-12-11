import java.util.*;
public class MapTest2{
	public static void main(String[]args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> diceCount=new LinkedHashMap<>();
		for(int i=1;i<=6;i++){
			diceCount.put(i,0);
		}
		System.out.print("サイコロを何回振りますか?>");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int num=rand.nextInt(6)+1;
			int count=diceCount.get(num)+1;
			diceCount.put(num,count);
		}
		System.out.println("***result***");
		for(int key:diceCount.keySet()){
			System.out.println(key+"…"+diceCount.get(key)+"回");
		}
	}
}
