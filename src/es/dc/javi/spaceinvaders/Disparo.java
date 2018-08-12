package es.dc.javi.spaceinvaders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Disparo extends JPanel {

	private Juego juego;
	private int x = -23;
	private int xa;
	private int y = 600;
	private Image disparoImagen;

	public Disparo(Juego juego) {

		this.juego = juego;

	}

	public void moveDisparado() {

		boolean flag = true;

		while (flag) {

			y = y - 1;
			
			if (y == 0) {
				flag = false;
			}
		}
	}

	public void moveApuntado() {
		x = x + xa; // Movimiento de apuntado
	}

	public void paint(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		File disparo = new File("imagenes/disparo.png");

		try {
			disparoImagen = ImageIO.read(disparo);
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}

		g2d.drawImage(disparoImagen, x, y, null);// Pintamos la imagen

		// g2d.fillOval(x, y, 30, 30);
	}

	public void keyReleased(KeyEvent e) { // Soltamos tecla

		if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_A) {
			xa = 0; // Velocidad con la que se mueve

		}

		if (e.getKeyCode() == KeyEvent.VK_W) {

			y = 600; // retornamos a la posiion inicia
		}

	}

	public void keyPressed(KeyEvent e) { // pulsamos tecla

		if (e.getKeyCode() == KeyEvent.VK_D) {
			xa = 3; // Velocidad con la que se mueve
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			xa = -3;
		}

		if (e.getKeyCode() == KeyEvent.VK_W) {

			moveDisparado(); // actualizamos la poscion
			repaint(); // Repintamos
		}

	}

}
