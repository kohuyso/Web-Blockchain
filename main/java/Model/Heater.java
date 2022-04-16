package Model;

public class Heater extends ElectricDeviceModel {
	
	private float heatPower;

	public Heater(String name, String manufacture, String date, int room, float capacityN, float capacityL,
			float capacityH, float price, int status, int insurance, int maintenance, float heatPower) {
		super(name, manufacture, date, room, capacityN, capacityL, capacityH, price, status, insurance, maintenance);
		this.heatPower = heatPower;
	}

	public float getHeatPower() {
		return heatPower;
	}

	public void setHeatPower(float heatPower) {
		this.heatPower = heatPower;
	}
	
	
	
}
