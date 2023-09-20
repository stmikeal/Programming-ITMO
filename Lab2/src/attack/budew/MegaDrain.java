package attack.budew;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove{

	public MegaDrain(){
		super(Type.GRASS,40D,1D);
	}
	
	@Override
	public void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP,2);
	}
	
	@Override
	public String describe(){
		return "применяет Mega Drain";
	}
}
