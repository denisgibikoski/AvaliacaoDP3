/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.interfaces;

/**
 *
 * @author denis
 * @param <T>
 */
public interface Gol<T> {
    
    void getMotor();
    void getPneu();
    T clone();
    
}
