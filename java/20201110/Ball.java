import java.util.*
public class Ball{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false,}:
		while(true){
			int index=new Random().nextInt(balls.length);
			if(isPicked[index]){
				continue;
			}
			System.out.println(balls[index]);
			isPicked[index]=true;
			break;
		}
	}
}
