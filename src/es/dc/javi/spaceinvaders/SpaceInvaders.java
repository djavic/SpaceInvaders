package es.dc.javi.spaceinvaders;

import javax.swing.*;
import java.awt.*;


public class SpaceInvaders {

	
	public static void main(String[] args) {
		
		
		//Creamos el marco
		JFrame frame = new JFrame("Space Invaders");
		frame.add(new Pantalla()); //Llamamos a pantalla para rellenar el marco
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
