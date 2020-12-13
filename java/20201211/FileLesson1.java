import java.io.*;
import java.util.*;
public class FileLesson1{
	public static void main(String[]args) throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		List<String> list =new ArrayList<>();
		Map<String,Integer> person=new LinkedHashMap<>();
		Map<String,Integer> item=new LinkedHashMap<>();
		System.out.println("csvデータ");
		System.out.println("——————------");
		int price=0;
		int totalPrice=0;
		while((line=br.readLine())!=null){
			System.out.println(line);
			String[] str=line.split(",");
			price=Integer.parseInt(str[2]);
			totalPrice+=price;
			if(!person.containsKey(str[0])){
				person.put(str[0],price);
			}else{
				person.put(str[0],person.get(str[0])+price);
			}
			if(!item.containsKey(str[1])){
				item.put(str[1],price);
			}else{
				item.put(str[1],item.get(str[1])+price);
			}
		}
		br.close();
		System.out.println();
		System.out.println("キャンプ会計");
		System.out.println("——————------");
		for(String s:item.keySet()){
			System.out.println(s+':'+item.get(s));
		}
		System.out.println("——————------");
		System.out.println("合計:"+totalPrice+"円");
		System.out.println();
		int avePrice=totalPrice/person.size();
		System.out.printf("個人別会計(一人あたり:%s円)%n",avePrice);
		System.out.println("——————------");
		int plusMinus=0;
		for(String s:person.keySet()){
			plusMinus=person.get(s)-avePrice;
			System.out.print(s);
			if(plusMinus>0){
				System.out.print('+');
			}
			System.out.println(plusMinus);
		}
	}
}
