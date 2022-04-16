package Model;

public class HumanModel {
	private String NameHuman;
	private float spo2, bloodPressure, height, weight, BMI;
	private int heartBeat;
	
	public HumanModel(String nameHuman, float spo2, float bloodPressure, float height, float weight, float bMI,
			int heartBeat) {
		NameHuman = nameHuman;
		this.spo2 = spo2;
		this.bloodPressure = bloodPressure;
		this.height = height;
		this.weight = weight;
		BMI = bMI;
		this.heartBeat = heartBeat;
	}

	public String getNameHuman() {
		return NameHuman;
	}

	public void setNameHuman(String nameHuman) {
		NameHuman = nameHuman;
	}

	public float getSpo2() {
		return spo2;
	}

	public void setSpo2(float spo2) {
		this.spo2 = spo2;
	}

	public float getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(float bloodPressure) {
		this.bloodPressure = bloodPressure;
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

	public float getBMI() {
		return BMI;
	}

	public void setBMI(float bMI) {
		BMI = bMI;
	}

	public int getHeartBeat() {
		return heartBeat;
	}

	public void setHeartBeat(int heartBeat) {
		this.heartBeat = heartBeat;
	}
	
	
	
}
