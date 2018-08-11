package es.dc.javi.spaceinvaders;

import java.awt.Graphics2D;

public class Nave {

	int x = 0;
	int y = 0;
	private Juego juego;

	public Nave(Juego juego) {
		this.juego = juego;
	}

	public void move() {

		x = x + 1;
		y = y + 1;
	}

	public void paint(Graphics2D g) {

		g.fillOval(x, y, 30, 30);
	}

}
