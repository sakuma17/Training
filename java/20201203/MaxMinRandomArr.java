import java.util.*;
public class MaxMinRandomArr{
	public static void main(String[] args){
		int[] arr=createRandomArr(1,9,3);
		//System.out.println(Arrays.toString(arr));
		showArr(arr);
		int[][] arr2=createRandomArr(1,9,3,2);
		/*for(int i=0;i<arr2.length;i++){
			System.out.println(Arrays.toString(arr2[i]));
		}*/
		showArr(arr2);
	}
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] RandomArr=new int[len];
		for(int i=0;i<RandomArr.length;i++){
			RandomArr[i]=rand.nextInt(max-min+1)+min;
		}
		return RandomArr;
	}
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		int[][] RandomArr=new int[len][childLen];
		for(int i=0;i<RandomArr.length;i++){
			RandomArr[i]=createRandomArr(min,max,childLen);
		}
		return RandomArr;
	}
	static void showArr(int[] arr){
		String str="{";
		for(int i=0;i<arr.length;i++){
			str+=arr[i]+",";
		}
		str=str.substring(0,str.length()-1);
		str+="}";
		System.out.println(str);
	}
	static void showArr(int[][] arr){
		System.out.println('{');
		for(int i=0;i<arr.length;i++){
			System.out.print(" ");
			showArr(arr[i]);
		}
		System.out.println('}');
	}
}
