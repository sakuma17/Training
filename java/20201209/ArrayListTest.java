import java.util.*;
public class ArrayListTest{
	public static void main(String[]args){
		ArrayList<Integer> points=new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);
		int removed=points.set(3,50);//25,10,80,50,90
		//.setを代入すると変更前の値を戻り値として返す
		System.out.println(points.get(1));//10
		System.out.println(removed);//75
		for(int n:points){
			System.out.println(n);
		}
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		if(points.isEmpty()){
			//要素が空の場合この部分の処理がされる
		}
		if(points.contains(90)){
			//要素に90が含まれている場合この部分の処理がされる
		}
		System.out.println(points.indexOf(80));//2
		System.out.println(points.indexOf(1000));//-1
		//indexOfは引数が何番目の要素に入っているかを返す。ない場合は-1を返す。
		removed=points.remove(2);
		System.out.println("削除された値"+removed);
		points.clear();
		Integer i1=Integer.valueOf(16);
		int i2=i1.intValue();

		String s1=String.valueOf(16);
		int i3=Integer.parseInt(s1);
	}
}
