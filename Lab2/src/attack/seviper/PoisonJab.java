package attack.seviper;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove{

	public PoisonJab(){
		super(Type.POISON,80D,1D);
	}
	
	@Override
	public void applyOppEffects(Pokemon p){
		if (Math.random()>0.7) {Effect.poison(p);}
		else {super.applyOppEffects(p);}
	}
	
	@Override
	public String describe(){
		return "применяет Poison Jab";
	}
}
