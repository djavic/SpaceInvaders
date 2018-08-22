package es.dc.javi.spaceinvaders;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemigos {

	private Juego juego;
	private Image enemigoImagen;

	int x = 100;
	int y = 100;
	int xa = 1;
	int ya = 0;

	private int velocidadX = 1;
	private int velocidadY = 1;

	public Enemigos(Juego juego) {
		this.juego = juego;
	}

	public void move() {

		if (x == 200) { // Paramos por la derecha y bajamos
			xa = 0;
			ya = 1;
			System.out.println("Bajando derecha " + xa);
		}

		if ((y == 150 || y == 250 || y == 350 ) && (x == 200)) { // paramos de bajar e izquierda
			ya = 0;
			xa = -1;
		}

		if (x == -8) { // Paramos por la izquierda y bajamos
			xa = 0;
			ya = 1;

			System.out.println("Bajando izquierda " + xa);

		}

		if ((y == 200 || y == 300 || y == 400) && (x == -8)) { // Paramos de bajar y
			ya = 0;
			xa = 1;
		}

		x += xa;
		y += ya;

		System.out.println("Posicion de los enemigos : " + x + ", " + y);

	}

	public void paint(Graphics2D g) {

		Graphics2D g2d = (Graphics2D) g;

		File nave = new File("imagenes/nave.png"); // Accedemos a la imagen

		try {
			enemigoImagen = ImageIO.read(nave); // guardamos la imagen en la variable
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");// Capturamos la excepcion
		}

		/**
		 * FILA 1
		 */

		g2d.drawImage(enemigoImagen, x, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 50, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 100, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 150, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 200, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 250, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 300, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 350, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 400, y, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 450, y, null);// Pintamos la imagen

		/**
		 * FILA 2
		 */

		g2d.drawImage(enemigoImagen, x + 50, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 100, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 150, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 200, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 250, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 300, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 350, y + 50, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 400, y + 50, null);// Pintamos la imagen

		/**
		 * FILA 3
		 */

		g2d.drawImage(enemigoImagen, x, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 50, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 100, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 150, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 200, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 250, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 300, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 350, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 400, y + 100, null);// Pintamos la imagen
		g2d.drawImage(enemigoImagen, x + 450, y + 100, null);// Pintamos la imagen

	}

}
