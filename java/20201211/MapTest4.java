import java.util.*;
public class MapTest4{
	public static void main(String[]args){
		Random rand=new Random();
		Map<Integer,Integer>map=new TreeMap<>();
		int compCount=0;
		int numCount=0;
		final int TRIAL_NUM=500;
		while(compCount<TRIAL_NUM){
			numCount=0;
			Set<Integer>dices=new HashSet<>();
			while(true){
				numCount++;
				dices.add(rand.nextInt(6)+1);
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
		int n=0;
		for(int i:map.keySet()){
			n=i;
		}
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
		ave/=TRIAL_NUM;
		/*
		int blankCount=0;
		for(int i=1;i<=n;i++){
			if(!map.containsKey(i)){
				blankCount+=1;
			}
		}
		System.out.println(map.size()+blankCount);
		*/
		System.out.printf("コンプ平均値:%d円%n",ave);
		System.out.printf("モード(最頻値):%d回(%d円)%n",mode,mode*300);
	}
}
