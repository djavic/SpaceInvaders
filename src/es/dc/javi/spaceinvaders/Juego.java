package es.dc.javi.spaceinvaders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Juego extends JPanel {

	Nave nave = new Nave(this);
	private Image fondo;

	public void move() { // Metodo que llama al metodo de moverse la de la nave
		nave.move();
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);// Borrar la bola cuando cambia de posicion
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d
		
		
		File miFondo = new File("imagenes/fondoInicio.png");// Cogemos la ruta de la imagen

		try {
			fondo = ImageIO.read(miFondo); // guardamos la imagen en la variable
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}

		g2d.drawImage(fondo, 0, 0, null);
		
		
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);// Suaviza los bordes
																									// // de la pelota

		nave.paint(g2d); // Pintamos la nave llamando al petodo paint de nave

	}
}
