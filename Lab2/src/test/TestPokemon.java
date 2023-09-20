package test;

import ru.ifmo.se.pokemon.*;
import pokemon.seviper.*;
import pokemon.doduo.*;
import pokemon.budew.*;

public class TestPokemon{
	public static void main(String[] args){
		Battle b = new Battle();
		Pokemon p1 = new Roserade("Севайпер", 1);
		Pokemon p2 = new Pokemon("Хищник", 1);
		b.addAlly(p1);
		b.addFoe(p2);
		b.go();
	}
}
