package pokemon.doduo;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.doduo.*;

public class Dodrio extends Doduo{
	public Dodrio(){
		this("Pokemon",1);
	}
	public Dodrio(java.lang.String name, int level){
		super(name, level);
		this.setType(Type.NORMAL,Type.FLYING);
		this.setStats(60D,110D,70D,60D,60D,110D);
		this.setMove(new QuickAttack(), new Growl(), new FuryAttack(), new TriAttack());
	}
}
