package attack.doduo;

import ru.ifmo.se.pokemon.*;

public class FuryAttack extends PhysicalMove{

	public FuryAttack(){
		super(Type.NORMAL,15D,0.85D,1,(int)Math.floor(Math.random()*4+2));
	}
	
	@Override
	public String describe(){
		return "применяет Fury Attack";
	}
}
