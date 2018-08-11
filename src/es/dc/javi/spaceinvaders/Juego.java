package es.dc.javi.spaceinvaders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Juego extends JPanel {

	Nave nave = new Nave(this);

	public void move() { // Metodo que llama al metodo de moverse la de la nave
		nave.move();
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);// Borrar la bola cuando cambia de posicion
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);// Suaviza los bordes
																									// // de la pelota

		nave.paint(g2d); // Pintamos la nave llamando al petodo paint de nave

	}
}
