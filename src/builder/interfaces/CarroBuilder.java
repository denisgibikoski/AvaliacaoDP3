package builder.interfaces;

public interface CarroBuilder {

    public void buildMotor(String motor);

    public void buildPneu(String pneu);

    public void buildModelo(String modelo);
    
    public Carro getCarro();

}
