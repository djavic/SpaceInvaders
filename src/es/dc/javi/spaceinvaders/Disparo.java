package es.dc.javi.spaceinvaders;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sun.awt.RepaintArea;

public class Disparo extends JPanel {

	private Juego juego;
	int y = 300;
	int ya = 0; // Velocidad del disparo
	private Image imagenDisparo;
	

	public Disparo(Juego juego) {
		this.juego = juego;

	}

	public void move() {
		y = y + ya;
	}

	public void paint(Graphics g) {

		Graphics2D gd2 = (Graphics2D) g;

		File disparo = new File("imagenes/disparo.png");

		try {
			imagenDisparo = ImageIO.read(disparo);
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}
	}

	public void keyReleased(KeyEvent e) {
		

		if (e.getKeyCode() == KeyEvent.VK_W) {

			loop(false);
		}

	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {

			loop(true);
		}

	}
	
	private void loop(boolean flag) {
		
		while(flag) {
			
			move();
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
