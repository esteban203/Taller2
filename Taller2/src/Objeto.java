import processing.core.*;

public class Objeto implements Pintable{
	
	PApplet app;
	
	private int x,y,tam,col=50,saturacion,vibracion;

	public Objeto(int x, int y, int tam) {
		super();
		this.x = x;
		this.y = y;
		this.tam = tam;
	}

	public void pintar(){
		
		
		app.stroke(3);
		app.fill(col,80,100);
		app.rect(x,y,tam,tam,7);
		
		
		
		
	}
	
	
}
