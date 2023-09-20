package attack.seviper;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove{

	public ScaryFace(){
		super(Type.NORMAL,0D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPEED, -2);
	}
	
	@Override
	public String describe(){
		return "применяет Scary Face";
	}
}
