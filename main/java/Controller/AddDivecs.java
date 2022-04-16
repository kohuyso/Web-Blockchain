package Controller;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddDivecs {
	public static String addElectric (String name, String manufacture, int room, float capacityN,
			float capacityL, float capacityH, float price, int status, int insurance, int maintenance, String maKH) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_CountElectric = "SELECT COUNT(EID) AS DEM FROM ELECTRICDIVECS";
		PreparedStatement countElectric = con.prepareStatement(sql_CountElectric);
		ResultSet rsCount = countElectric.executeQuery();
		rsCount.next();
		int count = rsCount.getInt("DEM");
		count += 1;
		String toStringCount = String.valueOf(count);
		String sql_AddElectric = "INSERT INTO ELECTRICDIVECS VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps_AddElectric = con.prepareStatement(sql_AddElectric);
		String noi = maKH + toStringCount;
		ps_AddElectric.setString(1, noi);
		ps_AddElectric.setString(2, name);
		ps_AddElectric.setString(3, manufacture);
		ps_AddElectric.setInt(4, room);
		ps_AddElectric.setInt(5, status);
		ps_AddElectric.setInt(6, insurance);
		ps_AddElectric.setInt(7, maintenance);
		ps_AddElectric.setFloat(8, capacityN);
		ps_AddElectric.setFloat(9, capacityL);
		ps_AddElectric.setFloat(10, capacityH);
		ps_AddElectric.executeUpdate();
	
		return noi;
	}
	public static void addAirCondition (String noi) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "INSERT INTO AIRCONDITION VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setString(1, noi);
		ps_AddAirC.setInt(2, 0);
		ps_AddAirC.setInt(3, 0);
		ps_AddAirC.setFloat(4, 0);
		ps_AddAirC.setInt(5, 21);
		ps_AddAirC.executeUpdate();
		String sql_addHis = "INSERT INTO HISTORY VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps_his = con.prepareStatement(sql_addHis);
		ps_his.setString(1, noi);
		ps_his.setInt(2, 0);
		ps_his.setString(3, TimeNe.getTime());
		ps_his.setString(4, "");
		ps_his.setInt(5, 0);
		ps_his.executeUpdate();
	}
	public static void addTV (String noi) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "INSERT INTO TV VALUES (?, ?, ?, ?)";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setString(1, noi);
		ps_AddAirC.setInt(2, 0);
		ps_AddAirC.setInt(3, 20);
		ps_AddAirC.setString(4, "");
		ps_AddAirC.executeUpdate();
		String sql_addHis = "INSERT INTO HISTORY VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps_his = con.prepareStatement(sql_addHis);
		ps_his.setString(1, noi);
		ps_his.setInt(2, 0);
		ps_his.setString(3, TimeNe.getTime());
		ps_his.setString(4, "");
		ps_his.setInt(5, 0);
		ps_his.executeUpdate();

	}
	
	public static void UpdateAirCondition (int tempRoom, int pm25, float humidity, String maDV) throws Exception {
		System.out.println("o kia");
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "UPDATE AIRCONDITION SET TEMPROOM = ?, PM25 = ?, HUMIDITY = ? WHERE EID = ?";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setInt(1, tempRoom);
		ps_AddAirC.setInt(2, pm25);
		ps_AddAirC.setFloat(3, humidity);
		ps_AddAirC.setString(4, maDV);
		System.out.println("cha hieu kieu j");
		ps_AddAirC.executeUpdate();
		
	}
	
	public static void addWaterPurifier (String noi) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "INSERT INTO WATERPURIFIER VALUES (?, ?, ?, ?)";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setString(1, noi);
		ps_AddAirC.setInt(2, 0);
		ps_AddAirC.setFloat(3, 0);
		ps_AddAirC.setInt(4, 9);
		System.out.println("BBBBB");
		ps_AddAirC.executeUpdate();
		String sql_addHis = "INSERT INTO HISTORY VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps_his = con.prepareStatement(sql_addHis);
		ps_his.setString(1, noi);
		ps_his.setInt(2, 120);
		ps_his.setString(3, TimeNe.getTime());
		ps_his.setString(4, "");
		ps_his.setInt(5, 0);
		ps_his.executeUpdate();

	}
	
	public static void UpdateWaterPurifier (float ph, int TDS, String id) throws Exception {
		System.out.println("o kia");
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "UPDATE WATERPURIFIER SET PH = ?, TDS = ? WHERE EID = ?";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setFloat(1, ph);
		ps_AddAirC.setInt(2, TDS);
		ps_AddAirC.setString(3, id);
		System.out.println("cha hieu kieu j");
		ps_AddAirC.executeUpdate();
	}
	
	public static void UpdateHumanHealth (float weight, float height, float spo2, float bmi, float blood, int heart, String id) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_AddAirC = "UPDATE HUMAN SET SPO2 = ?, BLOODPRESSURE = ?, HEIGHT = ?, WEIGHT = ?, BMI = ?, HEARTBEAT = ? WHERE EID = ?";
		PreparedStatement ps_AddAirC = con.prepareStatement(sql_AddAirC);
		ps_AddAirC.setFloat(1, spo2);
		ps_AddAirC.setFloat(2, blood);
		ps_AddAirC.setFloat(3, height);
		ps_AddAirC.setFloat(4, weight);
		ps_AddAirC.setFloat(5, blood);
		ps_AddAirC.setInt(6, heart);
		ps_AddAirC.setString(7, id);
		System.out.println("cha hieu kieu j");
		ps_AddAirC.executeUpdate();
	}

}
