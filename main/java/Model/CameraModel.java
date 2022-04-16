package Model;

public class CameraModel extends ElectricDeviceModel{

	private String time, fileVideo;

	public CameraModel(String name, String manufacture, String date, int room, float capacityN, float capacityL,
			float capacityH, float price, int status, int insurance, int maintenance, String time, String fileVideo) {
		super(name, manufacture, date, room, capacityN, capacityL, capacityH, price, status, insurance, maintenance);
		this.time = time;
		this.fileVideo = fileVideo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFileVideo() {
		return fileVideo;
	}

	public void setFileVideo(String fileVideo) {
		this.fileVideo = fileVideo;
	}
	
	
}
