import java.util.*;
public class SplitLesson{
	public static void main(String[]args){
		String str="りんご,みかん,ばなな";//CSVデータ:カンマ区切りデータ
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
		String str2="りんごとみかんとばななと桃";
		String[] data2=str2.split("と",3);
		System.out.println(Arrays.toString(data2));
		String str3="りんご,みかん,ばなな,,,,,";
		String[] data3=str3.split(",",-1);
		System.out.println(Arrays.toString(data3));
	}
}
