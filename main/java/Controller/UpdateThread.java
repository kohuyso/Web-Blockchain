package Controller;

public class UpdateThread extends Thread {
	@Override
	public void run () {
		
		try {
			UpdateData.UpdateAirCondition();
			UpdateData.UpdateWaterPurifier();
			UpdateData.UpdateMember();
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
