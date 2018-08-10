package es.dc.javi.spaceinvaders;

import javax.swing.JFrame;


public class Loop {

	
	public void movement() throws InterruptedException{
		
		JFrame frame = new JFrame("Mini Tennis");
		Juego juego = new Juego();
		frame.add(juego);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			juego.moveBall();
			System.out.println("gsdfsdfdsf");
			juego.repaint();
			Thread.sleep(10);
		}
	}

}
