package builder.classes;

import builder.interfaces.Carro;





public class MetalurgicoBrasileiro {

    private CarBuilder carBuilder;

    public MetalurgicoBrasileiro(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Carro constroiCarro() {
        this.carBuilder.buildModelo("Gol");
        this.carBuilder.buildMotor("Aço");
        this.carBuilder.buildPneu("Borracha natural");
        Carro carro = carBuilder.getCarro();
        return carro;
    }

}
