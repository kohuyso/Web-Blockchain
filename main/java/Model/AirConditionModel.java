	package Model;

public class AirConditionModel extends ElectricDeviceModel {
	
	private float humidity;
	private int pm25, temperature;

	public AirConditionModel(String name, String manufacture, String date, int room, float capacityN,
			float capacityL, float capacityH, float price, int status, int insurance, int maintenance,
			int temperature, int pm25, float humidity) {
		super(name, manufacture, date, room, capacityN, capacityL, capacityH, price, status, insurance, maintenance);
		this.temperature = temperature;
		this.pm25 = pm25;
		this.humidity = humidity;
	}
	
	public AirConditionModel(String name, String manufacture, int room, float capacityN,
			float capacityL, float capacityH,  int status, int insurance,
			int temperature, int pm25, float humidity) {
		super(name, manufacture, room, capacityN, capacityL, capacityH, status, insurance);
		this.temperature = temperature;
		this.pm25 = pm25;
		this.humidity = humidity;
	}
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	
	
	
}
