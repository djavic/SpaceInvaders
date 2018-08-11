package es.dc.javi.spaceinvaders;

/*
 * 			TAREAS

 */

import javax.swing.*;
import java.awt.*;


public class SpaceInvaders {

	/*
	public static void main(String[] args) {
		
		PantallaInicio init = new PantallaInicio();
		
		init.setVisible(true);
		
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	*/
	
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("Space Invaders");
		Juego juego = new Juego();
		frame.add(juego);
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();// Guardado sistema de vemtanas nativo
		Dimension tamanioPantalla = mipantalla.getScreenSize();// Guardado la dimension de mi pantalla
		int alturaPantalla = tamanioPantalla.height;// alto
		int anchoPantalla = tamanioPantalla.width;// ancho
		frame.setLocation(anchoPantalla / 4, alturaPantalla / 32);// Marco centrado
		
		frame.setSize(700, 700);
		frame.setResizable(false);// No dejamos poner en pantalla completa
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image miIcono = mipantalla.getImage("imagenes/icono.png");// Guardar direcion Icono
		frame.setIconImage(miIcono);// Poner Icono
		
		while (true) { //Loop del juego
			juego.move();
			juego.repaint();
			Thread.sleep(10);
		}
	}
}
