public class Doctor {
	private String employeeID; 
	private String firstName;
	private String lastName; 
	private String ssn; 

	public Doctor(String firstName, String lastName, String ssn) { 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.ssn = ssn; 
		this.employeeID = ssn + firstName.charAt(0) + lastName.charAt(0); 
	}
	
	public void prescribe(Patient patient){ 
		String ptSx = patient.getSymptom(); 
		if(ptSx.equals("headache")){ 
			Diagnosis dx = new Diagnosis(1, "dehydration"); 
			patient.setDiagnosis(dx); 
			Medication meds = new Medication(1, "Tylenol"); 
			patient.setMedication(meds);
		} else if (ptSx.equals("cough")) { 
			Diagnosis dx = new Diagnosis(2, "common cold"); 
			patient.setDiagnosis(dx);
			Medication meds = new Medication(2, "cough drops"); 
			patient.setMedication(meds);
		} else if (ptSx.equals("fever")) { 
			Diagnosis dx = new Diagnosis(3, "influenza"); 
			patient.setDiagnosis(dx);
			Medication meds = new Medication(3, "Tamiflu"); 
			patient.setMedication(meds);
		} else {
			patient.setDiagnosis(null);
			patient.setMedication(null);
			System.out.println("You could not be diagnosed."); 
		}
	}
	
}
