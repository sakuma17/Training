import java.util.*;
public class SetTest{
	public static void main(String[]args){
		String str="赤,青,黄,青,緑,緑,黒,白,青,ピンク,黄緑,白";
		String[] colors0=str.split(",");
		//listからset生成
		//Set<String> colors=new HashSet<>(Arrays.asList(colors0));
		Set<String> colors=new LinkedHashSet<>();
		for(int i=0;i<colors0.length;i++){
			colors.add(colors0[i]);
		}
		System.out.println("色は"+colors.size()+"種類です");
		if(colors.contains("黒")){
			System.out.println("黒が含まれています");
		}else{
			System.out.println("黒は含まれていません");
		}
		//setからlistを生成
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(0));
	}
}
