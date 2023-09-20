package attack.doduo;

import ru.ifmo.se.pokemon.*;

public class TriAttack extends SpecialMove{

	public TriAttack(){
		super(Type.NORMAL,80D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		if (Math.random()>0.8) {Effect.paralyze(p);}
		else {super.applyOppEffects(p);}
	}
	
	@Override
	public String describe(){
		return "применяет Tri Attack";
	}
}
