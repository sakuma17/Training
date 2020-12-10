import java.util.*;
public class SetTest1{
	public static void main(String[]args){
		String[] strArray = new String[]{
"emhjopwxaz",
"ykxfjihxvv",
"oqsuoeojku",
"stvzdzdplo",
"ftrmgkauna",
"ackzqxlchf",
"dqttpisosm",
"kfcrgfxenb",
"vwappsvdld",
"gvovlddccr",
"ybaoyevbsl",
"thhujdjaqk",
"luxrfzmlyz",
"zpewohxhvc",
"whcddsgogv",
"hzyjmgrbxw",
"mjmxnxawrw",
"hdndjktido",
"vymqiltdzq"
};
		Set<String> set=new TreeSet<>(Arrays.asList(strArray));
		System.out.println(set);
		/*
		Set<String> str=new TreeSet<>();
		for(String s:strArray){
			str.add(s);
		}
		*/

		/*
		for(String s:str){
			System.out.println(s);
		}
		*/
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(list.size()-1));

		//拡張for文では回しながらの削除はできない
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			if(s.startsWith("m")){
				it.remove();
			}
		}
		System.out.println(list);
	}
}
