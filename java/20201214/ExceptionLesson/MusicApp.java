import java.util.*;
public class MusicApp{
	public static void main(String[]args){
		Set<String> whiteList=new HashSet<>();
		whiteList.add("mp3");
		whiteList.add("wav");
		whiteList.add("ogg");
		whiteList.add("aiff");
		Scanner sc=new Scanner(System.in);
		String fileName="";
		while(true){
			System.out.print("音楽ファイル名>");
			fileName=sc.next();
			if(!fileName.contains(".")){
				System.out.println("終了します");
				break;
			}
			int lastIndex=fileName.lastIndexOf(".");
			//.以降の文字を取得↓
			String ext=fileName.substring(lastIndex+1);
			try{
				if(whiteList.contains(ext)){
					System.out.println(fileName+"を再生します");
				}else{
					throw new UnsupportedMusicFileException("未対応のファイルです");
				}
			}catch(UnsupportedMusicFileException e){
				System.out.println(e.getMessage());
			}
		}
	}
}

class UnsupportedMusicFileException extends Exception{
	public UnsupportedMusicFileException(String msg){
		super(msg);
	}
}
