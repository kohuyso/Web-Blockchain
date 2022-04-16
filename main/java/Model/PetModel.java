package Model;

public class PetModel {
	private String kind, gps;
	private boolean gender;
	private float height, weight;
	
	public PetModel(String kind, String gps, boolean gender, float height, float weight) {
		super();
		this.kind = kind;
		this.gps = gps;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
}
