public class Patient {
	private String patientID; 
	private String firstName; 
	private String lastName; 
	private String ssn; 
	private char gender; 
	private Diagnosis diagnosis; 
	private Medication medication; 
	private String symptom; 
	private double weight; 
	private double height; 
	
	public Patient(String firstName, String lastName, String ssn, char gender, double weight, double height) { 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.ssn = ssn; 
		this.gender = gender; 
		this.weight = weight;
		this.height = height; 
		this.patientID = ssn + firstName.charAt(0) + lastName.charAt(0); 
	}
	
	public double calculateBMI(){ 
		double bmi = weight / (Math.pow(height, 2)); 
		return bmi; 
	}
	
	public String getSymptom() { 
		return symptom; 
	}
	
	public void setSymptom(String symptom) { 
		this.symptom = symptom;
	}
	
	public String getPatientID() { 
		return patientID; 
	}

	public Diagnosis getDiagnosis() {
		return diagnosis; 
	}
	
	public void setDiagnosis(Diagnosis diagnosis) { 
		this.diagnosis = diagnosis; 
	}
	
	public Medication getMedication() {
		return medication; 
	}
	
	public void setMedication(Medication medication) {
		this.medication = medication; 
	}
	
	public String getFirstName() { 
		return firstName; 
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	public String getSsn() { 
		return ssn; 
	}
}
