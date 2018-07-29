package es.dc.javi.spaceinvaders;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class PantallaInicio extends JFrame {

	public PantallaInicio() {

		Toolkit mipantalla = Toolkit.getDefaultToolkit();// Guardado sistema de vemtanas nativo
		Dimension tamanioPantalla = mipantalla.getScreenSize();// Guardado la dimension de mi pantalla
		int alturaPantalla = tamanioPantalla.height;// alto
		int anchoPantalla = tamanioPantalla.width;// ancho
		setLocation(anchoPantalla / 4, alturaPantalla / 32);// Marco centrado

		setSize(700, 700);
		setResizable(false);// No dejamos poner en pantalla completa
		setTitle("Space Invaders");

		Image miIcono = mipantalla.getImage("imagenes/icono.png");//Guardar direcion Icono
		setIconImage(miIcono);//Poner Icono

	}

	@Override
	public void paint(Graphics g) {

		super.paintComponents(g);// LLamamos al metodo paintComponents

		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d

		File miFondo = new File("imagenes/fondoInicio.png");// Cogemos la ruta de la imagen

		try {
			fondo = ImageIO.read(miFondo); // guardamos la imagen en la variable
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}

		g2d.drawImage(fondo, 0, 0, null);

	}

	private Image fondo;
}
