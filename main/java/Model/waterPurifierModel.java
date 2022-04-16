package Model;

public class waterPurifierModel extends ElectricDeviceModel {
		
	private float waterQuality, PH;
	private int loi;


	public waterPurifierModel(String name, String manufacture, String date, int room, float capacityN, float capacityL,
			float capacityH, float price, int status, int insurance, int maintenance, float waterQuality, float ph) {
		super(name, manufacture, date, room, capacityN, capacityL, capacityH, price, status, insurance, maintenance);
		this.waterQuality = waterQuality;
		this.PH = ph;
	}
	
	public waterPurifierModel (String name, String manufacture, int room, float capacityN, int insurance, float ph, float waterQuality, int loi) {
		super(name, manufacture, room, capacityN, insurance);
		this.waterQuality = waterQuality;
		this.PH = ph;
		this.loi = loi;
	}
	
}
