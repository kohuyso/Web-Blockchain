	package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class UpdateData {
	public static void UpdateAirCondition () throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_getID = "SELECT EID FROM AIRCONDITION";
		PreparedStatement ps_getID = con.prepareStatement(sql_getID);
		ResultSet rs_UpdateAirc = ps_getID.executeQuery();
		while (rs_UpdateAirc.next()) {
			Random rd = new Random();
			float humidity = rd.nextFloat() * 100;
			int temp = rd.nextInt(25) + 18;
			int pm25 = rd.nextInt(290) + 10;
			String sql_UpdateAirc = "UPDATE AIRCONDITION SET TEMPROOM = ?, PM25 = ?, HUMIDITY = ? WHERE EID = ?";
			PreparedStatement ps_UpdateAirc = con.prepareStatement(sql_UpdateAirc);
			ps_UpdateAirc.setInt(1, temp);
			ps_UpdateAirc.setInt(2, pm25);
			ps_UpdateAirc.setFloat(3, humidity);
			ps_UpdateAirc.setString(4, rs_UpdateAirc.getString("EID"));
			ps_UpdateAirc.executeUpdate();
			System.out.println("Duoc roi ne 1");
		}
	}
	
	public static void UpdateWaterPurifier () throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_getID = "SELECT EID FROM WATERPURIFIER";
		PreparedStatement ps_getID = con.prepareStatement(sql_getID);
		ResultSet rs_UpdateAirc = ps_getID.executeQuery();
		while (rs_UpdateAirc.next()) {
			Random rd = new Random();
			float ph = (float) (rd.nextFloat() * 8 + 3.6);
			int tds = rd.nextInt(400) + 18;
			String sql_UpdateAirc = "UPDATE WATERPURIFIER SET TDS = ?, PH = ? WHERE EID = ?";
			PreparedStatement ps_UpdateAirc = con.prepareStatement(sql_UpdateAirc);
			ps_UpdateAirc.setFloat(1, tds);
			ps_UpdateAirc.setFloat(2, ph);
			ps_UpdateAirc.setString(3, rs_UpdateAirc.getString("EID"));
			ps_UpdateAirc.executeUpdate();
			System.out.println("Duoc roi ne 2");
		}
	}
	
	public static void UpdateMember () throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_getID = "SELECT NAME FROM HUMAN";
		PreparedStatement ps_getID = con.prepareStatement(sql_getID);
		ResultSet rs_UpdateAirc = ps_getID.executeQuery();
		while (rs_UpdateAirc.next()) {
			Random rd = new Random();
			float spo2 = rd.nextFloat() * 100;
			int blood = rd.nextInt(60) + 70;
			float height = rd.nextFloat() * 100 + 100;
			float weight = rd.nextFloat() * 100;
			float bmi = weight/height;
			int heart = rd.nextInt(70) + 40;
			String sql_UpdateAirc = "UPDATE HUMAN SET SPO2 = ?, BLOODPRESSURE = ?, HEIGHT = ?, WEIGHT = ?, BMI = ?, HEARTBEAT = ? WHERE NAME = ?";
			PreparedStatement ps_UpdateAirc = con.prepareStatement(sql_UpdateAirc);
			ps_UpdateAirc.setFloat(1, spo2);
			ps_UpdateAirc.setInt(2, blood);
			ps_UpdateAirc.setFloat(3, height);
			ps_UpdateAirc.setFloat(4, weight);
			ps_UpdateAirc.setFloat(5, bmi);
			ps_UpdateAirc.setInt(6, heart);
			ps_UpdateAirc.setString(7, rs_UpdateAirc.getString("NAME"));
			ps_UpdateAirc.executeUpdate();
			System.out.println("Duoc roi ne 3");
		}
	}
}
