package es.dc.javi.spaceinvaders;

import javax.swing.*;
import java.awt.*;


public class SpaceInvaders {

	
	public static void main(String[] args) {
		
		PantallaInicio init = new PantallaInicio();
		
		init.setVisible(true);
		
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		//Creamos el marco
		JFrame frame = new JFrame("Space Invaders");
		frame.add(new PantallaInicio()); //Llamamos a pantalla para rellenar el marco
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		

	}

}
