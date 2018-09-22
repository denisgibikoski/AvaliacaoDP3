/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaodp3;

import state.classes.NaoVoar;
import state.classes.Pato;
import builder.classes.CarBuilder;
import builder.classes.MetalurgicoAlemao;
import builder.classes.MetalurgicoBrasileiro;
import builder.interfaces.Carro;
import builder.interfaces.CarroBuilder;
import prototype.classes.GolLuxo;
import prototype.classes.GolStandard;
import prototype.interfaces.Gol;

/**
 *
 * @author denis
 */
public class AvaliacaoDP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Padrao de Builder
        System.out.println("\n------------Padrao de Builder--------------");
        CarroBuilder carroBuilder = new CarBuilder();

        MetalurgicoBrasileiro metalurgicoBrasileiro = new MetalurgicoBrasileiro((CarBuilder) carroBuilder);
        Carro carroBrasileiro = metalurgicoBrasileiro.constroiCarro();
        System.out.println(carroBrasileiro);

        MetalurgicoAlemao metalurgicoAlemao = new MetalurgicoAlemao((CarBuilder) carroBuilder);
        Carro carroAlemao = metalurgicoAlemao.constroiCarro();
        System.out.println(carroAlemao);

        //Padaro de ProtoType
        System.out.println("\n------------Padrao de ProtoType--------------");
        String nome = "revendedor de automóveis VW";
        
        Gol golL = new GolLuxo();
        System.out.println("Veiculo de Mostrosario" + golL);
        
        Gol clone1 = (Gol) golL.clone();
        System.out.println("Vendendo do Estoque" + clone1);
        
        Gol golS = new GolStandard();
        System.out.println("Veiculo de Mostrosrio" + golS);
        
        Gol clone2 = (Gol) golS.clone();
        System.out.println("Vendendo do Estoque" + clone2);
        
        
        //Padrao States
        Pato p = new Pato();

        //Altera o comportamento de Voar() para NaoVoar() com a nova chamada.
        p.setComportamentoVoar(new NaoVoar());

        p.voar();
        p.grasnar();
    }

}
