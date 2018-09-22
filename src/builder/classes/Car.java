package builder.classes;

import builder.interfaces.Carro;

public class Car implements Carro{

    private String modelo;
    
    private String motor;

    private String pneu;

    public Car(String modelo, String motor, String pneu) {
        this.modelo = modelo;
        this.motor = motor;
        this.pneu = pneu;
    }

    @Override
    public String getMotor() {
        return this.motor = motor;
    }

    @Override
    public String getPneu() {
        return this.pneu = pneu;
    }

    @Override
    public String getModelo() {
        return this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro -> " + " modelo: " + modelo + ", motor: " + motor + ", pneu: " + pneu + '.';
    }
    
    

    
}
