import java.io.*;
import java.util.*;
public class Lesson1{
	public static void main(String[] args) throws Exception{
		FileWriter fw =new FileWriter("data.txt",true);//第2引数trueで追記
		fw.write("hello!");
		fw.write(System.lineSeparator());
		fw.close();
	}
}
