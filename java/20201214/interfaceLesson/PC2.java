import java.util.*;
public class PC2{
	private App currentApp;
	private List<App> appList=new ArrayList<>();
	private UsbConnectable device();
	public PC2(){
		super();
	}
	public void addAppli(App2 app){
		this.appList.add(app);
	}
	public void selectApp(){
		if(appList.isEmpty()){
			System.out.println("アプリはインストールされていません");
			return;
		}
		for(int i=0;i<appList.size();i++){
			System.out.printf("%d...%s%n",i,appList.get(i).name);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("index>");
		int index=sc.nextInt();
		this.setApp(appList.get(index));
		this.execApp();
	}
	public void execApp(){
		this.currentApp.doApp();
	}
	public void setApp(App2 app){
		this.app=currentApp;
	}
	public void usb(){
		this.device.usbConnect();
	}
	public void setDevice(UsbConnectable device){
		this.device=device;
	}
}
