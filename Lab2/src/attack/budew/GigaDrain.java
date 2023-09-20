package attack.budew;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove{

	public GigaDrain(){
		super(Type.GRASS,75D,1D);
	}
	
	@Override
	public void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP,2);
	}
	
	@Override
	public String describe(){
		return "применяет Giga Drain";
	}
}
