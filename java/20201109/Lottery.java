public class Lottery{
	public static void main(String[] args){
		int total=0;
		String money="";
		for(int i=0;i<3;i++){
			System.out.println(i+1+"回目");
			int num=new java.util.Random().nextInt(100)+1;
			if(num<=1){
				total+=10000000;
				money ="1000万円";
			}else if(num<=3){
				total+=1000000;
				money ="100万円";
			}else if(num<=6){
				total+=100000;
				money ="10万円";
			}else if(num<=10){
				total+=10000;
				money ="1万円";
			}else if(num<=20){
				total+=1000;
				money ="1000円";
			}else if(num<=40){
				total+=100;
				money ="100円";
			}else{
				money="ハズレ";
			}
			System.out.println(num);
			System.out.println(money);
		}
		System.out.printf("獲得賞金は%,d円でした！%n",total);
	}
}
