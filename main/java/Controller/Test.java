package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

public class Test {
	public static void main(String[] args) throws Exception {
//		Random d = new Random();
//		float a = d.nextFloat() * 100;
//		int b = d.nextInt(25) + 18;
//		System.out.println(b);\
		Connection con = ConnectDataBase.openConnection();
		for (int i = 1; i < 12; i+=1) {
			String s = Integer.toString(i);
			String kenh = "VTC" + s;
			String sql = "INSERT INTO LISTCHANNEL VALUES (?, 0)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, kenh);
			ps.executeUpdate();
		}
	}
	
}
