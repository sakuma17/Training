import java.util.*;
public class ArrLesson2{
	public static void main(String[] args){
		int[][] data1={
			{15,34,12},
			{1,3,4,12},
			{12,34},//配列の最後にカンマが付いていてもOK
		};
		System.out.println(data1[1][2]);//4
		int[][] data2=new int[3][];
		data2[0]=new int[]{15,34,12,};
		data2[1]=new int[]{24,81,12,3};
		data2[2]=new int[]{34,6,8};
		System.out.println(data2[2][1]);
	}
}
