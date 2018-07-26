package es.dc.javi.spaceinvaders;

import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;



public class Pantalla extends JPanel {
	
	public Pantalla() {
		
		
		
	}


		@Override
		public void paint(Graphics g) {
			
			super.paintComponents(g);//LLamamos al metodo paintComponents
		
			g.drawString("HOLA MUNDO", 100, 100);//DibujarTexto
			
		}
	}


