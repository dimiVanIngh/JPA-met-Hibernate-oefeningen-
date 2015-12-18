package be.vdab.valueobjects;

public class VoornaamEnId {
	private final long id;
	private final String voornaam;

	public VoornaamEnId(long id, String voornaam) {
		this.id = id;
		this.voornaam = voornaam;
	}

	public long getId() {
		return id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoornaamEnId other = (VoornaamEnId) obj;
		if (id != other.id)
			return false;
		return true;
	}
}