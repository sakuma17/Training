public class Hero extends Object{
	String name;
	int hp;
	@Override
	public String toString(){
		return "名前:"+this.name+"/HP:"+this.hp;
	}
	@Override
	public boolean equals(Object o){
		if(this==o){return true;}
		//↑同じ住所だったらtrueを返す処理
		if(o instanceof Hero){
			//Heroクラスにキャスト可能ならこのifを通る
			Hero h=(Hero)o;
			if(this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}
}
