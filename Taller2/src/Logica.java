import java.util.ArrayList;

import processing.core.*;

public class Logica {
	
	PApplet app;
	private int cambioPantalla=0;
	PImage inicio, boton1 , boton2 ,interfaz;

	
	private ArrayList <Objeto> objetos = new ArrayList <Objeto>();

	public Logica(PApplet app) {
		super();
		this.app = app;
		
		inicio= app.loadImage("../data/inicio.jpg");
		boton1=app.loadImage("../data/boton1.png");
		boton2=app.loadImage("../data/boton2.png");
		interfaz=app.loadImage("../data/interfaz.jpg");


	}

	
	
	
	
	
	public void aplicacion(){
		
		switch (cambioPantalla) {
		case 0:
			app.image(inicio, 0, 0);
			app.image(boton1, 0, 0);
			
			
			
			
			break;

		}
		
		
	}
}
