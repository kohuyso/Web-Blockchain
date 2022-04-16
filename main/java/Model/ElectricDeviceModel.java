package Model;

public class ElectricDeviceModel {
	
	private String name, manufacture, date;
	private float capacityN, capacityL, capacityH, price;
	private int status, room;
	private int insurance, maintenance;
	public ElectricDeviceModel(String name, String manufacture, String date, int room, float capacityN,
			float capacityL, float capacityH, float price, int status, int insurance, int maintenance) {
		super();
		this.name = name;
		this.manufacture = manufacture;
		this.date = date;
		this.room = room;
		this.capacityN = capacityN;
		this.capacityL = capacityL;
		this.capacityH = capacityH;
		this.price = price;
		this.status = status;
		this.insurance = insurance;
		this.maintenance = maintenance;
	}
	public ElectricDeviceModel(String name, String manufacture, int room, float capacityN, int insurance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.manufacture = manufacture;
		this.room = room;
		this.capacityN = capacityN;
		this.insurance = insurance;
	}
	public ElectricDeviceModel(String name, String manufacture, int room, float capacityN, float capacityL,
			float capacityH, int status, int insurance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.manufacture = manufacture;
		this.room = room;
		this.capacityN = capacityN;
		this.insurance = insurance;
		this.status = status;
		this.capacityL = capacityL;
		this.capacityH = capacityH;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public float getCapacityN() {
		return capacityN;
	}
	public void setCapacityN(float capacityN) {
		this.capacityN = capacityN;
	}
	public float getCapacityL() {
		return capacityL;
	}
	public void setCapacityL(float capacityL) {
		this.capacityL = capacityL;
	}
	public float getCapacityH() {
		return capacityH;
	}
	public void setCapacityH(float capacityH) {
		this.capacityH = capacityH;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	
	
	
}
