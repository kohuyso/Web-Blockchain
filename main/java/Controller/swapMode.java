package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class swapMode {
	public static void swap (int mode, String id, float capacity) throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_changeMode = "UPDATE ELECTRICDIVECS SET ESTATUS = ? WHERE EID = ?";
		PreparedStatement ps_changMode = con.prepareStatement(sql_changeMode);
		ps_changMode.setInt(1, mode);
		ps_changMode.setString(2, id);
		ps_changMode.executeUpdate();
		System.out.println("AAAAA");
		
		String sql_getTimeT = "SELECT TIMET, CAPACITY FROM HISTORY WHERE EID = ? ORDER BY TIMET DESC";
		PreparedStatement ps_getTimeT = con.prepareStatement(sql_getTimeT);
		System.out.println("AGGGG");
		ps_getTimeT.setString(1, id);
		ResultSet rs_getTimeT = ps_getTimeT.executeQuery();
		rs_getTimeT.next();
		String getTimeT = rs_getTimeT.getString("TIMET");
		float getCapacity = rs_getTimeT.getFloat("CAPACITY");
		String sql_soDien = "UPDATE HISTORY SET TIMES = ? WHERE EID = ? AND TIMET = ?";
		PreparedStatement ps_soDien = con.prepareStatement(sql_soDien);
		ps_soDien.setString(1, TimeNe.getTime());
		ps_soDien.setString(2, id);
		ps_soDien.setString(3, getTimeT);
		ps_soDien.executeUpdate();
		System.out.println("HEYYY");
		
		String sql_soDien1 = "UPDATE HISTORY SET SODIEN = ? / 60 / 1000 * (SELECT DATEDIFF(MINUTE, TIMET, TIMES) FROM HISTORY WHERE EID = ? AND TIMET = ?) WHERE EID = ? AND TIMET = ?";
		PreparedStatement ps_soDien1 = con.prepareStatement(sql_soDien1);
		ps_soDien1.setFloat(1, getCapacity);
		ps_soDien1.setString(2, id);
		ps_soDien1.setString(3, getTimeT);
		ps_soDien1.setString(4, id);
		ps_soDien1.setString(5, getTimeT);
		System.out.println(id);
		System.out.println(getTimeT);
		ps_soDien1.executeUpdate();
		
		System.out.println("CCCC");
		
		String sql_addHistory = "INSERT INTO HISTORY (EID, CAPACITY, TIMET) VALUES (?, ?, ?)";
		PreparedStatement ps_addHistory = con.prepareStatement(sql_addHistory);
		ps_addHistory.setString(1, id);
		ps_addHistory.setFloat(2, capacity);
		ps_addHistory.setString(3, TimeNe.getTime());
		ps_addHistory.executeUpdate();
		
		
	}
}
