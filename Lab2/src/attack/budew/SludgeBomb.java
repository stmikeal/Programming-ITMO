package attack.budew;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{

	public SludgeBomb(){
		super(Type.POISON,90D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		if (Math.random()>0.7) {Effect.poison(p);}
		else {super.applyOppEffects(p);}
	}
	
	@Override
	public String describe(){
		return "применяет Sludge Bomb";
	}
}
