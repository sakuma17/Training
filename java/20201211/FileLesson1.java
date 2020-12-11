import java.io.*;
import java.util.*;
public class FileLesson1{
	public static void main(String[]args) throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		List<String> list =new ArrayList<>();
		Map<String,Integer> person=new HashMap<>();
		Map<String,Integer> content=new HashMap<>();
		System.out.println("csvデータ");
		System.out.println("——————");
		while((line=br.readLine())!=null){
			System.out.println(line);
			String[] line0=line.split(",");
			//int price=Integer.parseInt(line0[2]);
			if(!person.containsKey(line0[0])){
				person.add(line0[0],Integer.parseInt(line0[2]));
			}else{
				person.add(line0[0],person.get(line0[0])+price);
			}
			if(!content.containsKey(line0[0])){
				content.add(line0[1],price);
			}else{
				content.add(line0[1],content.get(line0[1])+price);
			}
		}
		br.close();
		System.out.println();
		System.out.println("キャンプ会計");
		System.out.println("——————");
	}
}
