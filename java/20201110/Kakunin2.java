import java.util.*;
public class Kakunin2{
	public static void main(String[] args){
		int[] nums1=new int[5];
		System.out.println("***nums1***");
		for(int i=0;i<nums1.length;i++){
			int num=new Random().nextInt(100)+1;
			nums1[i]=num;
			System.out.println(nums1[i]);
		}
		System.out.println("***num2***");
		int[] nums2=new int[5];
		for(int i=0;i<nums2.length;i++){
			nums2[i]=nums1[i]*3;
			System.out.println(nums2[i]);
		}
	}
}
