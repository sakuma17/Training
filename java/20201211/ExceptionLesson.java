import java.util.*;
public class ExceptionLesson{
	public static void main(String[]args){
		System.out.println("Start");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
