public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	static void introduceOneself(){
		String name="山田";
		int age=20;
		double height=153.2;
		char zodiac='辰';
		System.out.printf("%s(%d),身長:%.1fcm,十二支:%s%n",name,age,height,zodiac);
	}
}
