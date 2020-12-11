import java.util.*;
public class MapTest4{
	public static void main(String[]args){
		Random rand=new Random();
		Map<Integer,Integer>map=new TreeMap<>();
		int compCount=0;
		while(compCount<500){
			int numCount=0;
			Set<Integer>dices=new HashSet<>();
			while(true){
				numCount++;
				int num=rand.nextInt(6)+1;
				dices.add(num);
				if(dices.size()==6){
					if(!map.containsKey(numCount)){
						map.put(numCount,1);
					}else{
						map.put(numCount,map.get(numCount)+1);
					}
					compCount++;
					break;
				}
			}
		}
		System.out.println("***結果***");
		int n=50;
		for(int i=1;i<=n;i++){
			System.out.printf("%d(%d):",i,300*i);
			if(map.containsKey(i)){
				for(int j=0;j<map.get(i);j++){
					System.out.print('*');
				}
			}
			System.out.println();
		}
		int ave=0;
		int max=0;
		int mode=0;
		for(int key:map.keySet()){
			ave+=key*300*(map.get(key));
			if(map.get(key)>max){
				max=map.get(key);
				mode=key;
			}
		}
		ave=ave/500;
		System.out.printf("コンプ平均値:%d円%n",ave);
		System.out.println(max);
		System.out.printf("モード(最頻値):%d回(%d円)%n",mode,mode*300);
	}
}
