package pokemon.seviper;

import java.lang.String;
import ru.ifmo.se.pokemon.*;
import attack.seviper.*;

public class Seviper extends Pokemon{
	public Seviper(){
		this("Pokemon",1);
	}
	public Seviper(java.lang.String name, int level){
		super(name, level);
		this.addType(Type.POISON);
		this.setStats(73D,100D,60D,100D,60D,65D);
		this.setMove(new PoisonJab(), new ScaryFace(), new Lick(), new BrutalSwing());
	}
}
