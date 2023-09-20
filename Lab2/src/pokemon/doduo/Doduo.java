package pokemon.doduo;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.doduo.*;

public class Doduo extends Pokemon{
	public Doduo(){
		this("Pokemon",1);
	}
	public Doduo(java.lang.String name, int level){
		super(name, level);
		this.setType(Type.NORMAL,Type.FLYING);
		this.setStats(35D,85D,45D,35D,35D,75D);
		this.setMove(new QuickAttack(), new Growl(), new FuryAttack());
	}
}
