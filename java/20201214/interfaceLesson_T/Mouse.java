public class Mouse implements UsbConnectable{
	//オーバーライドではアクセス修飾子を同等以下にしか設定できない
	//そのためインターフェイスの実装はpublicの表記が必須
	@Override
	public void usbConnect(){
		System.out.println("USB接続にてマウス操作ができます。");
	}
}
