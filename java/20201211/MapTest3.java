import java.util.*;
public class MapTest3{
	public static void main(String[]args){
		Random rand=new Random();
		Map<Integer,Integer>map=new TreeMap<>();
		for(int i=0;i<100;i++){
			int num=rand.nextInt(100)+1;
			if(map.containsKey(num)){
				int count=map.get(num)+1;
				map.put(num,count);
				//2行をまとめると
				//map.put(num,map.get(num)+1);
			}else{
				map.put(i,1);
			}
		}
		System.out.println("1~100の乱数を100回発生させたよ");
		System.out.println("***result***");
		System.out.printf("%d種類の数値が出ました。%n",map.size());
		for(int i=1;i<=100;i++){
			if(map.containsKey(i)){
				System.out.printf("%d…%d回%n",i,map.get(i));
			}
		}
	}
}
