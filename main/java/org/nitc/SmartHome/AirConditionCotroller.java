package org.nitc.SmartHome;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import Controller.AddDivecs;
import Controller.ConnectDataBase;
import Controller.DataHandling;
import Controller.TimeNe;
import Controller.swapMode;
import Model.AirConditionModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AirConditionCotroller implements Initializable {

	
	   @FXML
	    private JFXButton About;

	    @FXML
	    private JFXButton Bill;

	    @FXML
	    private MenuButton CusMode1;

	    @FXML
	    private MenuButton CusMode2;

	    @FXML
	    private MenuButton CusMode3;

	    @FXML
	    private MenuButton CusMode4;

	    @FXML
	    private JFXButton Health;

	    @FXML
	    private JFXButton Home;

	    @FXML
	    private Text Humidity1;

	    @FXML
	    private Text Humidity2;

	    @FXML
	    private Text Humidity3;

	    @FXML
	    private Text Humidity4;

	    @FXML
	    private Text Room1;

	    @FXML
	    private Text Room2;

	    @FXML
	    private Text Room3;

	    @FXML
	    private Text Room4;

	    @FXML
	    private Text Time;

	    @FXML
	    private Button addDeviceB;

	    @FXML
	    private TextField addHigh;

	    @FXML
	    private TextField addInsurance;

	    @FXML
	    private TextField addLow;

	    @FXML
	    private TextField addManu;

	    @FXML
	    private TextField addMedium;

	    @FXML
	    private TextField addNameDevice;

	    @FXML
	    private TextField addRoom;

	    @FXML
	    private JFXRadioButton autoMode1;

	    @FXML
	    private JFXRadioButton autoMode2;

	    @FXML
	    private JFXRadioButton autoMode3;

	    @FXML
	    private JFXRadioButton autoMode4;

	    @FXML
	    private JFXButton ma1;

	    @FXML
	    private JFXButton ma2;

	    @FXML
	    private JFXButton ma3;

	    @FXML
	    private JFXButton ma4;

	    @FXML
	    private Text manufacture1;

	    @FXML
	    private Text manufacture2;

	    @FXML
	    private Text manufacture3;

	    @FXML
	    private Text manufacture4;

	    @FXML
	    private JFXRadioButton onORoff1;

	    @FXML
	    private JFXRadioButton onORoff2;

	    @FXML
	    private JFXRadioButton onORoff3;

	    @FXML
	    private JFXRadioButton onORoff4;

	    @FXML
	    private Text pm25_1;

	    @FXML
	    private Text pm25_2;

	    @FXML
	    private Text pm25_3;

	    @FXML
	    private Text pm25_4;

	    @FXML
	    private Text roomTemp1;

	    @FXML
	    private Text roomTemp2;

	    @FXML
	    private Text roomTemp3;

	    @FXML
	    private Text roomTemp4;

	    @FXML
	    private Text tempTarget1;

	    @FXML
	    private Text tempTarget2;

	    @FXML
	    private Text tempTarget3;

	    @FXML
	    private Text tempTarget4;

	    @FXML
	    void AboutClick(ActionEvent event) throws IOException {
	    	App.setRoot("AboutPage");
	    }

	    @FXML
	    void BillClick(ActionEvent event) {

	    }

	    @FXML
	    void CusModeChoose1(ActionEvent event) {
	    	
	    }

	    @FXML
	    void CusModeChoose2(ActionEvent event) {

	    }

	    @FXML
	    void CusModeChoose3(ActionEvent event) {

	    }

	    @FXML
	    void CusModeChoose4(ActionEvent event) {

	    }

	    @FXML
	    void DinhGiaClick(ActionEvent event) {

	    }

	    @FXML
	    void DongTienClick(ActionEvent event) {

	    }

	    @FXML
	    void HealthClick(ActionEvent event) {

	    }

	    @FXML
	    void HomeClick(ActionEvent event) throws IOException {
	    	App.setRoot("secondary");
	    }

	    @FXML
	    void LocNganhClick(ActionEvent event) {

	    }

	    @FXML
	    void LockRsiClick(ActionEvent event) {

	    }
	    
	    @FXML
	    void MediumChoose(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYN FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma1.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(2, layma, rs_getCapacity.getFloat("CAPACITYN"));
	    	CusMode1.setText("Medium");
	    //	App.setRoot("AirConditionPage");
	    }

	    @FXML
	    void SaveChoose(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYL FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma1.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(1, layma, rs_getCapacity.getFloat("CAPACITYL"));
	    	CusMode1.setText("Low");
	    //	App.setRoot("AirConditionPage");


	    }
	    @FXML
	    void HighChoose(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYH FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma1.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(3, layma, rs_getCapacity.getFloat("CAPACITYH"));
	    	CusMode1.setText("High");
	    //	App.setRoot("AirConditionPage");


	    }
	    
	    @FXML
	    void MediumChoose1(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYN FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma2.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(2, layma, rs_getCapacity.getFloat("CAPACITYN"));
	    	CusMode2.setText("Medium");
	    	//App.setRoot("AirConditionPage");
	    }

	    @FXML
	    void SaveChoose1(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYL FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma2.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(1, layma, rs_getCapacity.getFloat("CAPACITYL"));
	    	CusMode2.setText("Low");
	    	//App.setRoot("AirConditionPage");


	    }
	    @FXML
	    void HighChoose1(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYH FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma2.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(3, layma, rs_getCapacity.getFloat("CAPACITYH"));
	    	CusMode2.setText("High");
	    	//App.setRoot("AirConditionPage");



	    }
	    @FXML
	    void MediumChoose2(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYN FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma3.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(2, layma, rs_getCapacity.getFloat("CAPACITYN"));
	    	CusMode3.setText("Medium");
	    	//App.setRoot("AirConditionPage");


	    }

	    @FXML
	    void SaveChoose2(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYL FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma3.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(1, layma, rs_getCapacity.getFloat("CAPACITYL"));
	    	CusMode3.setText("Low");
	    	//App.setRoot("AirConditionPage");


	    }
	    @FXML
	    void HighChoose2(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYH FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma3.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(3, layma, rs_getCapacity.getFloat("CAPACITYH"));
	    	CusMode3.setText("High");
	    	//App.setRoot("AirConditionPage");


	    }
	    @FXML
	    void MediumChoose3(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYN FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma4.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(2, layma, rs_getCapacity.getFloat("CAPACITYN"));
	    	CusMode4.setText("Medium");
	    	//App.setRoot("AirConditionPage");


	    }

	    @FXML
	    void SaveChoose3(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYL FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma4.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(1, layma, rs_getCapacity.getFloat("CAPACITYL"));
	    	CusMode4.setText("Low");
	    	//App.setRoot("AirConditionPage");


	    }
	    @FXML
	    void HighChoose3(ActionEvent event) throws Exception {
	    	Connection con = ConnectDataBase.openConnection();
	    	String sql_getCapacity = "SELECT CAPACITYH FROM ELECTRICDIVECS WHERE EID = ?";
	    	PreparedStatement ps_getCapacity = con.prepareStatement(sql_getCapacity);
	    	String layma = DataHandling.XuLyChu(ma4.getText().toCharArray());
	    	ps_getCapacity.setString(1, layma);
	    	ResultSet rs_getCapacity = ps_getCapacity.executeQuery();
	    	rs_getCapacity.next();
	    	swapMode.swap(3, layma, rs_getCapacity.getFloat("CAPACITYH"));
	    	CusMode4.setText("High");
	    	//App.setRoot("AirConditionPage");

	    }


	    @FXML
	    void Time7(MouseEvent event) {

	    }
	    


	    @FXML
	    void addDeviceC(ActionEvent event) throws Exception {
	    	System.out.println(DataHandling.XuLyChu(addManu.getText().toCharArray()));
	    	System.out.println(DataHandling.XuLySoThayDoi(addRoom.getText().toCharArray()));
	    	System.out.println(DataHandling.XuLySo(addMedium.getText().toCharArray()));
	    	System.out.println(DataHandling.XuLyChu(addNameDevice.getText().toCharArray()));
	    	String maid = AddDivecs.addElectric(DataHandling.XuLyChu(addNameDevice.getText().toCharArray()), DataHandling.XuLyChu(addManu.getText().toCharArray()), DataHandling.XuLySoThayDoi(addRoom.getText().toCharArray()), DataHandling.XuLySo(addMedium.getText().toCharArray()), DataHandling.XuLySo(addLow.getText().toCharArray()), DataHandling.XuLySo(addHigh.getText().toCharArray()), 0, 0, DataHandling.XuLySoThayDoi(addInsurance.getText().toCharArray()), 0, "DH");
	    	//AddDivecs.addAirCondition(DataHandling.XuLySoThayDoi(roomTemp1.getText().toCharArray()), DataHandling.XuLySoThayDoi(tempTarget1.getText().toCharArray()), DataHandling.XuLySoThayDoi(pm25_1.getText().toCharArray()), DataHandling.XuLySo(Humidity1.getText().toCharArray()), maid);
	    	AddDivecs.addAirCondition(maid);
	    	App.setRoot("AirConditionPage");
	    }

	    @FXML
	    void autoModeClick1(ActionEvent event) throws IOException {
//	    	if (autoMode1.isSelected() == true) {
//	    		autoMode1.setSelected(false);
//	    	}
//	    	else {
//	    		autoMode1.setSelected(true);
//	    	}
	    //	autoMode1.setSelected(true);
	    }

	    @FXML
	    void autoModeClick2(ActionEvent event) throws IOException {
	    	if (autoMode2.isSelected()) {
	    		autoMode2.setSelected(false);
	    	}
	    	else {
	    		autoMode2.setSelected(true);
	    	}
	    }

	    @FXML
	    void autoModeClick3(ActionEvent event) throws IOException {
	    	if (autoMode3.isSelected()) {
	    		autoMode3.setSelected(false);
	    	}
	    	else {
	    		autoMode3.setSelected(true);
	    	}
	    }

	    @FXML
	    void autoModeClick4(ActionEvent event) throws IOException {
	    	if (autoMode4.isSelected()) {
	    		autoMode4.setSelected(false);
	    	}
	    	else {
	    		autoMode4.setSelected(true);
	    	}
	    }

	    @FXML
	    void onORoffC1(ActionEvent event) throws Exception {
    		String id = DataHandling.XuLyChu(ma1.getText().toCharArray());
	    	if (onORoff1.isSelected()) {
		    	swapMode.swap(2, id, 500);
	    		CusMode1.setText("ON");
	    	}
	    	else {
		    	swapMode.swap(0, id, 0);
				CusMode1.setText("OFF");
	    	}
	    }

	    @FXML
	    void onORoffC2(ActionEvent event) throws Exception {
    		String id = DataHandling.XuLyChu(ma2.getText().toCharArray());
	    	if (onORoff2.isSelected()) {
		    	swapMode.swap(2, id, 500);
				CusMode2.setText("ON");
	    	}
	    	else {
		    	swapMode.swap(0, id, 0);
				CusMode2.setText("OFF");
	    	}
	    }

	    @FXML
	    void onORoffC3(ActionEvent event) throws Exception {
    		String id = DataHandling.XuLyChu(ma3.getText().toCharArray());
	    	if (onORoff3.isSelected()) {
		    	swapMode.swap(2, id, 500);
				CusMode3.setText("ON");
	    	}
	    	else {
		    	swapMode.swap(0, id, 0);
				CusMode3.setText("OFF");
	    	}
	    }

	    @FXML
	    void onORoffC4(ActionEvent event) throws Exception {
    		String id = DataHandling.XuLyChu(ma4.getText().toCharArray());
	    	if (onORoff4.isSelected()) {
		    	swapMode.swap(2, id, 500);
				CusMode4.setText("ON");
	    	}
	    	else {
		    	swapMode.swap(0, id, 0);
				CusMode4.setText("Off");
	    	}
	    }
	AirConditionModel dh1, dh2, dh3, dh4;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = ConnectDataBase.openConnection();
			String sql_getAirC = "SELECT EID, TEMPROOM, PM25, HUMIDITY, TEMPTARGET FROM AIRCONDITION";
			PreparedStatement ps_getAirC = con.prepareStatement(sql_getAirC);
			ResultSet rs_getAirC = ps_getAirC.executeQuery();
			int step = 1;
			while (step != 5 && rs_getAirC.next()) {
				con = ConnectDataBase.openConnection();
				String sql_getAirCts = "SELECT EMAINTENANCE, EROOM, EMANUFACTURE, ESTATUS, CAPACITYL, CAPACITYN, CAPACITYH FROM ELECTRICDIVECS WHERE EID = ?";
				PreparedStatement ps_getAirCts = con.prepareStatement(sql_getAirCts);
				ps_getAirCts.setString(1, rs_getAirC.getString("EID"));
				ResultSet rs_getAirCts = ps_getAirCts.executeQuery();
				rs_getAirCts.next();
	
				int status = rs_getAirCts.getInt("ESTATUS");
				float humi = Math.round(rs_getAirC.getFloat("HUMIDITY")*100)/100+5;
				if (step == 1) {
					dh1 = new AirConditionModel (rs_getAirC.getString("EID"), rs_getAirCts.getString("EMANUFACTURE"), rs_getAirCts.getInt("EROOM"), rs_getAirCts.getFloat("CAPACITYN"), rs_getAirCts.getFloat("CAPACITYL"), rs_getAirCts.getFloat("CAPACITYH"), rs_getAirCts.getInt("ESTATUS"), rs_getAirCts.getInt("EMAINTENANCE"), rs_getAirC.getInt("TEMPROOM"), rs_getAirC.getInt("PM25"), rs_getAirC.getFloat("HUMIDITY"));
					ma1.setText(dh1.getName());
					String id = rs_getAirC.getString("EID");
					System.out.println(id);
					manufacture1.setText(dh1.getManufacture());
					Room1.setText(String.valueOf(dh1.getRoom()));
					if (status == 1) {
						onORoff1.setSelected(true);
						CusMode1.setText("Low");
					}
					else if (status == 2) {
						onORoff1.setSelected(true);
						CusMode1.setText("Medium");
					}
					else if (status == 3) {
						onORoff1.setSelected(true);
						CusMode1.setText("High");
					}
					else {
						onORoff1.setSelected(true);
						CusMode1.setText("OFF");
					}
					roomTemp1.setText(String.valueOf(dh1.getTemperature()));
					tempTarget1.setText(rs_getAirC.getString("TEMPTARGET"));
					Humidity1.setText(String.valueOf(humi));
					pm25_1.setText(String.valueOf(dh1.getPm25()));
					int tempLech = rs_getAirC.getInt("TEMPTARGET")-dh1.getTemperature();
					if(autoMode1.isSelected()) {
						if (tempLech >= 6) {
					    	swapMode.swap(3, id, rs_getAirCts.getFloat("CAPACITYH"));
					    	CusMode1.setText("High");
						}
						else if (tempLech < 6 && tempLech >= 2) {
							swapMode.swap(2, id, rs_getAirCts.getFloat("CAPACITYN"));
							CusMode1.setText("Medium");
						}
						else {
							swapMode.swap(1, id, rs_getAirCts.getFloat("CAPACITYL"));
							CusMode1.setText("Low");
						}
					}
				}
				else if (step == 2) {
					String id = rs_getAirC.getString("EID");
					ma2.setText(id);
					manufacture2.setText(rs_getAirCts.getString("EMANUFACTURE"));
					Room2.setText(rs_getAirCts.getString("EROOM"));
					if (status == 1) {
						onORoff2.setSelected(true);
						CusMode2.setText("Low");
					}
					else if (status == 2) {
						onORoff2.setSelected(true);
						CusMode2.setText("Medium");
					}
					else if (status == 3) {
						onORoff2.setSelected(true);
						CusMode2.setText("High");
					}
					else {
						onORoff2.setSelected(true);
						CusMode2.setText("OFF");
					}
					roomTemp2.setText(rs_getAirC.getString("TEMPROOM"));
					tempTarget2.setText(rs_getAirC.getString("TEMPTARGET"));
					Humidity2.setText(String.valueOf(humi));
					pm25_2.setText(rs_getAirC.getString("PM25"));
					
					int tempLech = rs_getAirC.getInt("TEMPTARGET")-rs_getAirC.getInt("TEMPROOM");
					if(autoMode2.isSelected()) {
						if (rs_getAirC.getInt("TEMPROOM") >= 6) {
					    	swapMode.swap(3, id, rs_getAirCts.getFloat("CAPACITYH"));
					    	CusMode2.setText("High");
						}
						else if (tempLech < 6 && tempLech >= 2) {
							swapMode.swap(2, id, rs_getAirCts.getFloat("CAPACITYN"));
							CusMode2.setText("Medium");
						}
						else {
							swapMode.swap(1, id, rs_getAirCts.getFloat("CAPACITYL"));
							CusMode2.setText("Low");
						}
					}
				}
				else if (step == 3) {
					String id = rs_getAirC.getString("EID");
					ma3.setText(id);
					manufacture3.setText(rs_getAirCts.getString("EMANUFACTURE"));
					Room3.setText(rs_getAirCts.getString("EROOM"));
					if (status == 1) {
						onORoff3.setSelected(true);
						CusMode3.setText("Low");
					}
					else if (status == 2) {
						onORoff3.setSelected(true);
						CusMode3.setText("Medium");
					}
					else if (status == 3) {
						onORoff3.setSelected(true);
						CusMode3.setText("High");
					}
					else {
						onORoff3.setSelected(true);
						CusMode3.setText("OFF");
					}
					roomTemp3.setText(rs_getAirC.getString("TEMPROOM"));
					tempTarget3.setText(rs_getAirC.getString("TEMPTARGET"));
					Humidity3.setText(String.valueOf(humi));
					pm25_3.setText(rs_getAirC.getString("PM25"));
					int tempLech = rs_getAirC.getInt("TEMPTARGET")-rs_getAirC.getInt("TEMPROOM");
					if(autoMode3.isSelected()) {
						if (rs_getAirC.getInt("TEMPROOM") >= 6) {
					    	swapMode.swap(3, id, rs_getAirCts.getFloat("CAPACITYH"));
					    	CusMode3.setText("High");
						}
						else if (tempLech < 6 && tempLech >= 2) {
							swapMode.swap(2, id, rs_getAirCts.getFloat("CAPACITYN"));
							CusMode3.setText("Medium");
						}
						else {
							swapMode.swap(1, id, rs_getAirCts.getFloat("CAPACITYL"));
							CusMode3.setText("Low");
						}
					}
					
				}
				else {
					String id = rs_getAirC.getString("EID");
					ma4.setText(id);
					ma4.setText(rs_getAirC.getString("EID"));
					manufacture4.setText(rs_getAirCts.getString("EMANUFACTURE"));
					Room4.setText(rs_getAirCts.getString("EROOM"));
					if (status == 1) {
						onORoff4.setSelected(true);
						CusMode4.setText("Low");
					}
					else if (status == 2) {
						onORoff4.setSelected(true);
						CusMode4.setText("Medium");
					}
					else if (status == 3) {
						onORoff4.setSelected(true);
						CusMode4.setText("High");
					}
					else {
						onORoff4.setSelected(true);
						CusMode4.setText("OFF");
					}
					roomTemp4.setText(rs_getAirC.getString("TEMPROOM"));
					tempTarget4.setText(rs_getAirC.getString("TEMPTARGET"));
					Humidity4.setText(String.valueOf(humi));
					pm25_4.setText(rs_getAirC.getString("PM25"));
					//autoMode1.selectedProperty();
					int tempLech = rs_getAirC.getInt("TEMPTARGET")-rs_getAirC.getInt("TEMPROOM");
					if(autoMode4.isSelected()) {
						if (rs_getAirC.getInt("TEMPROOM") >= 6) {
					    	swapMode.swap(3, id, rs_getAirCts.getFloat("CAPACITYH"));
					    	CusMode4.setText("High");
						}
						else if (tempLech < 6 && tempLech >= 2) {
							swapMode.swap(2, id, rs_getAirCts.getFloat("CAPACITYN"));
							CusMode4.setText("Medium");
						}
						else {
							swapMode.swap(1, id, rs_getAirCts.getFloat("CAPACITYL"));
							CusMode4.setText("Low");
						}
					}
					
				}
				step += 1;
			}
			Time.setText("Time: " + TimeNe.getTime());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
