package monsters_run;

public class Slime extends Monster{
	public Slime(String name) {
		super(name);
	}

	@Override
	public String run() {
		return this.name+"はさささっと逃げ出した" ;
	}
}