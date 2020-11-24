public class Ex5_2{
	public static void main(String[] args){
		String title="例の件";
		String addres="xxx@gmail.com";
		String text="よろしくお願いします";
		email(title,addres,text);
		System.out.println();
		email(addres,text);
	}
	static void email(String title,String address,String text){
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
	static void email(String address,String text){
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}
}
