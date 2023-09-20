package attack.seviper;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove{

	public BrutalSwing(){
		super(Type.NORMAL,60D,1D);
	}
	
	@Override
	public String describe(){
		return "применяет Brutal Swing";
	}
}
