package es.dc.javi.spaceinvaders;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Nave {
	

	int x = 0; //posicion inicial en x
	int xa = 0; // 0-quieto  + - derecha  - - izquierda
	private Juego juego;
	private Image naveImagen;//Imagen de la nave principal

	public Nave(Juego juego) { //Constructor de la copia
		this.juego = juego;
	}

	public int move() {

		x = x + xa; //Movimiento de la nave
		
		System.out.println("Posicion de la nave : " + x);
		return x;
		
	}

	public void paint(Graphics2D g) {
		
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d
		
		File nave = new File("imagenes/nave.png"); //Accedemos a la imagen
		
		try {
			naveImagen = ImageIO.read(nave); // guardamos la imagen en la variable
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");//Capturamos la excepcion
		}
		g2d.drawImage(naveImagen, x, 630, null);//Pintamos la imagen
	}

	public void keyReleased(KeyEvent e) { //Hemos soltado la tecla

		if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_A ) {
			xa = 0; //Velocidad con la que se mueve
		}
	}

	public void keyPressed(KeyEvent e) { //Presionamos la tecla
	
		if(e.getKeyCode() == KeyEvent.VK_D) {
			xa = 3; //Velocidad con la que se mueve
		}else if(e.getKeyCode() == KeyEvent.VK_A) {
			xa = -3;
		}	
	}
}
