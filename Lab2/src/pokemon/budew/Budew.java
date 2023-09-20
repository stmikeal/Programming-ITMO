package pokemon.budew;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.budew.*;

public class Budew extends Pokemon{
	public Budew(){
		this("Pokemon",1);
	}
	public Budew(java.lang.String name, int level){
		super(name, level);
		this.setType(Type.GRASS,Type.POISON);
		this.setStats(40D,30D,35D,50D,70D,55D);
		this.setMove(new MegaDrain(), new Confide());
	}
}
