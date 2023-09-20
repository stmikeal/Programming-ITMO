package pokemon.budew;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.budew.*;

public class Roserade extends Pokemon{
	public Roserade(){
		this("Pokemon",1);
	}
	public Roserade(java.lang.String name, int level){
		super(name, level);
		this.setType(Type.GRASS,Type.POISON);
		this.setStats(60D,70D,65D,125D,105D,90D);
		this.setMove(new MegaDrain(), new Confide(), new GigaDrain(), new SludgeBomb());
	}
}
