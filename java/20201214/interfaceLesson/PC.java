import java.util.*;
public class PC{
	UsbConnectable device;
	public int execApp(){
		System.out.print("どのアプリを実行しますか 0.エクセル、1.ワード、2.パワポ>");
		int index=new Scanner(System.in).nextInt();
		return index;
	}
	public void usb(){
		this.device.usbConnect();
	}
	public void setDevice(UsbConnectable device){
		this.device=device;
	}
}
