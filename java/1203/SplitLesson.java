import java.util.*;
public class SplitLesson{
	public static void main(String[]args){
		String str="りんご,みかん,ばなな";//CSVデータ:カンマ区切りデータ
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
	}
}
