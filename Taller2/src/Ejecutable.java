import processing.core.*;


public class Ejecutable extends PApplet{

	Logica app ;
	
	
	public void setup(){
		
	size(1200,700);
	app= new Logica(this);
	colorMode(HSB);
	}
	
	
	public void draw(){
		background(100);
		app.aplicacion();
		
		
	}
	
    public void mousePressed(){
    	
    	
    }
}
