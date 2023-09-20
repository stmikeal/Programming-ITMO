package attack.seviper;

import ru.ifmo.se.pokemon.*;

public class Lick extends SpecialMove{

	public Lick(){
		super(Type.GHOST,0D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		if (Math.random()>0.7) {Effect.paralyze(p);}
		else {super.applyOppEffects(p);}
	}
	
	@Override
	public String describe(){
		return "применяет Lick";
	}
}
