package es.dc.javi.spaceinvaders;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import com.sun.prism.paint.Color;

import javafx.scene.layout.Border;

import java.awt.Event;

public class PantallaInicio extends JFrame implements ActionListener {

	private Image fondo;
	JButton botonInicio = new JButton("Start");

	int alturaPantalla = 0;
	int anchoPantalla = 0;

	public PantallaInicio() {

		Toolkit mipantalla = Toolkit.getDefaultToolkit();// Guardado sistema de vemtanas nativo
		Dimension tamanioPantalla = mipantalla.getScreenSize();// Guardado la dimension de mi pantalla
		alturaPantalla = tamanioPantalla.height;// alto
		anchoPantalla = tamanioPantalla.width;// ancho
		setLocation(anchoPantalla / 4, alturaPantalla / 32);// Marco centrado

		setSize(700, 700);
		setResizable(false);// No dejamos poner en pantalla completa
		setTitle("Space Invaders");

		Image miIcono = mipantalla.getImage("imagenes/icono.png");// Guardar direcion Icono
		setIconImage(miIcono);// Poner Icono

		add(botonInicio);// Aniadido Boton
		botonInicio.addActionListener(this);//Hacemos que el escuchante sea esta pestaña

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

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botonPulsado = e.getSource();// Obtenemos que boton se ha pulsado
		/*
		if (botonPulsado == botonInicio) { // Condicion para que cuando haya varios botones se sepa que accion hace cada
											// uno

			// setVisible(false);

			Juego juego = new Juego();

			try {
				juego.loop();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

		}
		*/
	}
	
}
