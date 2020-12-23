package monsters_run;

public class DeathBat extends Monster{
	public DeathBat(String name) {
		super(name);
	}

	@Override
	public String run() {
		return this.name+"はバサバサ飛んで逃げ出した" ;
	}
}