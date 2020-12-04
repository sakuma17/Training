public class NoteBook extends Book{
	String note="";
	public NoteBook(int page,int price){
		super(page,price);
	}
	@Override
	public void information(){
		super.information();
		System.out.println("内容:"+note);
	}
	public void write(String str){
		this.note+=str;
	}
}
