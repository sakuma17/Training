import java.util.*;
public class Nakama{
	Random rand=new Random();
	Scanner scan=new Scanner(System.in);
	String[] stName={"HP","力","守り","魔力","素早さ","運"};
	String name;
	String job;
	int[] status={15,10,10,10,15,5,};

	public Nakama(String name,String job){
		this.name=name;
		this.job=job;
		this.jobStatus();
	}

	public  void firstStatus(){
		System.out.println();
		System.out.println(this.name+"("+this.job+")の初期ステータス");
		this.status();
		System.out.println();
	}
	
	public  void status(){
		for(int i=0;i<this.status.length;i++){
			System.out.print(this.stName[i]+':'+this.status[i]+' ');
		}
	}

	public void upStatus(){
		System.out.println();
		System.out.println("3回まで好きなステータスを強化できます");
		String str="(";
		for(int i=0;i<this.stName.length;i++){
			str+=this.stName[i]+"は"+(i+1)+",";
		}
		str=str.substring(0,str.length()-1);
		System.out.println(str+"で入力)");
		for(int i=3;i>0;i--){
			System.out.println();
			System.out.printf("どのステータスを強化しますか?[残り%d回]>",i);
			int index=scan.nextInt()-1;
			int upSt=rand.nextInt(3)+1;
			this.status[index]+=upSt;
			System.out.printf("%sが%d上がった!%n",stName[index],upSt);
		}	
	}

	public  void finalStatus(){
		System.out.println();
		System.out.println(this.name+"("+this.job+")が仲間になりました。");
		this.status();
		System.out.println();
	}

	public void jobStatus(){
	switch(job){
		case "戦士":
			status[0]=20;
			status[1]=15;
			status[2]=15;
			status[3]=5;
			status[4]=10;
			status[5]=0;
			break;
		case "魔法使い":
			status[0]=15;
			status[1]=0;
			status[2]=5;
			status[3]=30;
			status[4]=10;
			status[5]=5;
			break;
		case "遊び人":
			status[0]=15;
			status[1]=10;
			status[2]=0;
			status[3]=5;
			status[4]=15;
			status[5]=20;
			break;
		}
	}
}
