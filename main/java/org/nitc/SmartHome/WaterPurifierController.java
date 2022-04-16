package org.nitc.SmartHome;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Controller.AddDivecs;
import Controller.ConnectDataBase;
import Controller.DataHandling;
import Controller.TimeNe;
import Model.waterPurifierModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class WaterPurifierController implements Initializable {
	waterPurifierModel may;
    @FXML
    private JFXButton About;

    @FXML
    private JFXButton Bill;

    @FXML
    private JFXButton Health;

    @FXML
    private JFXButton Home;

    @FXML
    private Text PH;

    @FXML
    private Text TDS;

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
    private Button filterB;

    @FXML
    private Text insurance;

    @FXML
    private Text loi;

    @FXML
    private JFXButton ma1;

    @FXML
    private Text manufacture;

    @FXML
    private Button piB;



    @FXML
    private Button statusB;

    @FXML
    void AboutClick(ActionEvent event) throws IOException {
    	App.setRoot("AboutPage");
    }

    @FXML
    void BillClick(ActionEvent event) throws IOException {
    	App.setRoot("BillPage");
    }

    @FXML
    void HealthClick(ActionEvent event) throws IOException {
    	App.setRoot("FamilyMemberPage");

    }

    @FXML
    void HomeClick(ActionEvent event) throws IOException {
    	App.setRoot("secondary");
    }

    @FXML
    void LocNganhClick(ActionEvent event) {

    }

    @FXML
    void Time7(MouseEvent event) {

    }

    @FXML
    void addDeviceC(ActionEvent event) throws Exception {
    	String maid = AddDivecs.addElectric(DataHandling.XuLyChu(addNameDevice.getText().toCharArray()), DataHandling.XuLyChu(addManu.getText().toCharArray()), DataHandling.XuLySoThayDoi(addRoom.getText().toCharArray()), DataHandling.XuLySo(addMedium.getText().toCharArray()), 0, 0, 0, 0, DataHandling.XuLySoThayDoi(addInsurance.getText().toCharArray()), 0, "TV");
    	AddDivecs.addWaterPurifier(maid);
    	System.out.println("nnnnn");
    	App.setRoot("WWPage");
    }

    @FXML
    void filterC(ActionEvent event) {

    }

    @FXML
    void piC(ActionEvent event) {

    }

    @FXML
    void statusC(ActionEvent event) {

    }

    @FXML
    private Text room;
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("FfFF");
		Connection con;
		try {
			con = ConnectDataBase.openConnection();
			String sql_getAirC = "SELECT EID, TDS, PH, LOI FROM WATERPURIFIER";
			PreparedStatement ps_getAirC = con.prepareStatement(sql_getAirC);
			System.out.println("HET");
			ResultSet rs_getAirC = ps_getAirC.executeQuery();
			int step = 1;
			System.out.println("HHH");
			while (step != 2 && rs_getAirC.next()) {
				con = ConnectDataBase.openConnection();
				String sql_getAirCts = "SELECT EROOM, EMANUFACTURE, EINSURANCE, CAPACITYN, ESTATUS FROM ELECTRICDIVECS WHERE EID = ?";
				PreparedStatement ps_getAirCts = con.prepareStatement(sql_getAirCts);
				ps_getAirCts.setString(1, rs_getAirC.getString("EID"));
				ResultSet rs_getAirCts = ps_getAirCts.executeQuery();
				rs_getAirCts.next();
				int status = rs_getAirCts.getInt("ESTATUS");
				if (step == 1) {
					may = new waterPurifierModel (rs_getAirC.getString("EID"), rs_getAirCts.getString("EMANUFACTURE"), rs_getAirCts.getInt("EROOM"), rs_getAirCts.getFloat("CAPACITYN"), rs_getAirCts.getInt("EINSURANCE"), rs_getAirC.getFloat("PH"), rs_getAirC.getFloat("TDS"), rs_getAirC.getInt("LOI"));
					ma1.setText(may.getName());
					manufacture.setText(may.getManufacture());
					room.setText(String.valueOf("Phòng: "+ may.getRoom()));
					loi.setText(String.valueOf("Số lõi: " + may.getLoi()));
					insurance.setText(String.valueOf("Bảo hành: "+ may.getInsurance()+ " năm"));
					PH.setText(String.valueOf("PH: "+ may.getPH()));
					TDS.setText(String.valueOf("TDS: " + may.getWaterQuality()));
					statusB.setStyle("-fx-base: #4CAF50;");
					float tds = may.getWaterQuality();
					if (tds <= 150) {
						piB.setStyle("-fx-base: #4CAF50;");
					}
					else if (tds <= 350) {
						piB.setStyle("-fx-base: #FFFF00;");
					}
					else {
						piB.setStyle("-fx-base: #D50100;");
					}
					
					if ( may.getInsurance() <= 1) {
						filterB.setStyle("-fx-base: #D50100;");
					}
					else {
						filterB.setStyle("-fx-base: #D50100;");
					}
				}
			}
			Time.setText("Time: " + TimeNe.getTime());

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//package org.nitc.SmartHome;
//
//import com.jfoenix.controls.JFXButton;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.text.Text;
//
//public class WaterPurifierController {
//
//    @FXML
//    private JFXButton About;
//
//    @FXML
//    private JFXButton Bill;
//
//    @FXML
//    private JFXButton Health;
//
//    @FXML
//    private JFXButton Home;
//
//    @FXML
//    private Text PH;
//
//    @FXML
//    private Text TDS;
//
//    @FXML
//    private Text Time;
//
//    @FXML
//    private Button addDeviceB;
//
//    @FXML
//    private TextField addInsurance;
//
//    @FXML
//    private TextField addLow;
//
//    @FXML
//    private TextField addManu;
//
//    @FXML
//    private TextField addMedium;
//
//    @FXML
//    private TextField addNameDevice;
//
//    @FXML
//    private TextField addRoom;
//
//    @FXML
//    private Button filterB;
//
//    @FXML
//    private Text insurance;
//
//    @FXML
//    private Text loi;
//
//    @FXML
//    private JFXButton ma1;
//
//    @FXML
//    private Text manufacture;
//
//    @FXML
//    private Button piB;
//
//    @FXML
//    private Text room;
//
//    @FXML
//    private Button statusB;
//
//    @FXML
//    void AboutClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void BillClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void HealthClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void HomeClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void LocNganhClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void Time7(MouseEvent event) {
//
//    }
//
//    @FXML
//    void addDeviceC(ActionEvent event) {
//
//    }
//
//    @FXML
//    void filterC(ActionEvent event) {
//
//    }
//
//    @FXML
//    void piC(ActionEvent event) {
//
//    }
//
//    @FXML
//    void statusC(ActionEvent event) {
//
//    }
//
//}
