import java.util.*;
public class Nomoto{
	public static void main(String[] args){
		String[] week={"月","火","水","木","金","土","日"};
		String[] sches=new String[7];
		for(int i=0;i<7;i++){
			System.out.printf("%s曜日の予定は>",week[i]);
			String sche=new Scanner(System.in).nextLine();
			sches[i]=sche;
		}
		int target=0;
		System.out.print("何曜日の予定が知りたいですか(例：木)>");
		String day=new Scanner(System.in).nextLine();
		for(int i=0;i<week.length;i++){
			if(week[i].equals(day)){
				target=i;
			}
		}
		System.out.printf("%s曜日の予定は%sです",week[target],sches[target]);
	}
}
