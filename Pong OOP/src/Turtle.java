//class header
public class Turtle {
	//attributes
	private String species;
	private boolean landTurtle;
	//default constructor
	public Turtle() {
		species = "Box Turtle";
		landTurtle = true;
	}
	//constructor with parameters
	public Turtle(String initialSpecies, boolean isLandTurtle) {
		species = initialSpecies;
		landTurtle = isLandTurtle;
	}
	//methods
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isLandTurtle() {
		return landTurtle;
	}

	public void setLandTurtle(boolean landTurtle) {
		this.landTurtle = landTurtle;
	}

	public static void main(String[] arg) {
		 
		
		
	}
	
}
