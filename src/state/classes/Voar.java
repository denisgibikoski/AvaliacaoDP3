package state.classes;

import states.interfaces.Comportamento;


public class Voar extends Comportamento{
	public void exec() {
		System.out.println("Esta ave voa!");
	}
}
