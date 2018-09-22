package state.classes;

import states.interfaces.Comportamento;


public class NaoGrasnar extends Comportamento{
	public void exec() {
		System.out.println("Esta ave n�o grasna :(");
	}
}
