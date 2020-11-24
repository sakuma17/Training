public class Ex5_4{
	public static void main(String[]args){
		double bottom=10.0;
		double height=5.0;
		double tArea=calcTriangleArea(bottom,height);
		System.out.printf("三角形の底辺の長さが%.1fcm、高さが%.1fcmの場合、面積は%.1fc㎡%n",bottom,height,tArea);
		double radius=5.0;
		System.out.printf("円の半径が%.1fcmの場合、面積は%.1fc㎡%n",radius,calcCircleArea(radius));
	}
	static double calcTriangleArea(double b,double h){
		return b*h/2;
	}
	static double calcCircleArea(double r){
		return r*r*3.14;
	}
}
