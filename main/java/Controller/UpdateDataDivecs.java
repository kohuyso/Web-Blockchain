package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class UpdateDataDivecs {
	void upDateDateAirC () throws Exception {
		Connection con = ConnectDataBase.openConnection();
		String sql_GetAirID = "SELECT EID FROM AIRCONDITION";
		PreparedStatement ps_GetAirID = con.prepareStatement(sql_GetAirID);
		ResultSet rsGetAirID = ps_GetAirID.executeQuery();
		while (rsGetAirID.next()) {
			Random generator = new Random();
			int temper = generator.nextInt(40);
			int pm25 = generator.nextInt(400);
			float humid = generator.nextFloat() * 100;

			String sql_UpdateAirC = "UPDATE AIRCONDITION SET TEMPERATURE = ?, PM25 = ?, HUMIDITY = ? WHERE EID = ?";
			PreparedStatement ps_UpdateAirC = con.prepareStatement(sql_UpdateAirC);
			ps_UpdateAirC.setInt(1, temper);
			ps_UpdateAirC.setInt(2, pm25);
			ps_UpdateAirC.setFloat(3, humid);
			ps_UpdateAirC.setString(4, rsGetAirID.getString("EID"));
		}
	}
}                     
