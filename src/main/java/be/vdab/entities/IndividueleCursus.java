package be.vdab.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
public class IndividueleCursus extends Cursus {
	private static final long serialVersionUID = 1L;
	private int duurtijd;
	
	public int getDuurtijd() {
		return duurtijd;
	}
	public void setDuurtijd(int duurtijd) {
		this.duurtijd = duurtijd;
	}		
}