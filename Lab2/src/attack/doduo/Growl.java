package attack.doduo;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove{

	public Growl(){
		super(Type.NORMAL,0D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.setMod(Stat.ATTACK, -2);
	}
	
	@Override
	public String describe(){
		return "применяет Growl";
	}
}
