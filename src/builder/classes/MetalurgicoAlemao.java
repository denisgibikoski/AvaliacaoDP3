package builder.classes;

import builder.interfaces.Carro;

public class MetalurgicoAlemao {

    private CarBuilder carBuilder;

    public MetalurgicoAlemao(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Carro constroiCarro() {
        this.carBuilder.buildModelo("BMW");
        this.carBuilder.buildMotor("Aluminio");
        this.carBuilder.buildPneu("Silicone");
        Carro carro = carBuilder.getCarro();
        return carro;
    }

}