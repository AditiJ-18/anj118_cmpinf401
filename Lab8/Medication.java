public class Medication {
	private int medicationID; 
	private String name; 
	
	public Medication(int medicationID, String name) {
		this.medicationID = medicationID; 
		this.name = name; 
	}
	
	public String getName() { 
		return name; 
	}
}
