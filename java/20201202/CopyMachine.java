public class CopyMachine{
	int paper;

	public CopyMachine(int sheet){
		this.paper=sheet>0? sheet:0;
	}
	public void feedPaper(int sheet){
		if(sheet<=0){
			System.out.println("給紙しませんでした。");
			return;
		}
		this.paper+=sheet;
		System.out.println(sheet+"枚給紙しました。");
	}
	public void copy(int sheet){
		if(sheet<=0){
			System.out.println("コピーしませんでした。");
			return;
		}
		if(this.paper==0){
			System.out.println("コピー用紙がありません。");
			return;
		}
		if(this.paper<sheet){
			System.out.println(this.paper+"枚コピーしました。");
			this.paper=0;
		}else{
			this.paper-=sheet;
			System.out.println(sheet+"枚コピーしました。");
		}
	}
	public void display(){
		System.out.println("コピー可能な枚数は"+this.paper+"枚です。");
	}
}
