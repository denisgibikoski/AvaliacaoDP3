package state.classes;

import states.interfaces.Comportamento;


public class NaoVoar extends Comportamento{
	public void exec() {
		System.out.println("Esta ave n�o voa :(");
	}
}
