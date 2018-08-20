package es.dc.javi.spaceinvaders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//@SuppressWarnings("serial")

public class Juego extends JPanel {

	Nave nave = new Nave(this);
	Disparo disparo = new Disparo(this);
	private Image fondo;
	

	public Juego() {

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				nave.keyReleased(e); // Le decimos a nave que se ha soltado una tecla
				disparo.keyReleased(e); // Le decimos a disparo que se ha soltado una tecla
			}

			@Override
			public void keyPressed(KeyEvent e) {
				nave.keyPressed(e);// Le decimos a nave que alguien toco una tecla
				disparo.keyPressed(e); //LE decimos cuadno disparar

			}

		});

		setFocusable(true);

	}

	public void move() { // Metodo que llama al metodo de moverse la de la nave
		nave.move();
		disparo.moveApuntado();
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

		g2d.drawImage(fondo, 0, 0, null);// Pintamos el fondo

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);// Suaviza los
																									// bordes(En este
																									// caso al ser
																									// pixelPaint no es
																									// necesario)
		
		nave.paint(g2d); // Pintamos la nave llamando al metodo paint de nave
		

	}
}
