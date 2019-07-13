/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
    public class Cabeza implements Circulo{
    ArrayList<Circulo> partes = new ArrayList<Circulo>();
    
    int posXCabeza = 0;
    int posYCabeza = 0;
    
    public Cabeza() {
        
    }
        
    @Override
    public void dibujar(Graphics lapiz, int posX, int posY) {
        
        lapiz.setColor(Color.white);
        lapiz.fillRect(0, 0, 200, 200);
        
        for(int i = 0; i < partes.size(); i++) {
            partes.get(i).dibujar(lapiz, posX, posY);
        }
    }
    
    public void addPart(Circulo c){
        partes.add(c);
    }
    
}
