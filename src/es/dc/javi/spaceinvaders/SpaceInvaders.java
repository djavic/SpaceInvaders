package es.dc.javi.spaceinvaders;

/*
 * 			TAREAS
 * -REDIMENSIONAR BOTON INICIO
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
		JFrame frame = new JFrame("Mini Tennis");
		Juego juego = new Juego();
		frame.add(juego);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) { //Loop del juego
			juego.move();
			juego.repaint();
			Thread.sleep(10);
		}
	}

}
