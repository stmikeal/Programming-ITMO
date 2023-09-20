package assembly;

import ru.ifmo.se.pokemon.*;
import pokemon.seviper.*;
import pokemon.doduo.*;
import pokemon.budew.*;

public class BattleGround{
	public static void main(String[] args){
		Battle b = new Battle();
		try {
			Pokemon p1 = new Seviper("Чип", 27);
			Pokemon p2 = new Roselia("Дейл", 13);
			Pokemon p3 = new Doduo("Марио", 15);
			Pokemon p4 = new Roserade("Луиджи", 22);
			b.addAlly(p1);
			b.addFoe(p3);
			b.addAlly(p2);
			b.addFoe(p4);
			b.go();
		}
		catch(NullPointerException e) {
			System.out.println("Кажется, у вас какие-то проблемы...");
			System.out.println("Попробуйте проверить состав команд и собрать проект заново.");
		}
	}
}
