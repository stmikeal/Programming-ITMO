package pokemon.budew;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.budew.*;

public class Roselia extends Pokemon{
	public Roselia(){
		this("Pokemon",1);
	}
	public Roselia(java.lang.String name, int level){
		super(name, level);
		this.setType(Type.GRASS,Type.POISON);
		this.setStats(50D,60D,45D,100D,80D,65D);
		this.setMove(new MegaDrain(), new Confide(), new GigaDrain());
	}
}
