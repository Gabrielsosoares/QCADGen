/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qca.generator;

/**
 *
 * @author Gabriel Soares
 */
public class Fixed extends Cell {
    private int polarization;

    public Fixed(int x, int y, int pol){
        super(x, y, Cell.fixed);
        this.polarization = pol;
    }
    
}
