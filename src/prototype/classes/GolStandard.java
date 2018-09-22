/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.classes;

import prototype.interfaces.Gol;

/**
 *
 * @author denis
 */
public class GolStandard implements Gol<GolStandard> {

    @Override
    public GolStandard clone() {
        GolStandard gs = new GolStandard();
        gs.getMotor();
        gs.getPneu();

        return gs;

    }

    @Override
    public void getMotor() {
        System.out.println("Motor AP de 180HP");

    }

    @Override
    public void getPneu() {
        System.out.println("Pneus 13/175");
    }

}
