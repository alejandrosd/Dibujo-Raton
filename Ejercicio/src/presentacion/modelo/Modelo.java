/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import java.awt.Graphics;
import logica.Cabeza;
import logica.Circulo;
import logica.Parte;
import preseentacion.vistas.VentanaPrincipal;

/**
 *
 * @author estudiantes
 */
public class Modelo {
    private VentanaPrincipal ventana;
    Cabeza oso ;
    Graphics pincel;
    
    public VentanaPrincipal getVentanaPrincipal() {
        if (ventana == null) {
            ventana = new VentanaPrincipal(this);
        }
        return ventana;
    }
    
    public void iniciar() {
        getVentanaPrincipal();
        ventana.setVisible(true);
    }
    
    public void dibujar() {
        pincel = ventana.getCanvas1().getGraphics();
        
        oso = new Cabeza();
        oso.addPart(new Parte("c"));
        oso.addPart(new Parte("oi"));
        oso.addPart(new Parte("oi1"));
        oso.addPart(new Parte("od"));
        oso.addPart(new Parte("od1"));
        oso.addPart(new Parte("oji"));
        oso.addPart(new Parte("oji1"));
        oso.addPart(new Parte("ojd"));
        oso.addPart(new Parte("ojd1"));
        oso.addPart(new Parte("n"));
        oso.addPart(new Parte("n1"));
        
        oso.dibujar(pincel, 0, 0);
    }
}
