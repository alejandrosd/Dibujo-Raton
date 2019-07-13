/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author estudiantes
 */
public class Parte implements Circulo {

    String tipoParte;

    public Parte(String tipoParte) {
        this.tipoParte = tipoParte;
    }

    @Override
    public void dibujar(Graphics lapiz, int posX, int posY) {
        //lapiz.drawOval(posX, posY, posY, posY);
        lapiz.setColor(Color.black);
        if (tipoParte.equals("c")) {
            posX = 25;
            posY = 25;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 150, 150);

        } else if (tipoParte.equals("oi")) {
            posX = 0;
            posY = 0;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 50, 50);
        } else if (tipoParte.equals("oi1")) {
            posX = 20;
            posY = 20;

            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 25, 25);
        } else if (tipoParte.equals("od")) {
            posX = 150;
            posY = 0;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 50, 50);
        } else if (tipoParte.equals("od1")) {
            posX = 155;
            posY = 20;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 25, 25);
        } else if (tipoParte.equals("oji")) {
            posX = 50;
            posY = 50;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 50, 50);
        } else if (tipoParte.equals("oji1")) {
            posX = 72;
            posY = 72;
            System.out.println("entro" + posX);
            lapiz.setColor(Color.black);
            lapiz.fillOval(posX, posY, 25, 25);
        } else if (tipoParte.equals("ojd")) {

            posX = 100;
            posY = 50;
            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 50, 50);
        } else if (tipoParte.equals("ojd1")) {

            posX = 104;
            posY = 72;
            System.out.println("entro" + posX);
            lapiz.setColor(Color.black);
            lapiz.fillOval(posX, posY, 25, 25);
        } else if (tipoParte.equals("n")) {
            posX = 75;
            posY = 95;

            System.out.println("entro" + posX);
            lapiz.drawOval(posX, posY, 50, 50);
        } else if (tipoParte.equals("n1")) {
            posX = 88;
            posY = 112;

            System.out.println("entro" + posX);
            lapiz.setColor(Color.black);
            lapiz.fillOval(posX, posY, 25, 25);
        }

    }

}
