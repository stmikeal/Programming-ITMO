package attack.budew;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{

	public Confide(){
		super(Type.NORMAL,0D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -2);
	}
	
	@Override
	public String describe(){
		return "применяет Confide";
	}
}
