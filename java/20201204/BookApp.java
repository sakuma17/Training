import java.util.*;
public class BookApp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力してください>");
		int bookPage=sc.nextInt();
		System.out.print("本の価格を入力してください>");
		int bookPrice=sc.nextInt();
		Book book=new Book(bookPage,bookPrice);
		System.out.print("ノートのページ数を入力してください>");
		int notePage=sc.nextInt();
		System.out.print("ノートの価格を入力してください>");
		int notePrice=sc.nextInt();
		NoteBook notebook=new NoteBook(notePage,notePrice);
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					book.information();
					break;
				case 2:
					notebook.information();
					break;
				case 3:
					System.out.print("書き込む内容を入力してください>");
					String str=sc.nextLine();
					notebook.write(str);
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
