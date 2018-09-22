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

    private String motor = "Motor AP de 180HP";
    private String pneu = "Pneus 13/175";

    @Override
    public GolStandard clone() {
    
        GolStandard golStandard = new GolStandard();
        golStandard.toString();
        return  golStandard;
    
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("-----------------")
                .append("Veiculo Gol ")
                .append("\n")
                .append("com motor : " + this.motor)
                .append("\n")
                .append("com motor : " + this.pneu)
                .append("\n");

        return buffer.toString();

    }

    

}
