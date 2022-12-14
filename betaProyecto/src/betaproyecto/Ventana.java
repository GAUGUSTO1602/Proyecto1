/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package betaproyecto;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *Ventana crea la ventana en donde se mostrara de forma grafica el laberinto generado
 * @author Gabriel González
 */
public class Ventana extends JPanel {
    private Laberinto laberinto;

    /**
     *
     * @param lab
     */
    public Ventana(Laberinto lab){
        laberinto = lab;

    }

    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
    }

    /**
     *Crea la venta en donde se mostrara el laberinto
     * @param ven
     * @param marco
     * @param mLista
     * @param Ancho
     * @param Largo
     */
    public void crearVentana(Ventana ven, Lista marco, Lista mLista, Integer Ancho, Integer Largo){
        JFrame miVentana = new JFrame("Laberinto");
        miVentana.add(ven);
        miVentana.setSize(900, 750);
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
        Opciones venOpciones = new Opciones(miVentana, marco, mLista, Ancho, Largo);
        venOpciones.setVisible(true);
        venOpciones.setLocation(750, 0);
        venOpciones.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    
}
