package es.dc.javi.spaceinvaders;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Juego extends JPanel {

	//private Image fondo;

	int x = 0;
	int y = 0;

	public void moveBall() {

		System.out.println(x + "," + y);
		x = x + 1;
		y = y + 1;
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);// Borrar la bola cuando cambia de posicion
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);// Suaviza los bordes																								// de la pelota
		g2d.fillOval(x, y, 30, 30);

	}
}
	
