import java.util.*;
public class ArrayListLesson{
	public static void main(String[] args){
		ArrayList<String>names=new ArrayList<>();
		//ArrayList<参照型>のみ可
		names.add("John");
		names.add("Paul");
		names.add("George");

		System.out.println(names.get(0));//John
		System.out.println(names.size());//3

		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		for(String s:names){
			System.out.println(s);
		}
		names.remove(0);
		System.out.println(names.size());//2
		names.add(0,"John");//先頭に挿入
		names.set(2,"Ringo");//index2を書き換え
		if(names.contains("Paul")){
			System.out.println("Paulを含みます");
		}
		System.out.println("Paulのインデックスは"+names.indexOf("Paul"));
		names.clear();//全て削除
		if(names.isEmpty()){
			System.out.println("要素はありません");
		}

		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i:list){
			System.out.println(i);
		}
		//↓長さは2固定になるのでaddで要素を増やしていくことはできない
		List<String> list2=Arrays.asList("John","Paul");
		for(String i:list2){
			System.out.println(i);
		}
		//list2.add("George");←error
	}
}
