package four_pillers_oop;

interface Drawable{
	void draw();
	
	default void NoteDrawable() {
		System.out.println("This is a Drawable Interface...");
	}
	
}

interface Sketchable{
	void sketch();
	
	default void NoteSketchable() {
		System.out.println("This is a Sketchable Interface...");
	}
}

class Art implements Drawable,Sketchable{
	
	@Override
	public void draw() {
		System.out.println("Drawing...");
	}
	
	@Override
	public void sketch() {
		System.out.println("Sketching...");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d=new Art();
		d.NoteDrawable();
		d.draw();

		Sketchable s=new Art();
		s.NoteSketchable();
		s.sketch();
		
		Art art=new Art();
		art.NoteDrawable();
		art.draw();
		art.NoteSketchable();
		art.sketch();

	}

}
