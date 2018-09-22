package builder.classes;



import builder.interfaces.CarroBuilder;
import builder.interfaces.Carro;

public class CarBuilder implements CarroBuilder {

    private String modelo;

    private String motor;

    private String pneu;

    @Override
    public void buildMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void buildPneu(String pneu) {
        this.pneu = pneu;
    }

    @Override
    public void buildModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public Carro getCarro() {
        return new Car(modelo, motor, pneu);
    }

}
