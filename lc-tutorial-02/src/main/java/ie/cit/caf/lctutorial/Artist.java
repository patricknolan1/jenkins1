package ie.cit.caf.lctutorial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

	private int birthYear;
	
	@JsonProperty("fc")
	private String fullName;
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String toString() {
		String artistAsString = "Name: " + fullName + "\nBorn: " + birthYear;
		return artistAsString;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
