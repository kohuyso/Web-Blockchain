package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Controller.ConnectDataBase;

public class TVModel extends ElectricDeviceModel{
	private String lockChildren, channel;
	private int soundVolume;
	
	public TVModel(String name, String manufacture, String date, int room, float capacityN, float capacityL,
			float capacityH, float price, int status, int insurance, int maintenance, String lockChildren,
			int soundVolume, String channel) {
		super(name, manufacture, date, room, capacityN, capacityL, capacityH, price, status, insurance, maintenance);
		this.lockChildren = lockChildren;
		this.soundVolume = soundVolume;
	}

	public String getLockChildren() {
		return lockChildren;
	}

	public void setLockChildren(String lockChildren) {
		this.lockChildren = lockChildren;
	}

	public int getSoundVolume() {
		return soundVolume;
	}

	public void setSoundVolume(int soundVolume) {
		this.soundVolume = soundVolume;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public static void updateLock (String id, int lockNe) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_updateLock = "UPDATE TV SET LOCK = ? WHERE EID = ?";
		PreparedStatement ps_updateLock = con.prepareStatement(sql_updateLock);
		ps_updateLock.setInt(1, lockNe);
		ps_updateLock.setString(2, id);
		ps_updateLock.executeUpdate();
	}
	public static void swapChannel (String id, String channel, int vol) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_updateLock = "UPDATE TV SET SOUNDVOLUME = ?, CHANNEL = ? WHERE EID = ?";
		PreparedStatement ps_updateLock = con.prepareStatement(sql_updateLock);
		ps_updateLock.setInt(1, vol);
		ps_updateLock.setString(2, channel);		
		ps_updateLock.setString(3, id);
		ps_updateLock.executeUpdate();
	}
	public static boolean checkLock (String channel) throws Exception {
		System.out.println("FDS");
		Connection con = ConnectDataBase.openConnection();
		String sql_checkLock = "SELECT CHANNLE, LOCKCHANNLE	 FROM LISTCHANNEL WHERE CHANNLE = ? ";
		PreparedStatement ps_checkLock = con.prepareStatement(sql_checkLock);
		ps_checkLock.setString(1, channel);
		ResultSet rs_checkLock = ps_checkLock.executeQuery();
		if (rs_checkLock.next()) {
			if (rs_checkLock.getInt("LOCKCHANNLE") == 0) {
				System.out.println(" K Khóa");
				return false;// k khoa
				
			}
			
		}
		System.out.println("khóa");
		return true; // khoa kenh
	}
	
	
}
