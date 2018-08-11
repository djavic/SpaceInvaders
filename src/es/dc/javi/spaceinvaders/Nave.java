package es.dc.javi.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Nave {
	

	int x = 0;
	int y = 630;
	private Juego juego;
	private Image naveImagen;

	public Nave(Juego juego) {
		this.juego = juego;
	}

	public void move() {

		x = x + 1;
		
	}

	public void paint(Graphics2D g) {
		
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d
		
		File nave = new File("imagenes/nave.png");
		
		try {
			naveImagen = ImageIO.read(nave); // guardamos la imagen en la variable
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}

		g2d.drawImage(naveImagen, x, y, null);
	}

}
