package attack.doduo;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove{

	public QuickAttack(){
		super(Type.NORMAL,40D,1D);
	}
	
	@Override
	public String describe(){
		return "применяет Quick Attack";
	}
}
